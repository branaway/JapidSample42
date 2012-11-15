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
// NOTE: This file was generated from: japidviews/templates/ImplicitObjects.html
// Change to this file will be lost next time the template file is compiled.
//
public class ImplicitObjects extends cn.bran.play.JapidTemplateBase
{
	public static final String sourceTemplate = "japidviews/templates/ImplicitObjects.html";
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


	public ImplicitObjects() {
		super(null);
	}
	public ImplicitObjects(StringBuilder out) {
		super(out);
	}
/* based on https://github.com/branaway/Japid/issues/12
 */
	public static final String[] argNames = new String[] {/* args of the template*/ };
	public static final String[] argTypes = new String[] {/* arg types of the template*/ };
	public static final Object[] argDefaults= new Object[] { };
	public static java.lang.reflect.Method renderMethod = getRenderMethod(japidviews.templates.ImplicitObjects.class);

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
		return new ImplicitObjects().render();
	}

	@Override protected void doLayout() {
		beginDoLayout(sourceTemplate);
//------
p("\n" + 
"\n" + 
"<p>request: ");// line 1
		p(request);// line 3
		p("</p>\n" + 
"<p>response: ");// line 3
		p(response);// line 4
		p("</p>\n" + 
"<p>flash: ");// line 4
		p(flash);// line 5
		p("</p>\n" + 
"<p>session: ");// line 5
		p(session);// line 6
		p("</p>\n" + 
"<p>play: ");// line 6
		p(_play);// line 7
		p("</p>");// line 7
		
		endDoLayout(sourceTemplate);
	}

}