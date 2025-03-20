import java.util.List;

public class Admin implements Person {
    private String name;
    private String email;

    @Override
    public String getName() {
        return "";
    }

    @Override
    public ActivityType getHobby() {
        return null;
    }

    @Override
    public List<Reservation> getReservationsList() {
        return List.of();
    }
}
