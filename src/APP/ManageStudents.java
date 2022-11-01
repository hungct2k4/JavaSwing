package APP;

import java.util.ArrayList;

public class ManageStudents {
    public ArrayList<Students> manageStudents;



    public ManageStudents() {
        this.manageStudents = new ArrayList<Students>();
    }


    public void ShowAllStudent() {
        for (Students o : manageStudents)
            System.out.println(o.ShowInfor());
    }
}
