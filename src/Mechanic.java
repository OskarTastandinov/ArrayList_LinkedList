
public class Mechanic <T extends Transport> {
    private String nameMech; // имя механика
    private String surnameMech; // фамилия механика
    private String company; // компанию в которой работает механик


    public Mechanic(String nameMech, String surnameMech, String company) {
        this.nameMech = nameMech;
        this.company = company;
        this.surnameMech = surnameMech;

    }

    public String getSurnameMech() {
        return surnameMech;
    }

    public void setSurnameMech(String surnameMech) {
        this.surnameMech = surnameMech;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getNameMech() {
        return nameMech;
    }

    public String getSurameMech() {
        return company;
    }

    public void setNameMech(String nameMech) {
        this.nameMech = nameMech;
    }

    public void setSurameMech(String surameMech) {
        this.company = surameMech;
    }

    public void performMaintenance() {
        System.out.println("Провести техосмотр");
    }

    public void fixTheCar() {
        System.out.println("Починить машину");
    }

    public boolean service(T t) {
        return t.service();
    }

    public void repair(T t) {
        t.repair();
    }

    @Override
    public String toString() {
        return "Mechanic{" +
                "nameMech='" + nameMech + '\'' +
                ", surnameMech='" + surnameMech + '\'' +
                ", company='" + company + '\'' +
                '}';
    }
}
