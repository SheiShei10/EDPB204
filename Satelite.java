import java.time.LocalDateTime;
//import SequentialFileReader;


public class Satelite implements SequenciaFileReader {
    private String name;
    private String id;
    private LocalDateTime epoch;
    private double meanMotion;
    private double eccentricity;
    private double inclination;
    private double raan;
    private double argPerige;
    

    public Satelite(String name, String id, LocalDateTime epoch, double meanMotion, double eccentricity, double inclination, double raan, double argPerige) {
        this.name = name;
        this.id = id;
        this.epoch = epoch;
        this.meanMotion = meanMotion;
        this.eccentricity = eccentricity;
        this.inclination = inclination;
        this.raan = raan;
        this.argPerige = argPerige;
        
    }

    public Satelite(){
        
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getId(){
        return id;
    }

    
    public void setId(String id){
        this.id = id;
    }

    public LocalDateTime getEpoch(){
        return epoch;
    }

    public void setEpoch(LocalDateTime epoch){
        this.epoch = epoch;
    }

    public double getEccentricity(){
        return eccentricity;
    }

    public void setEccentricity(double eccentricity){
        this.eccentricity = eccentricity;
    }

    public double getMeanMotion(){
        return meanMotion;
    }

    public void setMeanMotion(double meanMotion){
        this.meanMotion = meanMotion;
    }


    public double getInclination(){
        return inclination;
    }

    public void setInclinacion(double inclination){
        this.inclination = inclination;
    }

    public double getRaan(){
        return raan;
    }

    public void setRaan(double raan){
        this.raan = raan;
    }

    public double getArgPerige(){
        return argPerige;
    }

    public void setArgPerigeo(double argPerige){
        this.argPerige = argPerige;
    }

    @Override
    public void readData(String[] data){
        this.name = data[0];
        this.id = data[1];
        this.epoch = LocalDateTime.parse(data[2]);  
        this.meanMotion = Double.parseDouble(data[3]);
        this.eccentricity = Double.parseDouble(data[4]);
        this.inclination = Double.parseDouble(data[5]);
        this.raan = Double.parseDouble(data[6]);
        this.argPerige = Double.parseDouble(data[7]);
    }

    @Override
    public String toString(){
        return "Satelite [name=" + name + ", id=" + id + ", epoch=" + epoch + ", meanMotion=" + meanMotion + ", eccentricity=" + eccentricity + ", inclination=" + inclination + ", raan=" + raan + ", argPerige=" + argPerige + "]";
    }
    
}
