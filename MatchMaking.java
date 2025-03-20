import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

class Matchmaking {
    private List<Person> people;

    public Matchmaking() {
        this.people = new ArrayList<>();
    }

    public void addPerson(Person person) {
        people.add(person);
    }

    public List<Person> findMatches(Person person, LocalTime start, LocalTime end) {
        List<Person> matches = new ArrayList<>();

        for (Person p : people) {
            if (!p.equals(person) && p.getHobby().equals(person.getHobby()) && isAvailable(p, start, end)) {
                matches.add(p);
            }
        }

        return matches;
    }

    private boolean isAvailable(Person person, LocalTime start, LocalTime end) {
        for (Reservation res : person.getReservationsList()) {
            LocalTime resStart = res.getStartTime().toInstant().atZone(java.time.ZoneId.systemDefault()).toLocalTime();
            LocalTime resEnd = res.getEndTime().toInstant().atZone(java.time.ZoneId.systemDefault()).toLocalTime();

            // Check if time slot overlaps with any reservation
            if (!(end.isBefore(resStart) || start.isAfter(resEnd))) {
                return false;
            }
        }
        return true;
    }
}