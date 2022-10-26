import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;

public class Serial2{
    public static void main(String[] args) {
        FileInputStream fis = null;
        ObjectInputStream entrada = null;
        Persona p;

        try {
            fis = new FileInputStream("datosSerial.dat");
            entrada = new ObjectInputStream(fis);

            p = (Persona) entrada.readObject();
            System.out.println(p.getNif()+" "+p.getNombre()+" "+p.getEdad());

            p = (Persona) entrada.readObject();
            System.out.println(p.getNif()+" "+p.getNombre()+" "+p.getEdad());

            p = (Persona) entrada.readObject();
            System.out.println(p.getNif()+" "+p.getNombre()+" "+p.getEdad());

        } catch (FileNotFoundException e) {
            System.out.println("1 "+ e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("2 "+ e.getMessage());
        } catch (IOException e) {
            System.out.println("3 "+ e.getMessage());
        } finally{
            try {
                if(fis != null){
                    fis.close();
                }
                if(entrada != null){
                    entrada.close();
                }                
            } catch (IOException e) {
                System.out.println("3 "+ e.getMessage());
            }
        }

    }
}