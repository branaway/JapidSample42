package japidviews.Application;
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
// NOTE: This file was generated from: japidviews/Application/authorPanel.html
// Change to this file will be lost next time the template file is compiled.
//
public class authorPanel extends cn.bran.play.JapidTemplateBase
{
	public static final String sourceTemplate = "japidviews/Application/authorPanel.html";
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


	public authorPanel() {
		super(null);
	}
	public authorPanel(StringBuilder out) {
		super(out);
	}
/* based on https://github.com/branaway/Japid/issues/12
 */
	public static final String[] argNames = new String[] {/* args of the template*/"a",  };
	public static final String[] argTypes = new String[] {/* arg types of the template*/"models.japidsample.Author",  };
	public static final Object[] argDefaults= new Object[] {null, };
	public static java.lang.reflect.Method renderMethod = getRenderMethod(japidviews.Application.authorPanel.class);

	{
		setRenderMethod(renderMethod);
		setArgNames(argNames);
		setArgTypes(argTypes);
		setArgDefaults(argDefaults);
		setSourceTemplate(sourceTemplate);
	}
////// end of named args stuff

	private models.japidsample.Author a; // line 1
	public cn.bran.japid.template.RenderResult render(models.japidsample.Author a) {
		this.a = a;
		long __t = -1;
		try {super.layout();} catch (RuntimeException e) { super.handleException(e);} // line 1
		return new cn.bran.japid.template.RenderResultPartial(getHeaders(), getOut(), __t, actionRunners, sourceTemplate);
	}

	public static cn.bran.japid.template.RenderResult apply(models.japidsample.Author a) {
		return new authorPanel().render(a);
	}

	@Override protected void doLayout() {
		beginDoLayout(sourceTemplate);
//------
;// line 1
		p("\n" + 
"<p>author name: ");// line 1
		p(a.name);// line 3
		p("</p>\n" + 
"<p>his birthdate: ");// line 3
		p(a.birthDate);// line 4
		p("</p>\n" + 
"<p>and his is a '");// line 4
		p(a.getGender());// line 5
		p("'</p>\n" + 
"    ");// line 5
		final SampleTag _SampleTag0 = new SampleTag(getOut()); _SampleTag0.setActionRunners(getActionRunners()).setOut(getOut()); _SampleTag0.render("end"); // line 6// line 6
		p("    ");// line 6
		
		endDoLayout(sourceTemplate);
	}

}