package demo.swt.HelloWorld;

import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

import in.ltts.swt.Application;

public class Program {

	public static void main(String args[]) {
		System.out.println("Hello world");
		
		
		Application app = Application.instance;
		app.getShell();
		
		app.run();
		//HelloWorldButtonApp hwd = new HelloWorldButtonApp();
	}
}
