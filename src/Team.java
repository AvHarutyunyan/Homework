import java.util.ArrayList;
import java.util.List;

/**
 * 🧪 Վարժություն 2 – Aggregation
 * Ստեղծիր Team և Player class-եր, որտեղ թիմը պահում է խաղացողի հղումը։
 * <p>
 * 🔧 Պահանջներ՝
 * <p>
 * Player class-ը պետք է ունենա անուն։
 * <p>
 * Team class-ում պահիր Player-ի instance-ը որպես field։
 * <p>
 * Ստեղծիր խաղացող և թիմ առանձին object-ներով main-ում։
 */
public class Team {

    public List<Player> player;

    public List<Player> getPlayer() {
        return player;
    }

    public void setPlayer(List<Player> player) {
        this.player = player;
    }

    Team(List<Player> player) {
        this.player = player;
    }

    void barcelonaTeam(Player player) {
        System.out.println("The " + player.getName() + " Best player in Team");
    }

    public static void main(String[] args) {
        List<Player> players = new ArrayList<>();
        players.add(new Player("Yamal"));
        players.add(new Player("Araujo"));
        players.add(new Player("Gavi"));

        Team team = new Team(players);

        for (Player player1 : team.getPlayer())
            team.barcelonaTeam(player1);

        System.out.println(DayOfWeek.DEKTEMBER);

    }
}

class Player {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    Player(String name) {
        this.name = name;
    }
}
