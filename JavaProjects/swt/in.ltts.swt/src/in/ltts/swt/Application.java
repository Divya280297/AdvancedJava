package in.ltts.swt;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public class Application {

	Shell shell;
	Display display;
	
	public static final Application instance = new Application();
	
	
	public void run() {
	while(!shell.isDisposed()) {
		if(!display.readAndDispatch()) {
			display.sleep();
		}
	}
	}

	public Application() {
		super();
		shell = new Shell();
		display = new Display();
	}

	public Shell getShell() {
		return shell;
	}

	public void setShell(Shell shell) {
		this.shell = shell;
	}

	public Display getDisplay() {
		return display;
	}

	public void setDisplay(Display display) {
		this.display = display;
	}
}
