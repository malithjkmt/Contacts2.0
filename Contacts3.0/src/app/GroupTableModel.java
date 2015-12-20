
package app;

import data.Group;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Malith
 */
public class GroupTableModel extends AbstractTableModel {
        public static final int OBJECT_COL = -1;
	private static final int NAME_COL = 0;


	private final String[] columnNames = { "Group Name"};// this should come from user input..... user can customize what fields to show
	private List<Group> group = null;
        
        public GroupTableModel() {
		
	}
        
	public GroupTableModel(List<Group> theGroup) {
		group = theGroup;
	}

	@Override
	public int getColumnCount() {
		return columnNames.length;
	}

	@Override
	public int getRowCount() {
		return group.size();
	}

	@Override
	public String getColumnName(int col) {
		return columnNames[col];
	}

	@Override
	public Object getValueAt(int row, int col) {
               
                
		Group tempGroup = group.get(row);

		switch (col) {
		case NAME_COL:
			return tempGroup.getGroupName();
		
                case OBJECT_COL:
			return tempGroup;
		default:
			return tempGroup.getGroupName();
		}
	}

	@Override
	public Class getColumnClass(int c) {
		return getValueAt(0, c).getClass();
	}


}
