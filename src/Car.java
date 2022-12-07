public class Car {
    private String brand;
    private String model;
    private double engineVolume;
    private String colour;
    private int year;
    private String country;


    public Car(String brand, String model, double engineVolume, String colour, int year, String country) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
        this.colour = colour;
        this.year = year;
        this.country = country;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    void info(){
        System.out.println(brand + " "+getModel() + ", сборка в: "+getCountry()+ ", цвет кузова: "+getColour()+ ", объем двигателя: "
                +getEngineVolume()+ ", год выпуска: "+getYear());
    }
}
