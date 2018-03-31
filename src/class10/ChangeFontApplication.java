package class10;

import java.awt.Container;
import java.awt.Font;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class ChangeFontApplication extends JFrame {

	private JSlider slider;
	private JLabel label;
	private JLabel sliderLabel;

	public ChangeFontApplication() {
		createComponents();
		addComponents();
		addListener();
		makeItVisible();
	}

	private void addListener() {
		ChangeListener cl = new ChangeFontListener();
		slider.addChangeListener(cl);
		CloseWindowAdapter cwa = new CloseWindowAdapter();
		this.addWindowListener(cwa);
	}

	class CloseWindowAdapter extends WindowAdapter {
		@Override
		public void windowClosing(WindowEvent we) {
			int result = JOptionPane.showConfirmDialog(ChangeFontApplication.this,
					"Are you sure you want to close the window");
			if (result == JOptionPane.OK_OPTION) {
				JOptionPane.showMessageDialog(null, "Okay -> I'm going to close now..");
				close();
			}
		}

		public void close() {
			System.exit(0);
		}
	}

	class ChangeFontListener implements ChangeListener {

		@Override
		public void stateChanged(ChangeEvent ce) {
			JSlider js = (JSlider) ce.getSource();
			int value = js.getValue();

			Font f = label.getFont();
			int size = f.getSize();
			String name = f.getName();
			int style = f.getStyle();

			Font ff = new Font(name, style, value);

			label.setFont(ff);
		}

	}

	private void addComponents() {
		Container c = getContentPane();
		addSlider(c);
		addLabel(c);

	}

	private void addLabel(Container c) {
		c.add(label, "Center");

	}

	private void addSlider(Container c) {
		JPanel p = new JPanel();
		p.add(sliderLabel);
		p.add(slider);
		c.add(p, "North");

	}

	private void createComponents() {
		slider = new JSlider(JSlider.HORIZONTAL, 0, 50, 2);
		label = new JLabel("North Eastern University", JLabel.CENTER);
		sliderLabel = new JLabel("Drag slider for changing font : ");
	}

	private void makeItVisible() {
		setSize(500, 700);
		setVisible(true);

	}

	public static void main(String[] args) {
		new ChangeFontApplication();
	}

}
