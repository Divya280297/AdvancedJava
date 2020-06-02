package demo09.calculatorapp;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import demo09.calculatorapp.models.DisplayChangeListener;

public class AdditionListener{
	DisplayChangeListener displayChangeListner;
	Double result;
	String operator;
	public AdditionListener(Double first) {
		result = result+first;
		displayChangeListner.updateDisplay(Double.toString(result));
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}
	public String getOperator() {
		return this.operator;
	}
	
	public void result(Double first,Double second) {
		displayChangeListner.updateDisplay(Double.toString(first));
	}

}
