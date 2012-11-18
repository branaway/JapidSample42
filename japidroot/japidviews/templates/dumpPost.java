package japidviews.templates;
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
// NOTE: This file was generated from: japidviews/templates/dumpPost.html
// Change to this file will be lost next time the template file is compiled.
//
public class dumpPost extends cn.bran.play.JapidTemplateBase
{
	public static final String sourceTemplate = "japidviews/templates/dumpPost.html";
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


	public dumpPost() {
		super(null);
	}
	public dumpPost(StringBuilder out) {
		super(out);
	}
/* based on https://github.com/branaway/Japid/issues/12
 */
	public static final String[] argNames = new String[] {/* args of the template*/"f1", "f2", "body",  };
	public static final String[] argTypes = new String[] {/* arg types of the template*/"String", "String", "String",  };
	public static final Object[] argDefaults= new Object[] {null,null,null, };
	public static java.lang.reflect.Method renderMethod = getRenderMethod(japidviews.templates.dumpPost.class);

	{
		setRenderMethod(renderMethod);
		setArgNames(argNames);
		setArgTypes(argTypes);
		setArgDefaults(argDefaults);
		setSourceTemplate(sourceTemplate);
	}
////// end of named args stuff

	private String f1; // line 1
	private String f2; // line 1
	private String body; // line 1
	public cn.bran.japid.template.RenderResult render(String f1,String f2,String body) {
		this.f1 = f1;
		this.f2 = f2;
		this.body = body;
		long __t = -1;
		 __t = System.nanoTime();
		try {super.layout();} catch (RuntimeException e) { super.handleException(e);} // line 1
     	String __l = "" + (System.nanoTime() - __t) / 100000;
		int __len = __l.length();
		__l = __l.substring(0, __len - 1) + "." +  __l.substring(__len - 1);

		System.out.println("[dumpPost] rendering time(ms): " + __l);
		return new cn.bran.japid.template.RenderResultPartial(getHeaders(), getOut(), __t, actionRunners, sourceTemplate);
	}

	public static cn.bran.japid.template.RenderResult apply(String f1,String f2,String body) {
		return new dumpPost().render(f1, f2, body);
	}

	@Override protected void doLayout() {
		beginDoLayout(sourceTemplate);
//------
;// line 1
		p("\n" + 
"\n");// line 3
p("\n" + 
"<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n" + 
"<html>\n" + 
"<head>\n" + 
"<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n" + 
"<title>Security Token</title>\n" + 
"</head>\n" + 
"<body>\n" + 
"<p><a href=\"/\">back</a></p>\n" + 
"<p>there is a hidden field that is a token for authenticity of this submission: ");// line 6
		try { p(escape(authenticityToken())); } catch (NullPointerException npe) {}// line 16
		p("\n" + 
"</p>\n" + 
"<p>");// line 16
		try { p(flash.get("msg")); } catch (NullPointerException npe) {}// line 18
		p("</p>\n" + 
"<form method=\"POST\" action=\"/Application/dumpPost\">\n" + 
"	");// line 18
		try { p(authenticityToken()); } catch (NullPointerException npe) {}// line 20
		p("\n" + 
"	<input type=\"text\" width=\"30\" name=\"f1\" value=\"");// line 20
		try { p(f1); } catch (NullPointerException npe) {}// line 21
		p("\"/>\n" + 
"	<input type=\"text\" width=\"30\" name=\"f2\" value=\"");// line 21
		try { p(f2); } catch (NullPointerException npe) {}// line 22
		p("\"/>\n" + 
"	<input type=\"text\" width=\"50\" name=\"body\" value=\"");// line 22
		try { p(body); } catch (NullPointerException npe) {}// line 23
		p("\"/>\n" + 
"	<input type=\"submit\"/>\n" + 
"</form>\n" + 
"\n" + 
"</body>\n" + 
"</html>");// line 23
		
		endDoLayout(sourceTemplate);
	}

}