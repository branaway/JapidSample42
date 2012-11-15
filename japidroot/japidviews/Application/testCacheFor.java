package japidviews.Application;
import java.util.*;
import java.io.*;
import cn.bran.japid.tags.Each;
import cn.bran.japid.template.ActionRunner;
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
// NOTE: This file was generated from: japidviews/Application/testCacheFor.html
// Change to this file will be lost next time the template file is compiled.
//
public class testCacheFor extends cn.bran.play.JapidTemplateBase
{
	public static final String sourceTemplate = "japidviews/Application/testCacheFor.html";
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


	public testCacheFor() {
		super(null);
	}
	public testCacheFor(StringBuilder out) {
		super(out);
	}
/* based on https://github.com/branaway/Japid/issues/12
 */
	public static final String[] argNames = new String[] {/* args of the template*/"a",  };
	public static final String[] argTypes = new String[] {/* arg types of the template*/"String",  };
	public static final Object[] argDefaults= new Object[] {null, };
	public static java.lang.reflect.Method renderMethod = getRenderMethod(japidviews.Application.testCacheFor.class);

	{
		setRenderMethod(renderMethod);
		setArgNames(argNames);
		setArgTypes(argTypes);
		setArgDefaults(argDefaults);
		setSourceTemplate(sourceTemplate);
	}
////// end of named args stuff

	private String a; // line 1
	public cn.bran.japid.template.RenderResult render(String a) {
		this.a = a;
		long __t = -1;
		try {super.layout();} catch (RuntimeException e) { super.handleException(e);} // line 1
		return new cn.bran.japid.template.RenderResultPartial(getHeaders(), getOut(), __t, actionRunners, sourceTemplate);
	}

	public static cn.bran.japid.template.RenderResult apply(String a) {
		return new testCacheFor().render(a);
	}

	@Override protected void doLayout() {
		beginDoLayout(sourceTemplate);
//------
;// line 1
		p("\n" + 
"<html>\n" + 
"\n" + 
"<body>\n" + 
"<p>heheh</p>\n" + 
"\n" + 
"	<p>hello ");// line 1
		p(a);// line 8
		p(", ");// line 8
				actionRunners.put(getOut().length(), new cn.bran.play.CacheablePlayActionRunner("", Application.class, "every3", "") {
			@Override
			public cn.bran.play.JapidResult runPlayAction()  {
				return (cn.bran.play.JapidResult)Application.every3(); // line 8
			}
		}); p("\n");// line 8
		p(",</p> \n" + 
"	<p>directly, now seconds is ");// line 8
				actionRunners.put(getOut().length(), new cn.bran.play.CacheablePlayActionRunner("", Application.class, "seconds", "") {
			@Override
			public cn.bran.play.JapidResult runPlayAction()  {
				return (cn.bran.play.JapidResult)Application.seconds(); // line 9
			}
		}); p("\n");// line 9
		p("</p>\n" + 
"\n" + 
"</body>\n" + 
"</html>");// line 9
		
		endDoLayout(sourceTemplate);
	}

}