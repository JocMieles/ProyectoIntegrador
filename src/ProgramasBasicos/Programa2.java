
package ProgramasBasicos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Programa2 {

    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    public void programa2()
        throws IOException
    {
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        String nombre,apellido,direccion,telefono;
        System.out.println("Cual es su nombre");
        nombre=bf.readLine();
        System.out.println("Cual es su apellido");
        apellido=bf.readLine();
        System.out.println("Cual es su direccion");
        direccion=bf.readLine();
        System.out.println("Cual es su telefono");
        telefono=bf.readLine();
        System.out.println("su telefono es \t"+telefono);
        System.out.println("su direccion es \t"+direccion);
        System.out.println("su apellido es\t"+apellido);
        System.out.println("su nombre es \t"+nombre);
        Febuntux.Programas_Basicos basicos = new Febuntux.Programas_Basicos();
        basicos.setVisible(true);
    }
}
