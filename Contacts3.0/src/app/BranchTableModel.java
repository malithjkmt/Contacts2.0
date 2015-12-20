
package app;

import vo.Branch;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Malith
 */
public class BranchTableModel extends AbstractTableModel {
        public static final int OBJECT_COL = -1;
	private static final int BRANCH_CODE_COL = 0;
	private static final int BRANCH_NAME_COL = 1;
	

	private String[] columnNames = { "Branch Code", "Branch Name"};
	private List<Branch> branch = null;
        
        public BranchTableModel() {
		
	}
        
	public BranchTableModel(List<Branch> theBranch) {
		branch = theBranch;
	}

	@Override
	public int getColumnCount() {
		return columnNames.length;
	}

	@Override
	public int getRowCount() {
		return branch.size();
	}

	@Override
	public String getColumnName(int col) {
		return columnNames[col];
	}

	@Override
	public Object getValueAt(int row, int col) {
               
                
		Branch tempBranch = branch.get(row);

		switch (col) {
		case BRANCH_CODE_COL:
			return tempBranch.getBranchCode();
		case BRANCH_NAME_COL:
                    return tempBranch.getBranchName();
                case OBJECT_COL:
			return tempBranch;
		default:
			return tempBranch.getBranchCode();
		}
	}

	@Override
	public Class getColumnClass(int c) {
		return getValueAt(0, c).getClass();
	}


}
