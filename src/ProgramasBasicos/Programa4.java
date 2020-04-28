
package ProgramasBasicos;


public class Programa4 {

   
    public static void main(String[] args) {
        // TODO code application logic here
    }
    public void programa4(){
        String v1,v2,v3,v4,v5;
        v1="1";
        v2="2";
        v3="3";
        v4="4";
        v5=v1;
        v1=v4;
        v4=v5;
        v5=v2;
        v2=v3;
        v3=v5;
        
        System.out.println("variable 1\t"+v1);
        System.out.println("variable 2\t"+v2);
        System.out.println("variable 3\t"+v3);
        System.out.println("variable 4\t"+v4);
        Febuntux.Programas_Basicos basicos = new Febuntux.Programas_Basicos();
        basicos.setVisible(true);
    }
}
