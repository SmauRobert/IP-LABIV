import java.time.Duration;
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

    public List<Person> findMatches(Person person, Duration timeRange) {
        List<Person> matches = new ArrayList<>();

        for (Person p : people) {
            if (!p.equals(person) && p.getHobby().equals(person.getHobby())) {
                Duration difference = Duration.between(p.getAvailableTime(), person.getAvailableTime()).abs();
                if (difference.compareTo(timeRange) <= 0) {
                    matches.add(p);
                }
            }
        }

        return matches;
    }
}