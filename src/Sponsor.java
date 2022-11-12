public class Sponsor <T extends Transport>{
    private String nameSponsor;
    private double amountOfSupport;

    public Sponsor(String nameSponsor, double amountOfSupport) {
        this.nameSponsor = nameSponsor;
        this.amountOfSupport = amountOfSupport;
    }

    public void sponsorship(){
        System.out.println("Спонсировать заезд");
    }

    public String getNameSponsor() {
        return nameSponsor;
    }

    public void setNameSponsor(String nameSponsor) {
        this.nameSponsor = nameSponsor;
    }

    public double getAmountOfSupport() {
        return amountOfSupport;
    }

    public void setAmountOfSupport(double amountOfSupport) {
        this.amountOfSupport = amountOfSupport;
    }

    @Override
    public String toString() {
        return "Sponsor{" +
                "nameSponsor='" + nameSponsor + '\'' +
                ", amountOfSupport=" + amountOfSupport +
                '}';
    }
}

