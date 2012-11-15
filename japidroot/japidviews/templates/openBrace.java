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
// NOTE: This file was generated from: japidviews/templates/openBrace.html
// Change to this file will be lost next time the template file is compiled.
//
public class openBrace extends cn.bran.play.JapidTemplateBase
{
	public static final String sourceTemplate = "japidviews/templates/openBrace.html";
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


	public openBrace() {
		super(null);
	}
	public openBrace(StringBuilder out) {
		super(out);
	}
/* based on https://github.com/branaway/Japid/issues/12
 */
	public static final String[] argNames = new String[] {/* args of the template*/ };
	public static final String[] argTypes = new String[] {/* arg types of the template*/ };
	public static final Object[] argDefaults= new Object[] { };
	public static java.lang.reflect.Method renderMethod = getRenderMethod(japidviews.templates.openBrace.class);

	{
		setRenderMethod(renderMethod);
		setArgNames(argNames);
		setArgTypes(argTypes);
		setArgDefaults(argDefaults);
		setSourceTemplate(sourceTemplate);
	}
////// end of named args stuff

	public cn.bran.japid.template.RenderResult render() {
		long __t = -1;
		try {super.layout();} catch (RuntimeException e) { super.handleException(e);} 
		return new cn.bran.japid.template.RenderResultPartial(getHeaders(), getOut(), __t, actionRunners, sourceTemplate);
	}

	public static cn.bran.japid.template.RenderResult apply() {
		return new openBrace().render();
	}

	@Override protected void doLayout() {
		beginDoLayout(sourceTemplate);
//------
p("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n" + 
"<html>\n" + 
"<head>\n" + 
"<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n" + 
"<title>Insert title here</title>\n" + 
"</head>\n" + 
"<body>\n" + 
"<p>hello</p>\n");// line 1
		int i = 3;// line 9
if(asBoolean(true)) {// line 10
    while (i-- > 0) {// line 11
		p("        <p>in while ");// line 11
		p(i);// line 12
		p("</p>\n" + 
"    ");// line 12
		}// line 13
		p("    <p>good2</p>\n");// line 13
		}// line 15
		p("\n" + 
"<p>\n");// line 15
		for(i =0; i < 4; i++){// line 18
		p("    ");// line 18
		p(i);// line 19
		p(", \n");// line 19
		}// line 20
		p("<p/>\n" + 
"<p>good22</p>\n" + 
"\n");// line 20
		if (true) {// line 24
		p("    <p>good 3</p>\n");// line 24
		}// line 26
		p("<p/>\n" + 
"the result is ");// line 26
		if(asBoolean(true)) {// line 28
		p("got you!");// line 28
		}// line 28
		p(".\n" + 
"</body>\n" + 
"</html>");// line 28
		
		endDoLayout(sourceTemplate);
	}

}