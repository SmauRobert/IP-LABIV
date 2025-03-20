import java.util.*;

public class Test {
    public static void main(String[] args) {
        // Creare activitati
        Activity football = new Activity("Football", "Play football with friends", 50.0);
        Activity swimming = new Activity("Swimming", "Swim in the Olympic pool", 30.0);

        // Creare client
        Client client = new Client("John Doe", "john.doe@example.com");
        client.setHobby(ActivityType.FOOTBALL);

        // Creare rezervari
        Date startTime1 = new Date();
        Date endTime1 = new Date(startTime1.getTime() + 3600000); // +1 ora
        Reservation reservation1 = new Reservation(startTime1, endTime1, football);

        Date startTime2 = new Date();
        Date endTime2 = new Date(startTime2.getTime() + 7200000); // +2 ore
        Reservation reservation2 = new Reservation(startTime2, endTime2, swimming);

        // Adaugare rezervari la client
        List<Reservation> reservations = new ArrayList<>();
        reservations.add(reservation1);
        reservations.add(reservation2);

        System.out.println("Client: " + client.getName() + " (Email: " + client.getEmail() + ")");
        System.out.println("Hobby: " + client.getHobby());
        System.out.println("Reservations:");
        for (Reservation res : reservations) {
            System.out.println(" - Activity: " + res.getReservedActivity().getTitle() + ", Time: " + res.getStartTime() + " to " + res.getEndTime());
        }
    }
}