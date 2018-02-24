package class5.interfaces;

public class Picnic {

	public static void main(String[] args) {
		PictureDevice pd = getPictureDevice();
		pd.takeShot();
		
		Timer timer = makeTimer();
		timer.wakeup();

	}

	private static Timer makeTimer() {
		// TODO Auto-generated method stub
		return null;
	}

	private static PictureDevice getPictureDevice() {
		// return new iPhone();
		return new Camera();
	}

}

interface PictureDevice {
	public void takeShot();
}

interface Timer {
	public void wakeup();
}

class iPhone implements PictureDevice, Timer {

	@Override
	public void takeShot() {
		System.out.println("iPhone is taking a picture");

	}

	@Override
	public void wakeup() {
		System.out.println("iPhone wakes up");

	}

}

class AlarmClock implements Timer {

	@Override
	public void wakeup() {
		System.out.println("AlarmClock wake me up");

	}

}

class Receptionist implements Timer {

	@Override
	public void wakeup() {
		System.out.println("Receptionist wakes up");

	}

}

class Camera implements PictureDevice {

	@Override
	public void takeShot() {
		System.out.println("Camera is taking a picture");

	}

}
