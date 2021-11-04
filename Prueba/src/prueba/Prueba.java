/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.f
 */
package prueba;

/**
 *
 * @author Carlos Atuesta 03
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double g=9.81;           //gravedad
        double rho_aire=1.225;    //Desnsidad aire
        double rho_agua=1000;    //Desnsidad agua
        double pi= Math.PI;      //Pi
        double r=0.1;            //Radio
        double m=2;
        double n=300;
        double tf=120;
        double h = (tf/n);
        
        //condiciones iniciales 
        double y=2000;
        double y_1=0;
        double y_2=0;
        double rho=rho_aire;
        
        System.out.println(" Y                            | y'                            | y'' "   );  
        
        for(int i = 0; i <= n; i=i+1){
            if(y < 0 && rho != rho_agua){
                System.out.println("");
                System.out.println("ingresó al agua");
                System.out.println("");
                rho = rho_agua;
            }
           
           y_2 = -g + (0.2*rho*pi*Math.pow(r,2)*Math.pow(y_1,2))/m;
           y_1 = y_1 + h * y_2; 
           y = y + h * y_1;
           
            System.out.println(  "    " + y +  "           |     " + y_1 + "      |      " + y_2  );
        }
    }
    
}
