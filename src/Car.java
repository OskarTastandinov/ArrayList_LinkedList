
public class Car extends Transport {
    private TypeOfbody typeOfBody;

    public Car(String stamp, String model, double engineCapacity, TypeOfbody typeOfBody){
        super(stamp, model, engineCapacity);
        this.typeOfBody = typeOfBody;


    }

    public TypeOfbody getTypeOfBody() {
        return typeOfBody;
    }

    public void setTypeOfBody(TypeOfbody typeOfBody) {
        this.typeOfBody = typeOfBody;
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
    @Override
    public String toString() {
        return "Марка - " + getStamp() + ", модель - " + getModel() +
                ", тип кузова - " + getTypeOfBody() +
                ", объем двигателя - " + getEngineCapacity() + " л.";
    }
}

