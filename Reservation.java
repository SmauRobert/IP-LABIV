import java.util.ArrayDeque;
import java.util.Date;

public class Reservation {
    private final Date startTime;
    private final Date endTime;
    private final Activity reservedActivity;

    Reservation(Date startTime, Date endTime, Activity reservedActivity) {
        this.startTime = startTime;
        this.endTime = endTime;
        this.reservedActivity = reservedActivity;
    }

    Date getStartTime() {
        return startTime;
    }

    Date getEndTime() {
        return endTime;
    }

    Activity getReservedActivity() {
        return reservedActivity;
    }
}
