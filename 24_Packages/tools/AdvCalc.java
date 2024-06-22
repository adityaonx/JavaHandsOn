//Create package first
//need package tools; imported 
package tools;

//To access nested package use current package name then called package name
import tools.cal.Calc;


//Add public in class to be accessed from other dir!
public class AdvCalc extends Calc{
    
    //Add public in method to be accessed from other dir!
    public int mul( int n1, int n2){
        return n1*n2;
    }
    
    public int div( int n1, int n2){
        return n1/n2;
    }
}