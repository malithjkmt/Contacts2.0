
package app;

import vo.Person;
import static com.sun.corba.se.impl.util.RepositoryId.cache;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Malith
 */
public class PersonTableModel extends AbstractTableModel {
        public static final int OBJECT_COL = -1;
	private static final int LAST_NAME_COL = 0;
	private static final int FIRST_NAME_COL = 1;
	

	private String[] columnNames = { "Last Name", "First Name" };// this should come from user input..... user can customize what fields to show
	private List<Person> person = null;
        
        public PersonTableModel() {
		
	}
        
	public PersonTableModel(List<Person> thePerson) {
		person = thePerson;
	}

	@Override
	public int getColumnCount() {
		return columnNames.length;
	}

	@Override
	public int getRowCount() {
		return person.size();
	}

	@Override
	public String getColumnName(int col) {
		return columnNames[col];
	}

	@Override
	public Object getValueAt(int row, int col) {
               
                
		Person tempPerson = person.get(row);

		switch (col) {
		case LAST_NAME_COL:
			return tempPerson.getLastName();
		case FIRST_NAME_COL:
			return tempPerson.getFirstName();		
                case OBJECT_COL:
			return tempPerson;
		default:
			return tempPerson.getLastName();
		}
	}

	@Override
	public Class getColumnClass(int c) {
		return getValueAt(0, c).getClass();
	}


}
