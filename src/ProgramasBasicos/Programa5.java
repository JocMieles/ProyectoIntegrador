
package ProgramasBasicos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Programa5 {

    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    public void programa5()
            throws IOException
    {
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        String sbase,saltura;
        double area,altura,base;
        System.out.println("Cual es la altura");
        saltura=bf.readLine();
        altura=Double.parseDouble(saltura);
        System.out.println("Cual es la Base");
        sbase=bf.readLine();
        base=Double.parseDouble(sbase);
                   
        area=(base*altura)/2;

        System.out.println("El area es \t"+area);
        Febuntux.Programas_Basicos basicos = new Febuntux.Programas_Basicos();
        basicos.setVisible(true);
    }
}
