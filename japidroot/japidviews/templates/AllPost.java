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
// NOTE: This file was generated from: japidviews/templates/AllPost.html
// Change to this file will be lost next time the template file is compiled.
//
public class AllPost extends Layout
{
	public static final String sourceTemplate = "japidviews/templates/AllPost.html";
	{
		putHeader("Content-Type", "text/html; charset=utf-8");
		setContentType("text/html; charset=utf-8");
		setTraceFile(true);
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


	public AllPost() {
		super(null);
	}
	public AllPost(StringBuilder out) {
		super(out);
	}
/* based on https://github.com/branaway/Japid/issues/12
 */
	public static final String[] argNames = new String[] {/* args of the template*/"blogTitle", "allPost",  };
	public static final String[] argTypes = new String[] {/* arg types of the template*/"String", "List<Post>",  };
	public static final Object[] argDefaults= new Object[] {null,null, };
	public static java.lang.reflect.Method renderMethod = getRenderMethod(japidviews.templates.AllPost.class);

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
		 __t = System.nanoTime();
		try {super.layout();} catch (RuntimeException e) { super.handleException(e);} // line 3
     	String __l = "" + (System.nanoTime() - __t) / 100000;
		int __len = __l.length();
		__l = __l.substring(0, __len - 1) + "." +  __l.substring(__len - 1);

		System.out.println("[AllPost] rendering time(ms): " + __l);
		return new cn.bran.japid.template.RenderResultPartial(getHeaders(), getOut(), __t, actionRunners, sourceTemplate);
	}

	public static cn.bran.japid.template.RenderResult apply(String blogTitle,List<Post> allPost) {
		return new AllPost().render(blogTitle, allPost);
	}

	@Override protected void doLayout() {
		beginDoLayout(sourceTemplate);
//------
;// line 1
;// line 2
		p("\n" + 
"\n");// line 6
p("\n");// line 9
		p("\n");// line 11
		final Each _Each1 = new Each(getOut()); _Each1.setOut(getOut()); _Each1.render(// line 13
allPost, new Each.DoBody<Post>(){ // line 13
public void render(final Post p, final int _size, final int _index, final boolean _isOdd, final String _parity, final boolean _isFirst, final boolean _isLast) { // line 13
// line 13
		p("        ");// line 13
		p("\n" + 
"\n" + 
"	    ");// line 14
		final Display _Display2 = new Display(getOut()); _Display2.setActionRunners(getActionRunners()).setOut(getOut()); _Display2.render( // line 16
new Display.DoBody<String>(){ // line 16
public void render(final String title) { // line 16
// line 16
		p("		   The real title iiiis: ");// line 16
		p(title);// line 17
		p("\n" + 
"	    ");// line 17
		
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
, named("post", p), named("as", "home2"));// line 16

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
		p("\n");// line 19
		final Tag2 _Tag23 = new Tag2(getOut()); _Tag23.setActionRunners(getActionRunners()).setOut(getOut()); _Tag23.render(named("msg", blogTitle), named("age", 100)); // line 21// line 21
		p("\n" + 
"<p>cool</p>");// line 21
		
		endDoLayout(sourceTemplate);
	}

	@Override protected void title() {
		p( "Home: " + blogTitle);;
	}
}