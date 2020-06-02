package demo09.calculatorapp;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import demo09.calculatorapp.models.ClearContentListener;

public class ClearContent extends Panel implements ActionListener{

	ClearContentListener clearContentListener;
	
	public ClearContentListener getClearContentListener() {
		return clearContentListener;
	}
	public void setClearContentListener(ClearContentListener clearContentListener) {
		this.clearContentListener = clearContentListener;
	}
	
	public ClearContent() {
		this.setLayout(new GridLayout(1,3));
		String [] values= { "C","AC","<-" };
		for(String value :values) {
			Button button=new Button(value);
			this.add(button);
			button.addActionListener(this);
	}
		setSize(350,100);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Button button=(Button) e.getSource();		
		String value=button.getLabel();
		System.out.println("value"+value);
		clearContentListener.clearContent(value);
		
	}
	

}
