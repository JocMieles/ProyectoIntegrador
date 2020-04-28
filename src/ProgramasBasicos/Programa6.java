
package ProgramasBasicos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Programa6 {

    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    public void programa6()
        throws IOException
    {
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        String snum1,snum2;
        int num1,num2,suma,resta,multi,divi;
        System.out.println("Cual es el primer numero");
        snum1=bf.readLine();
        num1=Integer.parseInt(snum1);
        System.out.println("Cual es el segundo numero");
        snum2=bf.readLine();
        num2=Integer.parseInt(snum2);
        suma=num1+num2;
        resta=num1-num2;
        multi=num1*num2;
        divi=num1/num2;
        System.out.println("el resultado de la suma es \t"+suma);
        System.out.println("el resultado de la resta es \t"+resta);
        System.out.println("el resultado de la multiplicacion es \t"+multi);
        System.out.println("el resultado de la division es \t"+divi);
        Febuntux.Programas_Basicos basicos = new Febuntux.Programas_Basicos();
        basicos.setVisible(true);
    }
}
