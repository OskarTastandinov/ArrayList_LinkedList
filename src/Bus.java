
public class Bus extends Transport {
    private Capasity capasity;
    public Bus(String stamp, String model, double engineCapacity, Capasity capasity){
        super(stamp, model, engineCapacity);
        this.capasity = capasity;
    }

    public Capasity getCapasity() {
        return capasity;
    }

    public void setCapasity(Capasity capasity) {
        this.capasity = capasity;
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

