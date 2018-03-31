package class10;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalculatorFrame extends JFrame {
	private JTextField first, second, result;
	private JButton plus, minus, multiply, divide;
	private JLabel firstLabel, secondLabel, resultLabel;

	private OperatorListener operatorListener;

	public CalculatorFrame() {
		createComponents();
		setLayout();
		addComponents();
		createListeners();
		addListeners();
		makeItVisible();
	}

	private void addListeners() {
		plus.addActionListener(operatorListener);
		minus.addActionListener(operatorListener);
		multiply.addActionListener(operatorListener);
		divide.addActionListener(operatorListener);
	}

	private void createListeners() {
		operatorListener = new OperatorListener();

	}

	class OperatorListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent ae) {
			Object o = ae.getSource();
			int a = Integer.parseInt(first.getText());
			int b = Integer.parseInt(second.getText());
			if (o == plus) {
				int r = a + b;
				result.setText(r + "");
			}
			if (o == minus) {
				result.setText(a - b + "");
			}
			if (o == multiply) {
				result.setText(a * b + "");
			}
			if (o == divide) {
				result.setText(a / b + "");
			}

		}

	}

	private void makeItVisible() {
		setSize(500, 500);
		setVisible(true);
		pack();

	}

	private void addComponents() {
		Container c = getContentPane();
		addInputControl(c);
		addOperationControl(c);
		addResultControl(c);

	}

	private void addResultControl(Container c) {
		JPanel panel = new JPanel();
		panel.add(resultLabel);
		panel.add(result);
		c.add(panel, "South");
	}

	private void addOperationControl(Container c) {
		JPanel panel = new JPanel();
		panel.add(plus);
		panel.add(minus);
		panel.add(multiply);
		panel.add(divide);
		c.add(panel, "Center");
	}

	private void addInputControl(Container c) {
		JPanel panel = new JPanel();
		panel.add(firstLabel);
		panel.add(first);
		panel.add(secondLabel);
		panel.add(second);
		c.add(panel, "North");

	}

	private void setLayout() {
		Container c = getContentPane();
		c.setLayout(new BorderLayout());

	}

	private void createComponents() {
		firstLabel = new JLabel("Input First Number :");
		secondLabel = new JLabel("Input Second Number : ");
		resultLabel = new JLabel("Result : ");

		plus = new JButton("+");
		minus = new JButton("-");
		multiply = new JButton("x");
		divide = new JButton("/");

		first = new JTextField(5);
		second = new JTextField(5);
		result = new JTextField(5);

		setTitle("Calculator");

	}

	public static void main(String argsp[]) {
		new CalculatorFrame();
	}

}
