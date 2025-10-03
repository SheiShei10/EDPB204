import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SequentialFile <T extends SequenciaFileReader> {
    private File file;
    private Scanner scan;;
    private String separator;

    public SequentialFile(String fileName, String separator) throws FileNotFoundException {
        this.file = new File(fileName);
        this.separator = separator;
        this.scan = new Scanner(file);
    }

    public void read(T t){
        String[] data = scan.nextLine().split(separator);
        t.readData(data);
    }

    public void abrirFichero(String fileName, String separator) throws FileNotFoundException {
        file = new File(fileName);
        scan = new Scanner(fileName);
        this.separator = separator;   
    }

    public void saltarLinea(){
        scan.nextLine();
    }

    public void cerrar(){
        scan.close();
    }

    public boolean finalFichero(){
        return !scan.hasNextLine();
    }

}