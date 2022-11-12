
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ServiceStation<Transport> politahnicheskaya = new ServiceStation<Transport>("Станция Политехническая",
                "г. Санкт-Петербург, ул. Тихорецкая, д. 67");
        System.out.println("Механики:");

        Mechanic ivan = new Mechanic("Иван", "Петров","ArizonaMechanic");

        Car lada = new Car("Lada", "Grande",1.6, TypeOfbody.COMPARTMENT);
        lada.addMechanics(ivan);
        lada.addSponsors(new Sponsor<>("Моторс",1522222.0));
        lada.addDrivers(new Driver<>("Aleksey","B"));
        lada.service();

        System.out.println(lada);

        System.out.println("Грузовые автомобили");
        Trucks kamaz = new Trucks("КАМАЗ", "0505",5, Weight.N1);
        kamaz.addMechanics(new Mechanic<>("Иван", "Петров","ArizonaMechanic"));
        kamaz.addSponsors(new Sponsor<>("Моторс",1435345.0));
        kamaz.addDrivers(new Driver<>("Петр","С"));
        System.out.println(kamaz.toString());

        System.out.println("Автобусы");
        Bus autobus1 = new Bus("ПАЗ","001", 5,Capasity.SMALL);
        autobus1.addMechanics(new Mechanic<>("Иван", "Петров","ArizonaMechanic"));
        autobus1.addSponsors(new Sponsor<>("Моторс",12313123.0));
        autobus1.addDrivers(new Driver<>("Гошан","D"));
        System.out.println(autobus1.toString());

        System.out.println();
        List<Transport> transports = List.of(lada, kamaz, autobus1);
        for (Transport transport: transports){
            printInfo(transport);
        }
        politahnicheskaya.addCarQueue(lada);
        politahnicheskaya.addCarQueue(kamaz);
        politahnicheskaya.conductTechnicalInspection();
    }
    private static void printInfo(Transport transport) {
        System.out.println("Информация по автомобилю " + transport.getStamp() + " " + transport.getModel());
        System.out.println("Водители: "+ transport.getDrivers());
        System.out.println("Спонсоры: " + transport.getSponsors());
        System.out.println("Механики: " + transport.getMechanics());
    }

}
