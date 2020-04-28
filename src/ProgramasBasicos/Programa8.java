
package ProgramasBasicos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Programa8 {

   
    public static void main(String[] args) {
        // TODO code application logic here
    }
    public void programa8()
            throws IOException 
        { 
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in)); 
        String ssueldo1,ssueldo2,ssueldo3; 
        double sueldo1,sueldo2,sueldo3; 
        System.out.println("ingrese el valor del primer salario"); 
        ssueldo1=bf.readLine(); 
        sueldo1 =Double.parseDouble(ssueldo1); 
        System.out.println("ingrese el valor del segundo salario"); 
        ssueldo2=bf.readLine(); 
        sueldo2 =Double.parseDouble(ssueldo2); 
        System.out.println("ingrese el valor del tercer salario"); 
        ssueldo3=bf.readLine(); 
        sueldo3 =Double.parseDouble(ssueldo3); 

        sueldo1=(sueldo1*0.10)+sueldo1;
        sueldo2=(sueldo2*0.12)+sueldo2;
        sueldo3=(sueldo3*0.15)+sueldo3;

        System.out.println("El valor del sueldo 1  con el aumento es\t" +sueldo1); 
        System.out.println("El valor del sueldo 2  con el aumento es\t" +sueldo2); 
        System.out.println("El valor del sueldo 3  con el aumento es\t" +sueldo3); 
        Febuntux.Programas_Basicos basicos = new Febuntux.Programas_Basicos();
        basicos.setVisible(true);
    }
}
