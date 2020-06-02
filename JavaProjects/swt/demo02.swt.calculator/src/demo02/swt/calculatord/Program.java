package demo02.swt.calculatord;

import in.ltts.swt.Application;

public class Program {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Application
				.instance
				.setTitle("Mixed Layout Demo")
				.build(new AppUiBuilder())
				.run();
	}
}
