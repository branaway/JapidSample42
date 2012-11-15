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
// NOTE: This file was generated from: japidviews/templates/callPicka.html
// Change to this file will be lost next time the template file is compiled.
//
public class callPicka extends cn.bran.play.JapidTemplateBase
{
	public static final String sourceTemplate = "japidviews/templates/callPicka.html";
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


	public callPicka() {
		super(null);
	}
	public callPicka(StringBuilder out) {
		super(out);
	}
/* based on https://github.com/branaway/Japid/issues/12
 */
	public static final String[] argNames = new String[] {/* args of the template*/ };
	public static final String[] argTypes = new String[] {/* arg types of the template*/ };
	public static final Object[] argDefaults= new Object[] { };
	public static java.lang.reflect.Method renderMethod = getRenderMethod(japidviews.templates.callPicka.class);

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
		 __t = System.nanoTime();
		try {super.layout();} catch (RuntimeException e) { super.handleException(e);} 
     	String __l = "" + (System.nanoTime() - __t) / 100000;
		int __len = __l.length();
		__l = __l.substring(0, __len - 1) + "." +  __l.substring(__len - 1);

		System.out.println("[callPicka] rendering time(ms): " + __l);
		return new cn.bran.japid.template.RenderResultPartial(getHeaders(), getOut(), __t, actionRunners, sourceTemplate);
	}

	public static cn.bran.japid.template.RenderResult apply() {
		return new callPicka().render();
	}

	@Override protected void doLayout() {
		beginDoLayout(sourceTemplate);
//------
;// line 1
		p("\n" + 
"<p>invoke a simple tag</p>\n" + 
"\n" + 
"Another simple tag aTag, which locates in the same directory as this template:\n" + 
"\n");// line 1
		p("\n" + 
"<h3>first let's define something in a Java code block. </h3>\n" + 
"\n");// line 8
		 List<String> strings = new ArrayList<String>(){{add("u");add("m");add("everyone");}};// line 11
		p("\n");// line 11
		final aTag _aTag0 = new aTag(getOut()); _aTag0.setActionRunners(getActionRunners()).setOut(getOut()); _aTag0.render(strings); // line 13// line 13
		p("\n" + 
"again: ");// line 13
		final aTag _aTag1 = new aTag(getOut()); _aTag1.setActionRunners(getActionRunners()).setOut(getOut()); _aTag1.render(strings); // line 15// line 15
		p("\n");// line 15
		final picka _picka2 = new picka(getOut()); _picka2.setActionRunners(getActionRunners()).setOut(getOut()); _picka2.render(// line 17
"aa", "b" + "c", new picka.DoBody<String>(){ // line 17
public void render(final String r) { // line 17
// line 17
		p("    the tag chosen: ");// line 17
		p(r);// line 18
		p("\n" + 
"    <p>and we can call a tag recursively? Yes we can!</p>\n" + 
"    \n" + 
"    ");// line 18
		final SampleTag _SampleTag3 = new SampleTag(getOut()); _SampleTag3.setActionRunners(getActionRunners()).setOut(getOut()); _SampleTag3.render(r); // line 21// line 21
		p("    \n" + 
"    <p>yes we can!</p>\n");// line 21
		
}

StringBuilder oriBuffer;
@Override
public void setBuffer(StringBuilder sb) {
	oriBuffer = getOut();
	setOut(sb);
}

@Override
public void resetBuffer() {
	setOut(oriBuffer);
}

}
);// line 17
		p("\n" + 
"\n" + 
"<h3>\n" + 
"note: the picka tag is defined in the japidviews/_tags directory\n" + 
"</h3>\n" + 
"\n" + 
"<p>\n" + 
"we can call without the body part:\n" + 
"\n");// line 24
		final picka _picka4 = new picka(getOut()); _picka4.setActionRunners(getActionRunners()).setOut(getOut()); _picka4.render("cc","dd"); // line 34// line 34
		p("\n" + 
"or with named args\n" + 
"\n");// line 34
		final picka _picka5 = new picka(getOut()); _picka5.setActionRunners(getActionRunners()).setOut(getOut()); _picka5.render(named("a", "aa"), named("b", "bb")); // line 38// line 38
		p("\n" + 
"</p>\n" + 
"<p>\n" + 
"Or using the full path of the tag starting with japidview\n" + 
"</p>\n" + 
"\n");// line 38
		final japidviews.templates.aTag _japidviews_templates_aTag6 = new japidviews.templates.aTag(getOut()); _japidviews_templates_aTag6.setActionRunners(getActionRunners()).setOut(getOut()); _japidviews_templates_aTag6.render(strings); // line 45// line 45
		p("\n" + 
"<p>You can use \".\" instead of \"/\" on the path:</p>\n" + 
"\n");// line 45
		final japidviews.templates.aTag _japidviews_templates_aTag7 = new japidviews.templates.aTag(getOut()); _japidviews_templates_aTag7.setActionRunners(getActionRunners()).setOut(getOut()); _japidviews_templates_aTag7.render(strings); // line 49// line 49
		;// line 49
		
		endDoLayout(sourceTemplate);
	}

}