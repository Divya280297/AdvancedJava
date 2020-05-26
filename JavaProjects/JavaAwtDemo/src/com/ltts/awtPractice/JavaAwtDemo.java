package com.ltts.awtPractice;

import java.awt.Button;
import java.awt.Frame;
import java.io.IOException;

public class JavaAwtDemo {

	public static void main(String args[]) throws IOException {
		Frame frame = new Frame("Hello world Awt!");
		frame.setSize(800,700);
		Button button = new Button("Click me!");
		
		frame.add(button);
		frame.setVisible(true);
		System.in.read();
		frame.dispose();
	}
}
