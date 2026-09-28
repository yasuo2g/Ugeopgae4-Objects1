import java.util.ArrayList;

public class Opg4Team {
    String teamName;
    ArrayList<Opg4Player> players;

    public Opg4Team(String teamName) {
        this.teamName = teamName;
        this.players = new ArrayList<>();
    }

    public void addPlayer(Opg4Player p) {
        players.add(p);
        System.out.println(p.name + " tilføjet til " + teamName);
    }

    public double getAverageSkill() {
        if (players.size() == 0) {
            return 0;
        }

        int totalSkill = 0;
        for (Opg4Player p : players) {
            totalSkill = totalSkill + p.skillLevel;
        }
        return (double)totalSkill / players.size();
    }

    public void printTeam() {
        System.out.println("\n=== " + teamName + " ===");
        System.out.println("Spillere:");
        for (Opg4Player p : players) {
            System.out.println("- " + p);
        }
        System.out.println("Gennemsnitlig skill: " + getAverageSkill());
    }

    public void compete(Opg4Team opponent) {
        System.out.println("\n=== " + teamName + " vs " + opponent.teamName + " ===");
        double mySkill = getAverageSkill();
        double opponentSkill = opponent.getAverageSkill();

        System.out.println(teamName + " skill: " + mySkill);
        System.out.println(opponent.teamName + " skill: " + opponentSkill);

        if (mySkill > opponentSkill) {
            System.out.println("Vinder: " + teamName);
        } else if (opponentSkill > mySkill) {
            System.out.println("Vinder: " + opponent.teamName);
        } else {
            System.out.println("Uafgjort!");
        }
    }

    public Opg4Player findBestPlayer() {
        if (players.size() == 0) {
            return null;
        }

        Opg4Player best = players.get(0);
        for (Opg4Player p : players) {
            if (p.skillLevel > best.skillLevel) {
                best = p;
            }
        }
        return best;
    }
}
