import java.io.FileNotFoundException;


public class principal {
    public static void main(String[] args) {
        try{
            SequentialFile<Satelite> sf = new SequentialFile<Satelite> ("weather.csv", ",");
            sf.saltarLinea();
            while(!sf.finalFichero()){
                Satelite sat= new Satelite();
                sf.read(sat);
                
                if(sat.getMeanMotion() <= 10){
                    System.out.println(sat);
                }
                
            }
            sf.cerrar();
        } catch (FileNotFoundException e1) {
            e1.printStackTrace();
        }
    }
    
}
