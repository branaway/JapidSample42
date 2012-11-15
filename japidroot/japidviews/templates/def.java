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
// NOTE: This file was generated from: japidviews/templates/def.html
// Change to this file will be lost next time the template file is compiled.
//
public class def extends defLayout
{
	public static final String sourceTemplate = "japidviews/templates/def.html";
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


	public def() {
		super(null);
	}
	public def(StringBuilder out) {
		super(out);
	}
/* based on https://github.com/branaway/Japid/issues/12
 */
	public static final String[] argNames = new String[] {/* args of the template*/ };
	public static final String[] argTypes = new String[] {/* arg types of the template*/ };
	public static final Object[] argDefaults= new Object[] { };
	public static java.lang.reflect.Method renderMethod = getRenderMethod(japidviews.templates.def.class);

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
		return new def().render();
	}

	@Override protected void doLayout() {
		beginDoLayout(sourceTemplate);
//------
;// line 1
		p("\n" + 
"<p>check 1</p>\n");// line 1
		p("\n" + 
"\n" + 
"\n");// line 4
		// line 7
		p("\n" + 
"<p>check 2</p>\n");// line 12
		// line 15
		p("<p>check 3</p>\n" + 
"\n");// line 18
		p("\n" + 
"\n");// line 21
		// line 23
		p("\n" + 
"\n" + 
"<p>check 4</p>\n");// line 26
		final dummyTag _dummyTag4 = new dummyTag(getOut()); _dummyTag4.setActionRunners(getActionRunners()).setOut(getOut()); _dummyTag4.render(get("bar")); // line 29// line 29
		p("\n" + 
"\n");// line 29
		p("<p>check 5</p>\n" + 
"\n");// line 31
		p(foo());// line 34
		p("\n" + 
"\n" + 
"<p>check 6</p>\n" + 
"\n");// line 34
		//japid compiler: artificial line to avoid being treated as a terminating line// line 38
		    String a = "";// line 39
		    a += "bssdfsdf";// line 40
		p("\n");// line 41
		if (a.length() > 0) {// line 42
      p(a);// line 43
    }// line 44
		p("\n");// line 44
		
		endDoLayout(sourceTemplate);
	}

public String foo2(String p) {
StringBuilder sb = new StringBuilder();
StringBuilder ori = getOut();
this.setOut(sb);
TreeMap<Integer, cn.bran.japid.template.ActionRunner> parentActionRunners = actionRunners;
actionRunners = new TreeMap<Integer, cn.bran.japid.template.ActionRunner>();
// line 7
		p("	<p>hi ");// line 7
		p(p);// line 8
		p("!,</p> \n" + 
"	<p>from ");// line 8
		p(request);// line 9
		p("</p>\n" + 
"	<p>OK you can call a tag:</p>\n" + 
"	");// line 9
		final dummyTag _dummyTag1 = new dummyTag(getOut()); _dummyTag1.setActionRunners(getActionRunners()).setOut(getOut()); _dummyTag1.render(p); // line 11// line 11

this.setOut(ori);
if (actionRunners.size() > 0) {
	StringBuilder sb2 = new StringBuilder();
	int segStart = 0;
	for (Map.Entry<Integer, cn.bran.japid.template.ActionRunner> arEntry : actionRunners.entrySet()) {
		int pos = arEntry.getKey();
		sb2.append(sb.substring(segStart, pos));
		segStart = pos;
		cn.bran.japid.template.ActionRunner a = arEntry.getValue();
		sb2.append(a.run().getContent().toString());
	}
	sb2.append(sb.substring(segStart));
	actionRunners = parentActionRunners;
	return sb2.toString();
} else {
	actionRunners = parentActionRunners;
	return sb.toString();
}
}
public String foo() {
StringBuilder sb = new StringBuilder();
StringBuilder ori = getOut();
this.setOut(sb);
TreeMap<Integer, cn.bran.japid.template.ActionRunner> parentActionRunners = actionRunners;
actionRunners = new TreeMap<Integer, cn.bran.japid.template.ActionRunner>();
// line 15
		p("	");// line 15
		String s = "hi there";// line 16
		p("	<p>foo hello ");// line 16
		p(foo2(s));// line 17
		p("</p>\n");// line 17
		
this.setOut(ori);
if (actionRunners.size() > 0) {
	StringBuilder sb2 = new StringBuilder();
	int segStart = 0;
	for (Map.Entry<Integer, cn.bran.japid.template.ActionRunner> arEntry : actionRunners.entrySet()) {
		int pos = arEntry.getKey();
		sb2.append(sb.substring(segStart, pos));
		segStart = pos;
		cn.bran.japid.template.ActionRunner a = arEntry.getValue();
		sb2.append(a.run().getContent().toString());
	}
	sb2.append(sb.substring(segStart));
	actionRunners = parentActionRunners;
	return sb2.toString();
} else {
	actionRunners = parentActionRunners;
	return sb.toString();
}
}
public String bar() {
StringBuilder sb = new StringBuilder();
StringBuilder ori = getOut();
this.setOut(sb);
TreeMap<Integer, cn.bran.japid.template.ActionRunner> parentActionRunners = actionRunners;
actionRunners = new TreeMap<Integer, cn.bran.japid.template.ActionRunner>();
// line 23
		p("\n" + 
"	");// line 23
		String s = "hi2";// line 24
		p("	<p>bar hi ");// line 24
		p(s);// line 25
		p("!</p>\n");// line 25
		
this.setOut(ori);
if (actionRunners.size() > 0) {
	StringBuilder sb2 = new StringBuilder();
	int segStart = 0;
	for (Map.Entry<Integer, cn.bran.japid.template.ActionRunner> arEntry : actionRunners.entrySet()) {
		int pos = arEntry.getKey();
		sb2.append(sb.substring(segStart, pos));
		segStart = pos;
		cn.bran.japid.template.ActionRunner a = arEntry.getValue();
		sb2.append(a.run().getContent().toString());
	}
	sb2.append(sb.substring(segStart));
	actionRunners = parentActionRunners;
	return sb2.toString();
} else {
	actionRunners = parentActionRunners;
	return sb.toString();
}
}
}