import java.util.Date;

public class Reservation {
    private final Date startTime;
    private final Date endTime;
    private final Activity reservedActivity;

    public Reservation(Date startTime, Date endTime, Activity reservedActivity) {
        this.startTime = startTime;
        this.endTime = endTime;
        this.reservedActivity = reservedActivity;
    }

    public Date getStartTime() {
        return startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public Activity getReservedActivity() {
        return reservedActivity;
    }
}