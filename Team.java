import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

class Team {
    private List<Person> members;
    private ActivityType hobby;
    private LocalTime time;

    public Team(ActivityType hobby, LocalTime time) {
        this.hobby = hobby;
        this.time = time;
        this.members = new ArrayList<>();
    }

    public void addMember(Person person) {
        if (person.getHobby().equals(this.hobby)) {
            members.add(person);
        }
    }

    public List<Person> getMembers() {
        return members;
    }

    public LocalTime getTime() {
        return time;
    }

    @Override
    public String toString() {
        return "Team " + hobby + " at " + time + ": " + members;
    }
}