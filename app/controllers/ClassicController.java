package controllers;

import play.mvc.Controller;
import play.mvc.Result;

public class ClassicController extends Controller {

    public static Result index() {
        return ok();
    }

}
