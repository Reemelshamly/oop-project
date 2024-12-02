

public class Lawyer extends Person {
    private int lawyerId;
    private String specilization;
    private int experinceYears;
    private boolean availability;
    public Lawyer(int lawyerId, String specilization, int experinceYears, boolean availability) {
        super();
        this.lawyerId = lawyerId;
        this.specilization = specilization;
        this.experinceYears = experinceYears;
        this.availability = availability;
    }
    public int getLawyerId() {
        return lawyerId;
    }
    public void setLawyerId(int lawyerId) {
        LawyerId = lawyerId;
    }

    public String getSpecilization() {
        return specilization;
    }
    public void setSpecilization(String specilization) {
        this.specilization = specilization;
    }
    public int getExperinceYears() {
        return experinceYears;
    }
    public void setExperinceYears(int experinceYears) {
        this.experinceYears = experinceYears;
    }
    public boolean isAvailability() {
        return availability;
    }
    public void setAvailability(boolean availability) {
        this.availability = availability;
    }
      
}