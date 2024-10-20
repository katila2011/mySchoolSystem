package others;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public interface staff {

    ArrayList<ArrayList<String>>schDBArrayList = new ArrayList();
    ArrayList<String> schStaffDBArrayList = new ArrayList<>();
    ArrayList<String> schTeacherDBArrayList = new ArrayList<>();
    ArrayList<String> schApplicantsDBArrayList = new ArrayList<>();
    ArrayList<String> schAdminDBArrayList = new ArrayList<>();
    ArrayList<String> schstudentsDBArrayList = new ArrayList<>();
    String desktopPath = System.getProperty("user.home") + "/Documents/Decagon files/Programming works";
    //File fileName = new File (desktopPath + "/Documents/Decagon files/Programming works/mySchoolSystem.csv");


    public String staffWriterMethod1() throws IOException;

}
