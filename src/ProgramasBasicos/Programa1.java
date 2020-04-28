
package ProgramasBasicos;


public class Programa1 {

    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    public void programa1(){
        double a,b,c,d,e,f;
        a=30;
        b=4;
        c=a+(2*b);
        c=c+8;
        b=c-a;
        a=b+c;
        d=7+(c/3);
        e=(5-b)*3;
        f=(c*d)-(b/2);
        b=(f/b)*d;
        
        System.out.println("el valor de a es \t"+a);
        System.out.println("el valor de b es \t"+b);
        System.out.println("el valor de c es \t"+c);
        System.out.println("el valor de d es \t"+d);
        System.out.println("el valor de e es \t"+e);
        System.out.println("el valor de f es \t"+f);
        Febuntux.Programas_Basicos basicos = new Febuntux.Programas_Basicos();
        basicos.setVisible(true);
    }
    
}
