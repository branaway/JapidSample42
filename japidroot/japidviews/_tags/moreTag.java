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
// NOTE: This file was generated from: japidviews/_tags/moreTag.html
// Change to this file will be lost next time the template file is compiled.
//
public class moreTag extends cn.bran.play.JapidTemplateBase
{
	public static final String sourceTemplate = "japidviews/_tags/moreTag.html";
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


	public moreTag() {
		super(null);
	}
	public moreTag(StringBuilder out) {
		super(out);
	}
/* based on https://github.com/branaway/Japid/issues/12
 */
	public static final String[] argNames = new String[] {/* args of the template*/"s",  };
	public static final String[] argTypes = new String[] {/* arg types of the template*/"String",  };
	public static final Object[] argDefaults= new Object[] {null, };
	public static java.lang.reflect.Method renderMethod = getRenderMethod(japidviews._tags.moreTag.class);

	{
		setRenderMethod(renderMethod);
		setArgNames(argNames);
		setArgTypes(argTypes);
		setArgDefaults(argDefaults);
		setSourceTemplate(sourceTemplate);
	}
////// end of named args stuff

	{ setHasDoBody(); }
	private String s; // line 1
public cn.bran.japid.template.RenderResult render(DoBody body, cn.bran.japid.compiler.NamedArgRuntime... named) {
    Object[] args = buildArgs(named, body);
    try {return runRenderer(args);} catch(RuntimeException e) {handleException(e); throw e;} // line 1
}

	private DoBody body;
public static interface DoBody<A> {
		void render(A a);
		void setBuffer(StringBuilder sb);
		void resetBuffer();
}
<A> String renderBody(A a) {
		StringBuilder sb = new StringBuilder();
		if (body != null){
			body.setBuffer(sb);
			body.render( a);
			body.resetBuffer();
		}
		return sb.toString();
	}
	public cn.bran.japid.template.RenderResult render(String s, DoBody body) {
		this.body = body;
		this.s = s;
		long __t = -1;
		try {super.layout();} catch (RuntimeException e) { super.handleException(e);} // line 1
		return new cn.bran.japid.template.RenderResultPartial(getHeaders(), getOut(), __t, actionRunners, sourceTemplate);
	}
	public cn.bran.japid.template.RenderResult render(String s) {
		this.s = s;
		long __t = -1;
		try {super.layout();} catch (RuntimeException e) { super.handleException(e);} // line 1
		return new cn.bran.japid.template.RenderResultPartial(getHeaders(), getOut(), __t, actionRunners, sourceTemplate);
	}

	public static cn.bran.japid.template.RenderResult apply(String s) {
		return new moreTag().render(s);
	}

	@Override protected void doLayout() {
		beginDoLayout(sourceTemplate);
//------
;// line 1
		p("\n" + 
"<p/>\n" + 
"ok\n" + 
"\n" + 
"<p/>\n" + 
"\n");// line 1
		if (body != null){ body.setBuffer(getOut()); body.render(s); body.resetBuffer();}// line 8
		p("\n" + 
"<p/>\n" + 
"mmm\n");// line 8
		
		endDoLayout(sourceTemplate);
	}

}