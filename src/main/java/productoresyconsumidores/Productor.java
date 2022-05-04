package productoresyconsumidores;
import java.util.Random;
public class Productor implements Runnable{
    Cola colaCompartida;
    public Productor(Cola cola){
            this.colaCompartida=cola;
    }
    public void run() {
    Random ran = new Random();
       while (true){
               int nxt=ran.nextInt(10);
               while (colaCompartida.encolar(nxt)==false){
                    	   try {
							Thread.sleep(ran.nextInt(3000));
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}		
               } /*Fin del while*/

               System.out.println("Productor encoló el numero:"+nxt);
       } /*Fin del while externo*/
    } /*Fin de run()*/
} /*Fin de la clase*/
