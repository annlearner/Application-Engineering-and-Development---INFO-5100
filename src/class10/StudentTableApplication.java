package class10;

import java.awt.Container;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

import class9.Student;
import class9.StudentsManager;
import class9.StudentsPersistor;
import class9.StudentsPersistorImpl;

public class StudentTableApplication extends JFrame {

	public static void main(String args[]) throws Exception {
		new StudentTableApplication();
	}

	private JTable studentTable;
	private StudentsPersistor persistor;
	private List<Student> students;

	public StudentTableApplication() throws Exception {
		persistor = new StudentsPersistorImpl();
		StudentsManager manager = persistor.load();
		students = manager.getStudents();

		StudentTableModel model = new StudentTableModel(students);
		studentTable = new JTable(model);

		Container c = getContentPane();
		JScrollPane jsp = new JScrollPane(studentTable);

		c.add(jsp);

		setSize(500, 500);
		setVisible(true);

	}

	class StudentTableModel implements TableModel {

		private List<Student> students;

		public StudentTableModel(List<Student> students) {
			this.students = students;
		}

		@Override
		public void addTableModelListener(TableModelListener arg0) {
			// TODO Auto-generated method stub

		}

		@Override
		public Class<?> getColumnClass(int arg0) {
			return String.class;
		}

		@Override
		public int getColumnCount() {
			return 4;
		}

		@Override
		public String getColumnName(int c) {
			if (c == 0) {
				return "Roll";
			}
			if (c == 1) {
				return "Name";
			}
			if (c == 2) {
				return "Gender";
			}
			if (c == 3) {
				return "Grade";
			}
			return null;

		}

		@Override
		public int getRowCount() {
			return students.size();
		}

		@Override
		public Object getValueAt(int r, int c) {
			Student s = students.get(r);
			if (c == 0) {
				return s.getRoll();
			}
			if (c == 1) {
				return s.getName();
			}
			if (c == 2) {
				return s.getGender();
			}
			if (c == 3) {
				return s.getGrade();
			}
			return null;
		}

		@Override
		public boolean isCellEditable(int arg0, int arg1) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public void removeTableModelListener(TableModelListener arg0) {
			// TODO Auto-generated method stub

		}

		@Override
		public void setValueAt(Object arg0, int arg1, int arg2) {
			// TODO Auto-generated method stub

		}

	}

}
