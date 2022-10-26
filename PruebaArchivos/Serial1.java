import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;

public class Serial1{
    public static void main(String[] args) {
        FileOutputStream fos = null;
        ObjectOutputStream salida = null;
        Persona p;

        try {
            fos = new FileOutputStream("datosSerial.dat");
            salida = new ObjectOutputStream(fos);

            p = new Persona("123A", "Oscar", 22);
            salida.writeObject(p);

            p = new Persona("456B", "Karina", 33);
            salida.writeObject(p);

            p = new Persona("789C", "Pedro", 44);
            salida.writeObject(p);
        } catch (FileNotFoundException e) {
            System.out.println("1 "+ e.getMessage());
        } catch (IOException e) {
            System.out.println("2 "+ e.getMessage());
        } finally{
            try {
                if(fos != null){
                    fos.close();
                }
                if(salida != null){
                    salida.close();
                }                
            } catch (IOException e) {
                System.out.println("3 "+ e.getMessage());
            }
        }

    }
}