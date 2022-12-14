package ch16.game;

public class Player {
	private PlayerLevel level;
	
	public Player() {
		this.level = new BeginnerLevel();
		level.showLevelMessage();
	}
	
	public PlayerLevel getLevel() {
		return level;
	}
	
	public void upgradeLevel(PlayerLevel playerLevel) {
		this.level = playerLevel;
		level.showLevelMessage();
	}
	
	final void play(int count) {
		level.go(count);
	}
	
}
