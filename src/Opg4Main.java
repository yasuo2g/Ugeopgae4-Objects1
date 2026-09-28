import java.util.ArrayList;

public class Opg4Main {
    public static void main(String[] args) {
        Opg4Team redTeam = new Opg4Team("Røde Dragoner");
        Opg4Team blueTeam = new Opg4Team("Blå Hajer");

        // Tilføj spillere til rødt hold
        redTeam.addPlayer(new Opg4Player("Anna", 85));
        redTeam.addPlayer(new Opg4Player("Peter", 72));
        redTeam.addPlayer(new Opg4Player("Maria", 90));

        // Tilføj spillere til blåt hold
        blueTeam.addPlayer(new Opg4Player("Lars", 78));
        blueTeam.addPlayer(new Opg4Player("Emma", 82));
        blueTeam.addPlayer(new Opg4Player("Simon", 88));
        blueTeam.addPlayer(new Opg4Player("Sofia", 75));

        // Print teams
        redTeam.printTeam();
        blueTeam.printTeam();

        // Konkurrence
        redTeam.compete(blueTeam);

        // Ekstra udfordring
        System.out.println("\nBedste spillere:");
        System.out.println(redTeam.teamName + ": " + redTeam.findBestPlayer());
        System.out.println(blueTeam.teamName + ": " + blueTeam.findBestPlayer());
    }
}
