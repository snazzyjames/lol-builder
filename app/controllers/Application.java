package controllers;

import models.User;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.index;

import static play.data.Form.*;

public class Application extends Controller {

    final static Form<User> registerForm = form(User.class);

    public static Result index() {
        return ok(
            index.render(registerForm)
        );
    }

    public static Result register() {
        Form<User> userForm = form(User.class).bindFromRequest();
        return ok();
    }

}
