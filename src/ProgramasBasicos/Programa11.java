package ProgramasBasicos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Programa11 {

    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    public void programa11()
            throws IOException 
    { 
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in)); 
        String svemedicam; 
        long vemedicam,descu,vfinal; 
        System.out.println("cual es el precio del medicamento"); 
        svemedicam=bf.readLine(); 
        vemedicam =Long.parseLong(svemedicam); 
        descu= vemedicam *10/100; 
        vfinal = vemedicam -descu; 
        System.out.println("su descuento es\t" +descu); 
        System.out.println("el precio final es \t" +vfinal);  
        Febuntux.Programas_Basicos basicos = new Febuntux.Programas_Basicos();
        basicos.setVisible(true);
    }
}
