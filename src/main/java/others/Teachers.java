package others;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class Teachers implements staff{

    public boolean TeachersPassMethod (String teacherPass) {

        String teacherPassMain = "teacher@HNUF";
        boolean checkpass = false;
        if (teacherPass == teacherPassMain){
            checkpass = true;
        }
        return checkpass;
    }

    @Override
    public String staffWriterMethod1() throws IOException {
        System.out.println("Would you like to write the weekly report? Yes or No pls");
        Scanner scanTeacherResponse = new Scanner(System.in);
        if (scanTeacherResponse.next() == "yes"){
            System.out.println("Please type your report starting with your ID and name");
            String teacherReport = scanTeacherResponse.next();
            schTeacherDBArrayList.add(teacherReport);
        }else {
            System.out.println("'No' selected. Check out other pages instead");
        }

        //writing to csv operation
        BufferedWriter wr = new BufferedWriter(new FileWriter(desktopPath + "mySchoolSystem.csv"));
        schDBArrayList.add(schTeacherDBArrayList);
        wr.write(String.valueOf(schDBArrayList));
        wr.close();
        System.out.println("Successfully written to my School System file");
        return "";
    }
}
