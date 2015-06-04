package application;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class Rechner {

	/*
	 * TODO return double
	 */
	public static String rechne(String expression) throws ExpressionException {

		try {// wir JavaScript nach Java 
			ScriptEngineManager manager = new ScriptEngineManager();
			ScriptEngine engine = manager.getEngineByName("JavaScript");
			Object obj = engine.eval(expression);//eval-> Ausdruck auswerten
			String result = String.valueOf(obj);// Object zu String 
			return result;
		} catch (ScriptException e) {
			System.out.println(e.getMessage());
			//e.printStackTrace();	
			throw new ExpressionException();
			
		}
	
	
		
	}
	
	/*
	 * Test
	 */
	public static void main(String[] args) {
	//	System.out.println(rechne("3?3+7"));
	}
}
