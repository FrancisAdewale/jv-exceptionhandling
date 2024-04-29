package exercises;

public class HealthUser {
    private String name;
    private int age;
    private double heightInMetres;
    private int weightInKG;
    private Employment employmentStatus;
    private String occupation;

    public HealthUser(String name,
                      int age,
                      double heightInMetres,
                      int weightInKG,
                      Employment employmentStatus,
                      String occupation) {
        this.name = name;
        this.age = age;
        this.heightInMetres = heightInMetres;
        this.weightInKG = weightInKG;
        this.employmentStatus = employmentStatus;
        this.occupation = occupation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeightInMetres() {
        return heightInMetres;
    }

    public void setHeightInMetres(double heightInMetres) {
        this.heightInMetres = heightInMetres;
    }

    public int getWeightInKG() {
        return weightInKG;
    }

    public void setWeightInKG(int weightInKG) {
        this.weightInKG = weightInKG;
    }

    public Employment getEmploymentStatus() {
        return employmentStatus;
    }

    public void setEmploymentStatus(Employment employmentStatus) {
        this.employmentStatus = employmentStatus;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }
}
