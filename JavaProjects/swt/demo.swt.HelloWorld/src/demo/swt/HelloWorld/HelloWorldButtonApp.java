package demo.swt.HelloWorld;

import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public class HelloWorldButtonApp {

	public HelloWorldButtonApp() {
		super();
		Display display = new Display();
		
		Shell shell = new Shell(display);
		shell.setText("Hello world!");
		shell.setSize(400,400);
		shell.setVisible(true);
		//Composite panel = new Composite(shell,0);
		Button button = new Button(shell,0);
		button.setText("Click me!");
		button.setBounds(50,50,50,50);
		while(!shell.isDisposed()) {
			if(!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	
}
