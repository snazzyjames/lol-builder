package controllers;

import models.User;
import play.data.DynamicForm;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.index;

import java.util.Map;

import static play.data.Form.*;

public class Application extends Controller {

    final static Form<User> UserForm = form(User.class);

    public static Result index() {
        return ok(
            index.render(UserForm)
        );
    }

    public static Result register() {
        String email;
        String summonerName;
        String passwordHash;

        DynamicForm userForm = form().bindFromRequest();

        email = userForm.get("email");
        summonerName = userForm.get("summoner-name");
        passwordHash = User.generatePasswordHash(userForm.get("password"));

        User newUser = new User();
        newUser.insert(email,summonerName,passwordHash);

        return redirect("/user/home");
    }

    public static Result login(){
        return ok();
    }

}
