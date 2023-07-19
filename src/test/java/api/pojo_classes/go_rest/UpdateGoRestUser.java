package api.pojo_classes.go_rest;

public class UpdateGoRestUser {


    /**
     * 1. First, crate POJO class called UpdateGoRestUser and create private name and email fields.
     * 2. Create getters and setters from those fields.
     * 3. After you are done, go back to our current test class, and create a UpdateGoRestUser object.
     * 4. And set values for name, and the email.
     * 5. Then serialize those objects to JSON body.
     * 6. Create a PUT API call, and provide the body.
     */


    /**
     * {
     *     "name": "",
     *     "email": ""

     * }
     */


    private String name;
    private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }




}
