package demo.swt.taskManager;

import org.eclipse.swt.widgets.Shell;

import in.ltts.swt.Application;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Application app=Application.instance;
		Shell shell=app.getShell();
		
		new AppUiBuilder(shell).build();
		
		
		
		app.run();
	}

}
