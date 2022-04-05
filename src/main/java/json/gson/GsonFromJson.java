package json.gson;

import com.google.gson.Gson;

public class GsonFromJson {

    public static void main(String[] args) {

        String json_string = "{\"firstName\":\"Tom\", \"lastName\": \"Broody\"}";

        Gson gson = new Gson();
        User user = gson.fromJson(json_string, User.class);

        System.out.println(user);
    }
}
