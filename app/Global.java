import cn.bran.japid.template.JapidRenderer;

public class Global extends JapidRenderer {
	@Override
	public void onStartJapid() {
		addImport("japidviews._layouts.*");
		addImport("japidviews._tags.*");
		setKeepJavaFiles(false);
	}
}