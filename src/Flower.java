import java.text.DecimalFormat;

public class Flower {

    private final String  flowerName;
    private final String country;
    private final double cost;
    private int LifeSpan;

    public int getLifeSpan() {
        return LifeSpan;
    }

    public void setLifeSpan(int lifeSpan) {
        LifeSpan = lifeSpan;
    }

    public String getFlowerName() {
        return flowerName;
    }

    public String getCountry() {
        return country;
    }

    public double getCost() {
        return cost;
    }
    DecimalFormat df = new DecimalFormat(".00");

    Flower(String flowerName, String country, double cost, int lifeSpan) {
        if (flowerName != null && !flowerName.isEmpty() && !flowerName.isBlank()) {
            this.flowerName = flowerName;
        } else {
            this.flowerName = "Тип цветка не указан";
        }
        if (country != null && !country.isEmpty() && !country.isBlank()) {
            this.country = country;
        } else {
            this.country = "Россия";
        }
        if (cost <= 0.0) {
            this.cost = 1.0;
        } else {
            this.cost = cost;
        }
        if (lifeSpan == 0) {
            this.LifeSpan = 3;
        } else {
            this.LifeSpan = lifeSpan;
        }

    }
    void flowerInfo(){
        System.out.println("Название цветка: "+flowerName+ ", Страна-производитель: " + country+", Cтоимость: "+ df.format(cost)+ ", Срок стояния: "+getLifeSpan());
        //System.out.printf("стоимость: "+ cost);
        //System.out.print("Срок стояния: "+getLifeSpan());

    }


}
