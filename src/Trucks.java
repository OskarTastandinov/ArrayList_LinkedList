
public class Trucks extends Transport {
    private Weight weight;

    private static final String REMONT = "Осуществить ремонт транспорта";
    private static final String TIME_TRUCKS = "Засечь лучшее время проезда с начальной точки до конечной";
    private static final String SPEED_TRUCKS = "Замерить максимальную скорость";

    public Trucks(String stamp, String model, double engineCapacity, Weight weight){
        super(stamp, model, engineCapacity);
        this.weight = weight;
    }

    public Weight getWeight() {
        return weight;
    }

    public void setWeight(Weight weight) {
        this.weight = weight;
    }


    @Override
    public String toString() {
        return "Марка - " + getStamp() + ", модель - " + getModel() +
                ", объем двигателя - " + getEngineCapacity() + " л.";
    }

    @Override
    public boolean service() {
        System.out.println("Диагностика не нужна");
        return true;
    }

    @Override
    public void repair() {
        System.out.println("Машина починена");
    }
}

