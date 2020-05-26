package com.ltts.calculator;

import java.awt.Button;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends Frame implements ActionListener{

	public Calculator() {
		createUI();
	}
	
	Button add,sub,multiplication,divide,equal,decimal,prefix,exit;
	TextField resultTextField;
	Button b,b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17;
	Panel p;
	GridLayout g;
	Frame f;
	private void createUI() {
		f = new Frame("Calculator");
		f.setLayout(new FlowLayout());
		p = new Panel();
		this.setTitle("Calculator");
		exit=new Button("Exit");
		resultTextField=new TextField(20);
		exit.setPreferredSize(new Dimension(450,35));
		exit.addActionListener(new ExitAppHandler());
		
		b1 = new Button("7");
	       
        b2 = new Button("8");
       
        b3 = new Button("9");
       
        b4 = new Button("%");
       
        b5 = new Button("4");
       
        b6 = new Button("5");
       
        b7 = new Button("6");
       
        b8 = new Button("X");
       
        b9 = new Button("1");
     
        b10 = new Button("2");
       
        b11 = new Button("3");
     
        b12 = new Button("-");
     
        b13 = new Button("+/-");
     
        b14 = new Button("0");
       
        b15 = new Button(".");
       
        b16 = new Button("+");
       
        b17 = new Button("=");
        
        b = new Button("Exit");
        b.setPreferredSize(new Dimension(260,30));
        f.add(b);
        b.addActionListener(this);
       
        resultTextField = new TextField(20);
        f.add(resultTextField);
       
       
       
        g = new GridLayout(5,5,10,10);
        p.setLayout(g);
        p.add(b1);p.add(b2);p.add(b3);p.add(b4);p.add(b5);p.add(b6);p.add(b7);p.add(b8);p.add(b9);
        p.add(b10);p.add(b11);p.add(b12);p.add(b13);p.add(b14);p.add(b15);p.add(b16);p.add(b17);
       
       
       
        f.add(p);
        f.setSize(300,300);	
        f.setVisible(true);
	}
	  public void actionPerformed(ActionEvent e)
	    {
	        f.dispose();
	    }
}
