package japidviews.templates;
import java.util.*;
import java.io.*;
import cn.bran.japid.tags.Each;
import	 	models.japidsample.Post;
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
// NOTE: This file was generated from: japidviews/templates/AllPost2.html
// Change to this file will be lost next time the template file is compiled.
//
public class AllPost2 extends Layout
{
	public static final String sourceTemplate = "japidviews/templates/AllPost2.html";
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


	public AllPost2() {
		super(null);
	}
	public AllPost2(StringBuilder out) {
		super(out);
	}
/* based on https://github.com/branaway/Japid/issues/12
 */
	public static final String[] argNames = new String[] {/* args of the template*/"blogTitle", "allPost",  };
	public static final String[] argTypes = new String[] {/* arg types of the template*/"String", "List<Post>",  };
	public static final Object[] argDefaults= new Object[] {null,null, };
	public static java.lang.reflect.Method renderMethod = getRenderMethod(japidviews.templates.AllPost2.class);

	{
		setRenderMethod(renderMethod);
		setArgNames(argNames);
		setArgTypes(argTypes);
		setArgDefaults(argDefaults);
		setSourceTemplate(sourceTemplate);
	}
////// end of named args stuff

	private String blogTitle; // line 3
	private List<Post> allPost; // line 3
	public cn.bran.japid.template.RenderResult render(String blogTitle,List<Post> allPost) {
		this.blogTitle = blogTitle;
		this.allPost = allPost;
		long __t = -1;
		try {super.layout();} catch (RuntimeException e) { super.handleException(e);} // line 3
		return new cn.bran.japid.template.RenderResultPartial(getHeaders(), getOut(), __t, actionRunners, sourceTemplate);
	}

	public static cn.bran.japid.template.RenderResult apply(String blogTitle,List<Post> allPost) {
		return new AllPost2().render(blogTitle, allPost);
	}

	@Override protected void doLayout() {
		beginDoLayout(sourceTemplate);
//------
;// line 1
p("\n");// line 3
		p("\n" + 
"\n");// line 5
		if (allPost.size() > 0 ) {// line 8
		p("	<p></p>\n" + 
"	");// line 8
		for (Post p: allPost) {// line 10
		p("	    ");// line 10
		final Display _Display1 = new Display(getOut()); _Display1.setActionRunners(getActionRunners()).setOut(getOut()); _Display1.render( // line 11
new Display.DoBody<String>(){ // line 11
public void render(final String title) { // line 11
// line 11
		p("			<p>The real title is: ");// line 11
		p(title);// line 12
		p(";</p>\n" + 
"	    ");// line 12
		
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
, named("post", p), named("as", "home"));// line 11
		p("	");// line 13
		}// line 14
} else {// line 15
		p("	<p>There is no post at this moment</p>\n");// line 15
		}// line 17
		p("\n");// line 17
		final Tag2 _Tag22 = new Tag2(getOut()); _Tag22.setActionRunners(getActionRunners()).setOut(getOut()); _Tag22.render(named("msg", blogTitle), named("age", 1000)); // line 19// line 19
		p("\n" + 
"<p>end of it</p>");// line 19
		
		endDoLayout(sourceTemplate);
	}

	@Override protected void title() {
		p("Home");;
	}
}