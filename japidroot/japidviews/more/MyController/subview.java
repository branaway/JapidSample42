package japidviews.more.MyController;
import java.util.*;
import java.io.*;
import cn.bran.japid.tags.Each;
import japidviews._layouts.*;
import play.mvc.Http.Context.Implicit;
import models.*;
import play.i18n.Lang;
import play.data.Form;
import play.data.Form.Field;
import play.mvc.Http.Request;
import japidviews.*;
import play.mvc.Http.Response;
import play.mvc.Http.Session;
import play.mvc.Http.Flash;
import play.data.validation.Validation;
import java.util.*;
import static cn.bran.japid.util.WebUtils.*;
import japidviews._tags.*;
import controllers.*;
//
// NOTE: This file was generated from: japidviews/more/MyController/subview.html
// Change to this file will be lost next time the template file is compiled.
//
public class subview extends superview
{
	public static final String sourceTemplate = "japidviews/more/MyController/subview.html";
	{
		putHeader("Content-Type", "text/html; charset=utf-8");
		setContentType("text/html; charset=utf-8");
	}

// - add implicit fields with Play
boolean hasHttpContext = play.mvc.Http.Context.current.get() != null ? true : false;

	final Request request = hasHttpContext? Implicit.request() : null;
	final Response response = hasHttpContext ? Implicit.response() : null;
	final Session session = hasHttpContext ? Implicit.session() : null;
	final Flash flash = hasHttpContext ? Implicit.flash() : null;
	final Lang lang = hasHttpContext ? Implicit.lang() : null;
	final play.Play _play = new play.Play(); 

// - end of implicit fields with Play 


	public subview() {
		super(null);
	}
	public subview(StringBuilder out) {
		super(out);
	}
/* based on https://github.com/branaway/Japid/issues/12
 */
	public static final String[] argNames = new String[] {/* args of the template*/"s",  };
	public static final String[] argTypes = new String[] {/* arg types of the template*/"String",  };
	public static final Object[] argDefaults= new Object[] {null, };
	public static java.lang.reflect.Method renderMethod = getRenderMethod(japidviews.more.MyController.subview.class);

	{
		setRenderMethod(renderMethod);
		setArgNames(argNames);
		setArgTypes(argTypes);
		setArgDefaults(argDefaults);
		setSourceTemplate(sourceTemplate);
	}
////// end of named args stuff

	private String s; // line 2
	public cn.bran.japid.template.RenderResult render(String s) {
		this.s = s;
		long __t = -1;
		try {super.layout();} catch (RuntimeException e) { super.handleException(e);} // line 2
		return new cn.bran.japid.template.RenderResultPartial(getHeaders(), getOut(), __t, actionRunners, sourceTemplate);
	}

	public static cn.bran.japid.template.RenderResult apply(String s) {
		return new subview().render(s);
	}

	@Override protected void doLayout() {
		beginDoLayout(sourceTemplate);
//------
;// line 1
;// line 2
		// line 4
		;// line 4
		// line 5
		p("\n" + 
"\n" + 
"hello ");// line 5
		p(s);// line 8
		p("\n");// line 8
		final japidviews.more.MyController._tags.taggy _japidviews_more_MyController__tags_taggy2 = new japidviews.more.MyController._tags.taggy(getOut()); _japidviews_more_MyController__tags_taggy2.setActionRunners(getActionRunners()).setOut(getOut()); _japidviews_more_MyController__tags_taggy2.render(s); // line 10// line 10
		p(" ");// line 10
		
		endDoLayout(sourceTemplate);
	}

	@Override protected void title() {
		p("my title from subview");;
	}
	@Override protected void side() {
		p("my side bar");;
	}
}