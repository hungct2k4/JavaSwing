package GUI;

import java.awt.event.*;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

import APP.*;

public class GUI {
    JButton addStudent;
    JButton editStudent;
    JButton deleteStudent;
    JButton show;
    JFrame window;
    ArrayList<Students> arr = new ArrayList<>();
    ManageStudents manage;

    public GUI() {
        window = new JFrame();
        addStudent = new JButton("Add Students");
        editStudent = new JButton("Edit Students");
        deleteStudent = new JButton("Delete Student");
        show = new JButton("Show");
        addStudent.setBounds(20, 40, 200, 30);
        editStudent.setBounds(20, 80, 200, 30);
        deleteStudent.setBounds(20, 120, 200, 30);
        show.setBounds(20, 160, 200, 30);
        
        manage = new ManageStudents();

        window.add(addStudent);
        window.add(editStudent);
        window.add(deleteStudent);
        window.add(show);
        window.setSize(1000,700);
        window.setLayout(null);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocationByPlatform(true);
        window.setVisible(true);
    }
    public void ShowAllStudent() {
        show.addActionListener(new ActionListener() {  
            @Override
            public void actionPerformed(ActionEvent e) {
                for (Students o : manage.manageStudents)
                    System.out.println(o.ShowInfor());
            }  
        });  
    }

    public void AddStudent() {
        addStudent.addActionListener(new ActionListener() {  
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame add_window = new JFrame("Add Students"); 

                // JTextField nameText = new JTextFiecld("Add your name");                     
                // JTextField ageText = new JTextField("Add your age");
                // JTextField genderText = new JTextField("Add your gender");
                // JTextField addressText = new JTextField("Add your address");

                JTextField nameText = new JTextField();                   
                JTextField ageText = new JTextField();    
                JTextField genderText = new JTextField();
                JTextField addressText = new JTextField();    
                JButton login = new JButton("Add");
                login.setBounds(200, 200,120, 30);
                nameText.setBounds(20, 40, 300, 30);
                ageText.setBounds(20, 80, 300, 30);
                genderText.setBounds(20, 120, 300, 30);     
                addressText.setBounds(20, 160, 300, 30);     

                add_window.add(nameText);
                add_window.add(ageText);
                add_window.add(genderText);
                add_window.add(addressText);
                add_window.add(login);
                
                // Students student = new Students(nameText.getName(), Integer.parseInt(ageText.getName()), genderText.getName(), addressText.getName());

                // manage.manageStudents.add(student_);

                // Students st1 = new Students("Elon", 55, "Boy", "USA");

                login.addActionListener(new ActionListener() {  
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        // Students student_ = new Students();
                        
                        // System.out.println(nameText.getText());
                        // System.out.println(Integer.parseInt(ageText.getText()));
                        // System.out.println(addressText.getText());
                        // System.out.println(genderText.getText());

                        // student_.setName(nameText.getText());
                        // student_.setAge(Integer.parseInt(ageText.getText()));
                        // student_.setAddress(addressText.getText());
                        // student_.setGenger(genderText.getText());
                        Students student_ = new Students(nameText.getText(), Integer.parseInt(ageText.getText()), genderText.getText(), addressText.getText());

                        // arr.add(student_);
                        manage.manageStudents.add(student_);

                        // for (Students o : manage.manageStudents) 
                        //     System.out.println(o.ShowInfor());

                    }  
                });
                
                add_window.setSize(800,500);
                add_window.setLayout(null);
                add_window.setLocationByPlatform(true);
                add_window.setVisible(true);
            }  
        });  
    }
    

}