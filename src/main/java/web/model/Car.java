package web.model;

public class Car {
    private int creationYear;
    private String company;
    private int model;

    public Car(int creationYear, String company, int model) {
        this.creationYear = creationYear;
        this.company = company;
        this.model = model;
    }

    public Car() {
    }
    public int getCreationYear() {
        return creationYear;
    }

    public void setCreationYear(int creationYear) {
        this.creationYear = creationYear;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }
}
