import play.Application;
import play.GlobalSettings;
import cn.bran.japid.template.JapidRenderer;

public class Global extends GlobalSettings {
	/**
	 * 
	 */
	@Override
	public void onStart(Application app) {
		JapidRenderer.init(app);
		JapidRenderer.addImport("japidviews._layouts.*");
		JapidRenderer.addImport("japidviews._tags.*");

		// there are more customization you can do to Japid
		// JapidRenderer.setLogVerbose(true);
	}

	@Override
	public void onStop(Application app) {
		JapidRenderer.onStop(app);
		super.onStop(app);
	}

}