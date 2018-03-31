package class10;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class TestFrame {

	public static void main(String[] args) {
		final JFrame frame = new JFrame();
		frame.setTitle("My first frame");
		Container c = frame.getContentPane();
		JButton redButton = new JButton("Red");
		JButton blueButton = new JButton("Blue");
		FlowLayout fl = new FlowLayout();
		c.setLayout(fl);

		c.setBackground(Color.red);
		c.add(redButton);
		c.add(blueButton);

		BlueActionListener blue = new BlueActionListener(c);
		RedActionListener red = new RedActionListener(c);

		redButton.addActionListener(red);
		blueButton.addActionListener(blue);

		frame.setSize(400, 700);
		frame.setVisible(true);

		// new FrameThread(frame).start();

	}

	static class RedActionListener implements ActionListener {

		Container c;

		RedActionListener(Container c) {
			this.c = c;
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			c.setBackground(Color.red);

		}

	}

	static class BlueActionListener implements ActionListener {

		Container c;

		BlueActionListener(Container c) {
			this.c = c;
		}

		@Override
		public void actionPerformed(ActionEvent arg0) {
			c.setBackground(Color.blue);

		}

	}

	static class FrameThread extends Thread {
		private JFrame frame;

		public FrameThread(JFrame frame) {
			this.frame = frame;
		}

		public void run() {
			try {
				while (true) {
					Thread.sleep(2000);
					Container c = frame.getContentPane();
					Color color = c.getBackground();
					if (color == Color.red) {
						c.setBackground(Color.BLUE);
					} else {
						c.setBackground(Color.red);
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
