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
        fb.createClient("EAA4cK0cc65YBAITZBC82OZC56ZBUqV6ZA6UHcltuWt72YkR7DUSmSJZCIK8CUyZA4gHHlFN5IQ0CdFguuNZCBv8VxHl47lYpbcqwk29vH339XZC1NzbcfvYzXMFk64XGM39JoTEYZBIuFU2xiZASoQhZCQNL3jP3zkSFTxKLQtcr030GGyhVi6BsVAfr3P6cy13o4gZD");
        fb.getMyInfo();
    }
}

