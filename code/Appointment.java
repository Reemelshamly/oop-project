
import java.sql.Time;
import java.util.Date;
public class Appointment {
    private int appointmentID;
    private Date date;
    private Time time;
    
    public Appointment(int appointmentID, Date date, Time time) {
        super();
        this.appointmentID = appointmentID;
        this.date = date;
        this.time = time;
    }
    public int getAppointmentID() {
        return appointmentID;
    }
    public void setAppointmentID(int appointmentID) {
        this.appointmentID = appointmentID;
    }
    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }
    public Time getTime() {
        return time;
    }
    public void setTime(Time time) {
        this.time = time;
    }
    
    
    } 
