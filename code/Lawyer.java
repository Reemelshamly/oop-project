

public class Lawyer {
    private int LawyerId;
    private String name ;
    private String specilization;
    private int experinceYears;
    private boolean availability;
    public Lawyer(int lawyerId, String name, String specilization, int experinceYears, boolean availability) {
        super();
        LawyerId = lawyerId;
        this.name = name;
        this.specilization = specilization;
        this.experinceYears = experinceYears;
        this.availability = availability;
    }
    public int getLawyerId() {
        return LawyerId;
    }
    public void setLawyerId(int lawyerId) {
        LawyerId = lawyerId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
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