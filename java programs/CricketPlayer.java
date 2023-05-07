import java.util.Arrays;

public class CricketPlayer {
    private String name;
    private int innings;
    private int notOut;
    private int totalRuns;
    private double battingAvg;

    public CricketPlayer(String name, int innings, int notOut, int totalRuns) {
        this.name = name;
        this.innings = innings;
        this.notOut = notOut;
        this.totalRuns = totalRuns;
        this.battingAvg = avg(totalRuns, innings, notOut);
    }

    public static double avg(int totalRuns, int innings, int notOut) {
        return (double) totalRuns / (innings - notOut);
    }

    public static void sortPlayers(CricketPlayer[] players) {
        Arrays.sort(players, (p1, p2) -> Double.compare(p2.battingAvg, p1.battingAvg));
    }

    public String toString() {
        return name + "\t" + innings + "\t" + notOut + "\t" + totalRuns + "\t" + battingAvg;
    }

    public static void main(String[] args) {
        int n = 5;
        CricketPlayer[] players = new CricketPlayer[n];
        players[0] = new CricketPlayer("Virat Kohli", 250, 12, 12000);
        players[1] = new CricketPlayer("Rohit Sharma", 200, 25, 10000);
        players[2] = new CricketPlayer("Steve Smith", 150, 20, 7500);
        players[3] = new CricketPlayer("Kane Williamson", 170, 10, 8000);
        players[4] = new CricketPlayer("Joe Root", 180, 15, 8500);
        System.out.println("Before sorting:");
        System.out.println("Name\tInnings\tNot Out\tTotal Runs\tBatting Avg");
        for (CricketPlayer player : players) {
            System.out.println(player);
        }
        CricketPlayer.sortPlayers(players);
        System.out.println("After sorting:");
        System.out.println("Name\tInnings\tNot Out\tTotal Runs\tBatting Avg");
        for (CricketPlayer player : players) {
            System.out.println(player);
        }
    }
}