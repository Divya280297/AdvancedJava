package demo.WindowListenerDemo.App;

import java.awt.Frame;

public class MyWindow extends Frame{
	public MyWindow(String title) {
		super(title);
		this.addWindowListener(new MyWindowListener());
	}
}
