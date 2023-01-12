import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;
import javaapplication1.JavaApplication1.*;
import tokenizer.*;
import ast.*;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class JavaApplication1 {

  

    public static void main(String[] args) throws TokenizerException, ScriptException {
        Singelton singelton1= Singelton.GetInstance(); // Create obj Singelton
        Singelton singelton2= Singelton.GetInstance(); // Clone
        singelton1.addOne(); //was 0 became 1   so as singelton2 
        singelton2.addOne(); //was 1 became 0
        
        Singelton singelton3= Singelton.GetInstance(); // Clone again but with value of 1
        singelton3.addOne(); //was 1 became 2   so as singelton2 and singelton1

        /*
         * now value of singelton1 is 2;
         *     value of singelton2 is 2;
         *     value of singelton3 is 2;
         */

         /*
          * We can use those objects in different classes
          */
     }
    
}


public class Singelton{
    int count;
    private static Singelton instance=null;//=new Singelton();
    private Singelton(){   count=0;     }
    public static Singelton GetInstance(){
        if (instance==null) instance= new Singelton();
        return instance;
    }
    public void addOne(){
        count++;
    }
}

