package japidviews._tags;
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
// NOTE: This file was generated from: japidviews/_tags/dummyTag.html
// Change to this file will be lost next time the template file is compiled.
//
public class dummyTag extends cn.bran.play.JapidTemplateBase
{
	public static final String sourceTemplate = "japidviews/_tags/dummyTag.html";
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


	public dummyTag() {
		super(null);
	}
	public dummyTag(StringBuilder out) {
		super(out);
	}
/* based on https://github.com/branaway/Japid/issues/12
 */
	public static final String[] argNames = new String[] {/* args of the template*/"a",  };
	public static final String[] argTypes = new String[] {/* arg types of the template*/"String",  };
	public static final Object[] argDefaults= new Object[] {null, };
	public static java.lang.reflect.Method renderMethod = getRenderMethod(japidviews._tags.dummyTag.class);

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
		 __t = System.nanoTime();
		try {super.layout();} catch (RuntimeException e) { super.handleException(e);} // line 1
     	String __l = "" + (System.nanoTime() - __t) / 100000;
		int __len = __l.length();
		__l = __l.substring(0, __len - 1) + "." +  __l.substring(__len - 1);

		System.out.println("[dummyTag] rendering time(ms): " + __l);
		return new cn.bran.japid.template.RenderResultPartial(getHeaders(), getOut(), __t, actionRunners, sourceTemplate);
	}

	public static cn.bran.japid.template.RenderResult apply(String a) {
		return new dummyTag().render(a);
	}

	@Override protected void doLayout() {
		beginDoLayout(sourceTemplate);
//------
;// line 1
		p("\n");// line 1
		p("\n" + 
"\n");// line 3
		p("\n" + 
"Hello from DummyTag: ");// line 5
		p(a);// line 7
		p("!\n" + 
"\n");// line 7
		
		endDoLayout(sourceTemplate);
	}

}