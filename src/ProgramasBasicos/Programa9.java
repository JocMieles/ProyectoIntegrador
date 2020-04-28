
package ProgramasBasicos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Programa9 {

   
    public static void main(String[] args) {
        // TODO code application logic here
    }
    public void programa9()
            throws IOException        
    { 
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));    
        String scantdep; 
        Long cantdep,interes, vfinal; 
        System.out.println("cual es su cantidad a depositar"); 
        scantdep=bf.readLine(); 
        cantdep=Long.parseLong(scantdep); 
        interes=cantdep*20/100; 
        vfinal=cantdep-interes; 
        System.out.println("el interes es de \t" +interes); 
        System.out.println("su cantidad final es \t" +vfinal); 
        Febuntux.Programas_Basicos basicos = new Febuntux.Programas_Basicos();
        basicos.setVisible(true);
    }
}
