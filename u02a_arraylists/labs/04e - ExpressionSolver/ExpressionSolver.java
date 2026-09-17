//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.ArrayList;
import static java.lang.Integer.*;

public class ExpressionSolver
{
	private ArrayList<String> expression;
	private String exp;
	private int solution;

	public ExpressionSolver(String s)
	{
		setExpression(s);
	}

	public void setExpression(String s)
	{
		expression = new ArrayList<String>();
		exp = s;
		for(int i=0; i<exp.length(); i++){
			String character = exp.substring(i, i+1);
			if(!character.equals(" ")){
				expression.add(character);
			}
		}
	}

	public void solveExpression()
	{
		solution = 0;
		while(expression.indexOf("*") != -1 || expression.indexOf("/") != -1){
			boolean found = false;
			for(int i=0; i<expression.size(); i++){
				String op = expression.get(i);
				if(op.equals("*") || op.equals("/")){
					int left = parseInt(expression.get(i-1));
					int right = parseInt(expression.get(i+1));
					if(op.equals("*")){
						solution = left * right;
					}
					else{
						solution = left / right;
					}
					expression.remove(i-1);
					expression.remove(i-1);
					expression.set(i-1, Integer.toString(solution));
					found = true;
					break;
				}
			}
			if(!found){
				break;
			}
		}
		while(expression.indexOf("+") != -1 || expression.indexOf("-") != -1){
			boolean found = false;
			for(int i=0; i<expression.size(); i++){
				String op = expression.get(i);
				if(op.equals("+") || op.equals("-")){
					int left = parseInt(expression.get(i-1));
					int right = parseInt(expression.get(i+1));
					if(op.equals("+")){
						solution = left + right;
					}
					else{
						solution = left - right;
					}
					expression.remove(i-1);
					expression.remove(i-1);
					expression.set(i-1, Integer.toString(solution));
					found = true;
					break;
				}
			}
			if(!found){
				break;
			}
		}
		if(expression.size() == 1){
			solution = parseInt(expression.get(0));
		}
	}

	public String toString( )
	{
		return exp + " = " + solution;
	}
}
