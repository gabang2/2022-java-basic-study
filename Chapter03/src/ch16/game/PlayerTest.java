package ch16.game;

public class PlayerTest {

	public static void main(String[] args) {
		BeginnerLevel beginner = new BeginnerLevel();
		AdvancedLevel advanced = new AdvancedLevel();
		SuperLevel supered = new SuperLevel();
		
		Player player = new Player(beginner);
		player.play();
		player.upgradeLevel(advanced);
		player.play();
		player.upgradeLevel(supered);
		player.play();
		
	}

}
