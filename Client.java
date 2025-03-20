import javax.accessibility.AccessibleIcon;
import java.util.List;

public class Client implements Person {
    private String name;
    private String email;
    private ActivityType hobby;

    private List<Activity> activityList;
    private List<Reservation> reservationsList;

    public Client(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ActivityType getHobby() {
        return hobby;
    }

    public void setHobby(ActivityType hobby) {
        this.hobby = hobby;
    }

    public List<Activity> getActivityList() {
        return activityList;
    }

    public List<Reservation> getReservationsList() {
        return reservationsList;
    }
}
