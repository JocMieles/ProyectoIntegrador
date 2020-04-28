
package ProgramasBasicos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Programa7 {

    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    public void programa7()
            throws IOException 
    { 
        BufferedReader bf=new BufferedReader (new InputStreamReader(System.in)); 
        String nom,grup,scal1,scal2,scal3,scal4,scal5; 
        float cal1,cal2,cal3,cal4,cal5,promedio; 
        System.out.println("Cual es su nombre"); 
        nom=bf.readLine(); 
        System.out.println("Cual es su grupo"); 
        grup=bf.readLine(); 
        System.out.println("Cual es la primer nota"); 
        scal1=bf.readLine(); 
        cal1=Float.parseFloat(scal1); 
        System.out.println("Cual es la segunda nota"); 
        scal2=bf.readLine(); 
        cal2=Float.parseFloat(scal2); 
        System.out.println("Cual es la tercer nota"); 
        scal3=bf.readLine(); 
        cal3=Float.parseFloat(scal3); 
        System.out.println("Cual es la cuarta nota"); 
        scal4=bf.readLine(); 
        cal4=Float.parseFloat(scal4); 
        System.out.println("cual es la quinta nota"); 
        scal5=bf.readLine(); 
        cal5=Float.parseFloat(scal5); 
        promedio=(cal1+cal2+cal3+cal4+cal5)/5; 
        System.out.println("su nombre es\t"+nom); 
        System.out.println("su grupo es\t"+grup); 
        System.out.println("su promedio es\t"+promedio); 
        
        Febuntux.Programas_Basicos basicos = new Febuntux.Programas_Basicos();
        basicos.setVisible(true);
    }
}
