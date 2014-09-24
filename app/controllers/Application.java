package controllers;

import models.User;
import org.jongo.MongoCollection;
import play.*;
import play.mvc.*;
import play.data.Form;
import play.data.validation.Constraints;

import views.html.*;

public class Application extends Controller {

    public static Result index() {
        MongoCollection users = User.users();
        User user = new User("James");
        user.insert();
        return ok(index.render("Your new application is ready."));
    }

}
