import Transport.Car;

public class Main {
    public static void main(String[] args) {

        Human maxim = new Human("Максим", 1988, "Минск", "бренд-менеджер");
        Human anna = new Human("Аня", 1993, "Москва", "методист образовательных программ");
        Human katja = new Human("Катя", 1992, "Калининград", "продакт-менеджер");
        Human artiem = new Human("Артем", 1995, "Москва", "директор по развитию бизнеса");
        Human vladimir = new Human("Владимир", 2001, "Казань", " ");

        maxim.greetings();
        anna.greetings();
        katja.greetings();
        artiem.greetings();
        vladimir.greetings();

        System.out.println("");

        Car lada = new Car("Lada", "Granta", 1.7, "Yelow", 2015, "Russia",
                "", "", null, 0, true);
        Car audi = new Car("Audi", "A8", 3.0, "Black", 2020, "Germany",
                null, null , null,2,false);
        Car bmw = new Car("Bmw", "Z8", 3.0, "Black", 2021, "Germany",
                null, null, null,0,true);
        Car kia = new Car("Kia", "Sportage", 2.4, "Red", 2018, "South Korea",
                null, null, null,2,true);
        Car hunday = new Car("Hunday", "Avante", 1.6, "Orange", 2016,
                "South Korea", null, null, null,3,true);

        lada.print();
        audi.print();
        bmw.print();
        kia.print();
        hunday.print();

        System.out.println(" ");

        Flower rose = new Flower("Роза обыкновенная", "Голландия", 35.59, 0);
        Flower hrizantema = new Flower("Хризантема", "", 15, 5);
        Flower pion = new Flower("Пион из Англии", "  ", 69.9, 1);
        Flower gipsophila = new Flower("Гипсофила", "Турция", 15.9, 10);

        rose.flowerInfo();
        hrizantema.flowerInfo();
        pion.flowerInfo();
        gipsophila.flowerInfo();


        Bouquet bouquet = new Bouquet(
                new Flower[]{rose,rose,rose,hrizantema,hrizantema,hrizantema,hrizantema,hrizantema,gipsophila}
        );
        bouquet.bouquetInfo();

        }
    }
