import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) {

        Human maxim = new Human("Максим",1988, "Минск", "бренд-менеджер");
        Human  anna = new Human("Аня",1993, "Москва", "методист образовательных программ");
        Human katja = new Human("Катя",1992, "Калининград","продакт-менеджер");
        Human artiem = new Human("Артем",1995, "Москва","директор по развитию бизнеса");

        maxim.greetings();
        anna.greetings();
        katja.greetings();
        artiem.greetings();

        System.out.println("");

       Car lada = new Car("Lada","Granta", 1.7, "Yelow",2015,"Russia");
       Car audi = new Car("Audi","A8", 3.0, "Black",2020,"Germany");
       Car bmw = new Car("Bmw","Z8", 3.0, "Black",2021,"Germany");
       Car kia = new Car("Kia","Sportage", 2.4, "Red",2018,"South Korea");
       Car  hunday = new Car("Hunday","Avante", 1.6, "Orange",2016,"South Korea");

        lada.info();
        audi.info();
        bmw.info();
        kia.info();
        hunday.info();
    }
}