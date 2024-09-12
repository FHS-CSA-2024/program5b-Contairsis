
public class Car{
    private String carName;
    private int milesDriven;
    private int gallonsUsed;
    public Car(){
        carName = "";
        milesDriven = 0;
        gallonsUsed = 0;
    }
    public Car(String name, int miles, int gallons){
        carName = name;
        milesDriven = miles;
        gallonsUsed = gallons;
    }
    public String getName(){
        return carName;
    }
    public int getMiles(){
        return milesDriven;
    }
    public int getGallons(){
        return gallonsUsed;
    }
    public void setName(String name){
        carName = name;
    }
    public void setMiles(int miles){
        milesDriven = miles;
    }
    public void setGallons(int gallons){
        gallonsUsed = gallons;
    }
    public double calculateAverage(){
        double avg = milesDriven / (double)gallonsUsed;
        avg = (int)((avg + 0.05) * 10 ) / 10.0;
        return avg;
    }
    public String toString(){
        return carName + " averaged " + calculateAverage() + " m/g";
    }
}
