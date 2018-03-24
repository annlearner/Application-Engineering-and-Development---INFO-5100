package class8;

public class ChessGame {
	public static void main(String args[]) {
		ChessPlayer john = new ChessPlayer("John");
		ChessPlayer jack = new ChessPlayer("Jack");
		john.opponent = jack;
		jack.opponent = john;
		john.setMove(true);
		Thread johnThread = new Thread(() -> john.playHappily());
		Thread jackThread = new Thread(() -> jack.playHappily());
		johnThread.start();
		jackThread.start();
	}

}

class ChessPlayer {
	String name;
	ChessPlayer opponent;
	boolean move = false;

	public ChessPlayer(String name) {
		this.name = name;
	}

	public void playHappily() {
		try {
			play();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void play() throws Exception {
		while (true) {
			if (isGameOver()) {
				System.out.println("Game is over");
				return;
			}
			if (move == true) {
				int x = (int) (Math.random() * 1000);
				Thread.sleep(x);
				System.out.println(name + " is making a move after thinking for " + x + " milliseconds");
				this.setMove(false);
				opponent.setMove(true);
				synchronized (opponent) {
					opponent.notify();
				}
			} else {
				synchronized (this) {
					this.wait();
				}
			}
		}
	}

	public void setMove(boolean b) {
		this.move = b;
	}

	private boolean isGameOver() {
		return false;
	}
}