package controllers.more;
import java.util.Date;

import play.cache.Cached;
import play.mvc.Result;
import cn.bran.play.JapidController;

public class Portlets extends JapidController {

	@Cached(duration=20, key="")
	public static Result index() {
		return ok(renderJapid("a", "b"));
	}

	public static Result panel1(String a) {
		System.out.println("panel1 called");
		return renderJapid(a);
	}

	public static Result panel2(String b) {
		return renderJapid(b);
	}

	@Cached(duration=4, key = "")
	public static Result panel3(String whatever) {
		System.out.println("panel3 called");
		return renderText("<div><h3>" + new Date().getSeconds() + "</h3></div>");
	}
}
