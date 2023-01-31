public class Main {
    public static void main(String[] args) {
        // No encapsulation
        Player player = new Player();
        player.name = "Dan";
        player.health = 20;
        player.weapon = "Sword";

        int damage = 23;
        player.loseHealth(damage);
        System.out.println("Remaining health is " + player.heathRemaining());

        // With encapsulation

        EnhancedPlayer enPlayer = new EnhancedPlayer("Dan", 50, "Gun");
        System.out.println("Current health: "+ enPlayer.getHealth());
    }
}