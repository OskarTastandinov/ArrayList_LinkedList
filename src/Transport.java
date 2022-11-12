import java.util.ArrayList;

import java.util.List;

public abstract class Transport {
    private final String stamp; // марка
    private final String model; // модель
    private final double engineCapacity; // объем двигателя
    private final List<Mechanic<?>> mechanics = new ArrayList<>();
    private final List<Sponsor<?>> sponsors = new ArrayList<>();
    private final List<Driver<?>> drivers = new ArrayList<>();
    public Transport(String stamp, String model, double engineCapacity) {
        if(stamp == null || stamp.isEmpty()){
            this.stamp = "default";
        }else{
            this.stamp = stamp;
        }
        if(model == null || model.isEmpty()){
            this.model = "default";
        }else{
            this.model = model;
        }
        if (engineCapacity <= 0){
            this.engineCapacity = 1.6;
        }else{
            this.engineCapacity = engineCapacity;
        }
    }
    public String getStamp() {
        return stamp;
    }

    public String getModel() {
        return model;
    }
    public double getEngineCapacity() {
        return engineCapacity;
    }

    public List<Mechanic<?>> getMechanics() {
        return mechanics;
    }

    public List<Sponsor<?>> getSponsors() {
        return sponsors;
    }

    public List<Driver<?>> getDrivers() {
        return drivers;
    }

    public void addMechanics(Mechanic<?> mechanic) {
        mechanics.add(mechanic);
    }
    public void addSponsors(Sponsor<?> sponsor) {
        sponsors.add(sponsor);
    }
    public void addDrivers(Driver<?> driver) {
        drivers.add(driver);
    }

    public abstract boolean service();

    public abstract void repair();
}
