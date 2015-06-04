package application;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class Calculator {

	public static String calc(String expression) {
		ScriptEngineManager factory = new ScriptEngineManager();
		// create a JavaScript engine
		ScriptEngine engine = factory.getEngineByName("JavaScript");
		// evaluate JavaScript code from String
		try {
			String sResult = String.valueOf(engine.eval(expression));
			return sResult;
		} catch (ScriptException e) {
			e.printStackTrace();
		}
		return "";
	}
	
	
	public static void main(String[] args) {
		System.out.println(calc("86.8/4"));
	}

}
