package ProgramasBasicos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class Programa10 {

    
    
    public static void main(String[] args) {
        
    }
    public void programa10()
            throws IOException 
    { 
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in)); 
        String sparcial1,sparcial2,sparcial3; 
        double parcial1,parcial2,parcial3,nfinal; 
        System.out.println("ingrese la nota 1"); 
        sparcial1=bf.readLine(); 
        parcial1 =Double.parseDouble(sparcial1); 
        System.out.println("ingrese la nota 2"); 
        sparcial2=bf.readLine(); 
        parcial2 =Double.parseDouble(sparcial2);  
        System.out.println("ingrese la nota 3"); 
        sparcial3=bf.readLine(); 
        parcial3 =Double.parseDouble(sparcial3); ; 

        parcial1=(parcial1*0.30);
        parcial2=(parcial2*0.30);
        parcial3=(parcial3*0.40);
        nfinal=parcial1+parcial2+parcial3;


        System.out.println("Su nota final es\t" +nfinal); 
        Febuntux.Programas_Basicos basicos = new Febuntux.Programas_Basicos();
        basicos.setVisible(true);
    }
}
