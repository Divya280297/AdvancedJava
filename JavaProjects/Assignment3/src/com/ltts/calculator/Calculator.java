package com.ltts.calculator;

import java.awt.BorderLayout;
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
	Button b,b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,addButton,subButton,mulButton,divButton,equalButton,prefixButton,decimalButton;
	Panel p,p1;
	GridLayout g;
	Frame f;
	private void createUI() {
		f = new Frame("Calculator");
		f.setLayout(new BorderLayout());
		p = new Panel();
		p1 = new Panel();
		this.setTitle("Calculator");
		resultTextField=new TextField(20);
        f.add(resultTextField,BorderLayout.NORTH);
       
       
        b0 = new Button("0");
        b1 = new Button("1");
        b2 = new Button("2");
        b3 = new Button("3");
        b4 = new Button("4");
        b5 = new Button("5");
        b6 = new Button("6");
        b7 = new Button("7");
        b8 = new Button("8");
        b9 = new Button("9");
        prefixButton = new Button("+/-");
        decimalButton = new Button(".");
        addButton = new Button("+");
        subButton = new Button("-");
        mulButton = new Button("*");
        divButton = new Button("/");
        equalButton = new Button("=");
        
        g = new GridLayout(4,3);
        p.setLayout(g);
        p.add(b7);
        p.add(b8);
        p.add(b9);
        p.add(b4);
        p.add(b5);
        p.add(b6);
        p.add(b3);
        p.add(b2);
        p.add(b1);
        p.add(prefixButton);
        p.add(b0);
        p.add(decimalButton);
        p.setPreferredSize(new Dimension(200,300));
       
        GridLayout fl = new GridLayout(5,1,1,1);
        p1.setLayout(fl);
        p1.add(addButton);
        p1.add(subButton);
        p1.add(mulButton);
        p1.add(divButton);
        p1.add(equalButton);
        p1.setPreferredSize(new Dimension(100,300));
        
        f.add(p,BorderLayout.WEST);
        f.add(p1,BorderLayout.EAST);
        f.setSize(300,300);	
        f.setVisible(true);
	}
	  public void actionPerformed(ActionEvent e)
	    {
	        f.dispose();
	    }
}
