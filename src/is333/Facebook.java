package is333;

import com.restfb.*;
import com.restfb.json.JsonObject;
import com.restfb.types.*;
import java.util.*;
import java.io.IOException;
public class Facebook {
    FacebookClient facebookClient = null;

    private void createClient(String token){
        this.facebookClient= new DefaultFacebookClient(token);
        System.out.println(this.facebookClient);
    }

    private void getMyInfo() {
        JsonObject results= facebookClient.fetchObjects(Arrays.asList("me"),
                JsonObject.class, Parameter.with("fields","name,id,home,birthday,email"));
        System.out.println(results);
    }
    public static void main(String[] args) {
        System.out.println("connecting to Facebook");
        Facebook fb = new Facebook();
        fb.createClient("EAA4cK0cc65YBAO2KT6x0ANgWtLDuNSWbnhheuNefum5k5ybrDizV9xhLfs3tY4w0JMbLWlFdKNUQm7x43vpZAZCZB78m9Rn2c5AutGCVaDPrGJy9rl6BwhDulnqgNZAU7opJdUgGmFiJTenG9E7Wmb4mikV85qT7G6RAbRce1hhjttPDO9ZCAat7GaZBDgmk33dRIUMG8Y8XBspPjMjJRkEP1L5A3FF8nHPMLZB3FYBZAQZDZD");
        fb.getMyInfo();
    }
}

