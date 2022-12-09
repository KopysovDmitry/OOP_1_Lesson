package Transport;

import java.time.LocalDate;

public class Car {
    private final String brand;
    private final String model;
    private double engineVolume;
    private String colour;
    private final int year;
    private final String country;

    private String transmission;

    private final String body;

    private final String number;

    private final int seats;

    boolean summerTyres;

    private Key key;

    private Insurance insurance;

    public Car(String brand,
               String model,
               double engineVolume,
               String colour,
               int year,
               String country,
               String transmission,
               String body,
               String number,
               int seats,
               boolean summerTyres
               ) {

        if (brand != null && !brand.isEmpty() && !brand.isBlank()){
            this.brand = brand;
        } else {
            this.brand = "Default";
        }
        if (model != null && !model.isEmpty() && !model.isBlank()){
            this.model = model;
        } else {
            this.model = "Default";
        }
        if (engineVolume != 0){
            this.engineVolume = engineVolume;
        }else {
            this.engineVolume = 2000;
        }
        if (colour != null && !colour.isEmpty() && !colour.isBlank()){
            this.colour = colour;
        } else {
            this.colour = "Default";
        }
        if (year !=0 || year >2000){
            this.year = year;
        }else {
            this.year = 2000;
        }
        if (country != null && !country.isEmpty() && !country.isBlank()){
            this.country = country;
        } else {
            this.country = "Default";
        }
        if (transmission != null && !transmission.isEmpty() && !transmission.isBlank()){
            this.transmission = transmission;
        } else {
            this.transmission = "Default";
        }
        if (body != null && !body.isEmpty() && !body.isBlank()){
            this.body = body;
        } else {
            this.body = "Default";
        }
        if (number != null && !number.isEmpty() && !number.isBlank()){
            this.number = number;
        } else {
            this.number = "x000x000";
        }
        if (seats <5){
            seats = 5;
        }
        this.seats = seats;


        this.key = new Key(false,false);
        this.insurance = new Insurance(null,5000,null);
    }

    public String getBody() {
        return body;
    }

    public String getNumber() {
        return number;
    }

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        if (key ==null){
            key = new Key(false,false);
        }
        this.key = key;
    }

    public Insurance getInsurance() {
        return insurance;
    }

    public void setInsurance(Insurance insurance) {
        if (insurance == null) {
            insurance = new Insurance(null,5000,null);
        }
        this.insurance = insurance;
    }

    public String getBrand() {
        return brand;
    }

    /*public void setBrand(String brand) {
    }*/

    public String getModel() {
        return model;
    }

    /*public void setModel(String model) {
    }*/

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
    }
    public String getColour() {
        return colour;
    }
    public void setColour(String colour) {
    }
    public int getYear() {
        return year;
    }
    public String getCountry() {
        return country;
    }
    /*public void setCountry(String country) {
    }*/
    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {

    }

    public String getBodyTip() {
        return body;
    }

    /*public void setBody(String body) {
    }*/

    public String getnumber() {
        return number;
    }

    /* public void setnumber(String number) {
    }*/

    public int getAmountSeats() {
       return seats;
    }

    /*public void setAmountSeats(int amountSeats) {
        this.amountSeats = amountSeats;
    }*/

    public int getSeats() {
        return seats;
    }



    public boolean isSummerTyres() {
        return summerTyres;
    }

    public void setSummerTyres(boolean summerTyres) {
        this.summerTyres = summerTyres;
    }
    public void changeTires(){
        setSummerTyres(!summerTyres);
    }
    public boolean isValidNumber(){
        boolean result = true;
        result = result && number.length()==9;
        result = result && Character.isLetter(number.charAt(0));
        result = result && Character.isDigit(number.charAt(1));
        result = result && Character.isDigit(number.charAt(2));
        result = result && Character.isDigit(number.charAt(3));
        result = result && Character.isLetter(number.charAt(4));
        result = result && Character.isLetter(number.charAt(5));
        result = result && Character.isDigit(number.charAt(6));
        result = result && Character.isDigit(number.charAt(7));
        result = result && Character.isDigit(number.charAt(8));
        return result;
    }
    /*void info(){
        System.out.println(brand + " "+getModel() + ", сборка в: "+getCountry()+ ", цвет кузова: "+getColour()+ ", объем двигателя: "
                +getEngineVolume()+ ", год выпуска: "+getYear()+" ");
    }*/

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume +
                ", colour='" + colour + '\'' +
                ", year=" + year +
                ", country='" + country + '\'' +
                ", transmission='" + transmission + '\'' +
                ", body='" + body + '\'' +
                ", number='" + number + '\'' +
                ", seats=" + seats +
                ", summerTyres=" + summerTyres +
                ", key=" + key +
                ", insurance=" + insurance +
                '}';
    }

    public void print(){
        System.out.println(this);
    }



    public static class Key{
        private final boolean remoteRun;
        private final boolean withautKeyAccess;

        public Key(boolean remoteRun, boolean withautKeyAccess) {
            this.remoteRun = remoteRun;
            this.withautKeyAccess = withautKeyAccess;
        }

        public boolean isRemoteRun() {
            return remoteRun;
        }

        public boolean isWithautKeyAccess() {
            return withautKeyAccess;
        }

        @Override
        public String toString() {
            return "Key{" +
                    "remoteRun=" + remoteRun +
                    ", withautKeyAccess=" + withautKeyAccess +
                    '}';
        }
    }
    public static class Insurance {
        private final LocalDate expireDate;
        private final int cost;
        private final String number;

        public Insurance(LocalDate expireDate, int cost, String number) {
            if (expireDate == null){
                expireDate = LocalDate.now().plusDays(365);
            }
            this.expireDate = expireDate;
            if (cost<=0){
                cost= 5_000;
            }
            this.cost = cost;
            if (number==null || number.isEmpty() || number.isBlank()){
                number = "AAABBBCCC";
            }
            this.number = number;
        }
        public void printCheckExpired(){
            boolean expiried = expireDate.isAfter(LocalDate.now());
         if (expiried){
             System.out.println("Страховка просорочена");
         }
        }
        public void printCheckNumber(){
            boolean correct = number.length() ==9;
            if (!correct) {
                System.out.println("Номер не верный");
            }
        }

        public LocalDate getExpireDate() {
            return expireDate;
        }

        public int getCost() {
            return cost;
        }

        public String getNumber() {
            return number;
        }

        @Override
        public String toString() {
            return "Insurance{" +
                    "expireDate=" + expireDate +
                    ", cost=" + cost +
                    ", number='" + number + '\'' +
                    '}';
        }
    }
}
