package APP;

import java.util.ArrayList;

public class ManageStudents {
    public ArrayList<Students> manageStudents;

    public ManageStudents(ArrayList<Students> manageStudents) {
        this.manageStudents = manageStudents;
    }

    public ManageStudents() {

    }

    public ArrayList<Students> getManageStudents() {
        return manageStudents;
    }

    public void setManageStudents(ArrayList<Students> manageStudents) {
        this.manageStudents = manageStudents;
    }

    public void ShowAllStudent() {
        for (Students o : manageStudents)
            System.out.println(o.ShowInfor());
    }
}
