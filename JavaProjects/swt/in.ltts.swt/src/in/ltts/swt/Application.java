package in.ltts.swt;

import org.eclipse.swt.graphics.Rectangle;
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
	public Application center() {
		return center(shell);
	}
	public Application center(Shell shell) {
		//let us find the size of the display;
		Rectangle screen= display.getBounds();
		//System.out.println("screen size is "+screenArea.width+"x"+screenArea.height);
		
		Rectangle window=shell.getBounds();
		
		int x=(screen.width-window.width)/2;
		int y=(screen.height-window.height)/2;
		
		shell.setLocation(x, y);
				
		return this;
	}
public Application build(UiBuilder builder) {
		
		builder.build(shell);
		return this;
	}
	
	public Application setTitle(String title) {
		shell.setText(title);
		return this;
	}
}
