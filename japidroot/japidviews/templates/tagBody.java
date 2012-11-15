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
// NOTE: This file was generated from: japidviews/templates/tagBody.html
// Change to this file will be lost next time the template file is compiled.
//
public class tagBody extends cn.bran.play.JapidTemplateBase
{
	public static final String sourceTemplate = "japidviews/templates/tagBody.html";
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


	public tagBody() {
		super(null);
	}
	public tagBody(StringBuilder out) {
		super(out);
	}
/* based on https://github.com/branaway/Japid/issues/12
 */
	public static final String[] argNames = new String[] {/* args of the template*/ };
	public static final String[] argTypes = new String[] {/* arg types of the template*/ };
	public static final Object[] argDefaults= new Object[] { };
	public static java.lang.reflect.Method renderMethod = getRenderMethod(japidviews.templates.tagBody.class);

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
		return new tagBody().render();
	}

	@Override protected void doLayout() {
		beginDoLayout(sourceTemplate);
//------
p("\n" + 
"Note: the last | is the separator for the tag arguments and the call back parameters. \n" + 
"It must present even if the parameters are empty.\n" + 
"<p/>\n" + 
"before\n" + 
"\n" + 
"<p/>\n");// line 1
		final fooTag _fooTag0 = new fooTag(getOut()); _fooTag0.setActionRunners(getActionRunners()).setOut(getOut()); _fooTag0.render(// line 8
"hi", new fooTag.DoBody(){ // line 8
public void render() { // line 8
// line 8
    final String echo = "secret";// line 9
		p("\n" + 
"    well ");// line 9
		p(echo);// line 11
		p("\n" + 
"\n" + 
"	");// line 11
		final anotherTag _anotherTag1 = new anotherTag(getOut()); _anotherTag1.setActionRunners(getActionRunners()).setOut(getOut()); _anotherTag1.render(// line 13
echo, new anotherTag.DoBody<String>(){ // line 13
public void render(final String what) { // line 13
// line 13
		p("	    got ");// line 13
		p(what);// line 14
		p(" and ");// line 14
		p(echo);// line 14
		p("\n" + 
"		");// line 14
		final moreTag _moreTag2 = new moreTag(getOut()); _moreTag2.setActionRunners(getActionRunners()).setOut(getOut()); _moreTag2.render(// line 15
echo, new moreTag.DoBody<String>(){ // line 15
public void render(final String more) { // line 15
// line 15
		p("		   got ");// line 15
		p(what);// line 16
		p(" and ");// line 16
		p(echo);// line 16
		p(" and ");// line 16
		p(more);// line 16
		p("\n" + 
"		");// line 16
		
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
);// line 15
		p("	");// line 17
		
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
);// line 13

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
);// line 8
		p("<p/>\n" + 
"after");// line 19
		
		endDoLayout(sourceTemplate);
	}

}