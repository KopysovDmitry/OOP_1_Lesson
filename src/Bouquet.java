public class Bouquet {
    private final Flower[] flowers;

    public Bouquet(Flower[]flowers){
        this.flowers = flowers;
    }
    private double calculateCost(){
        double sum = 0;
        for (Flower flower:flowers) {
            sum += flower.getCost();
        }
        return sum;
    }
    private int calculateLifeSpan(){
        int minLiveSpan = Integer.MAX_VALUE;
        for (Flower flower:flowers){
            if (flower.getLifeSpan()<minLiveSpan){
                minLiveSpan=flower.getLifeSpan();
            }
        }
        return minLiveSpan;
    }

    public void bouquetInfo (){
        System.out.println(this);
    }

    @Override
    public String toString (){
        StringBuilder result = new StringBuilder("Соствав букета: ").append(("\n"));
        double sum = calculateCost();
        int minLiveSpan = calculateLifeSpan();
        for (Flower flower:flowers){
            result.append(flower).append("\n");
        }
        result.append("Срок стояния букета: ").append(minLiveSpan).append(" дн.").append("\n");
        result.append("Стоимость букета: ").append(String.format("%.2f",sum)).append(" руб.");
        return result.toString();
   }
}
