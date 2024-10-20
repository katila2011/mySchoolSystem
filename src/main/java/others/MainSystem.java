package others;
import enums.Gender;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.io.Console;


public class MainSystem {
    public static void main(String[] args) throws IOException{

        System.out.println("Welcome to HNUF School Management System");
        Principal principal1 = new Principal("Godwin", 46, Gender.MALE);
        Scanner scanMain = new Scanner(System.in);
        String scanMainInput;
        boolean valid = false;
        int value;

        while (!valid){
            System.out.println("""
                    What would you like to do? Select the number to proceed
                    1. View Current Students Status
                    2. Enter Staff mode
                    3. Enter Admin mode""");

                scanMainInput = scanMain.next();
               // try {
                    value = Integer.parseInt(scanMainInput); // try to parse the "number" to int
                    if (value == 1){
                        //System.out.println("Testing 1");
                        Students students = new Students();
                        students.StudentInfo();
                        valid = true;
                    } else if (value == 2) {
                        Scanner Teacherpassword = new Scanner(System.in);
                        System.out.println("Please enter staff Password");
                        String TeacherpassCheck = Teacherpassword.next();
                        Teachers teachers = new Teachers();
                        if (teachers.TeachersPassMethod(TeacherpassCheck) == false){
                            System.out.println("Log in successful");
                            teachers.staffWriterMethod1();
                            valid = true;
                        }
                    } else if (value == 3) {
                    Scanner password = new Scanner(System.in);
                        System.out.println("Please enter admin Password");
                         String passCheck = password.next();
                        if(principal1.Password(passCheck) == true){
                            principal1.principalSelect(false);
                        }else{
                            System.out.println("Wrong password");
                        }
                        valid = true;
                    }
                    else if ((value < 1) || (value > 4)) {
                        System.out.println("Wrong Input, please try again");
                    }
//                } catch (Exception e) {
//                     System.out.println("Exception Wrong Input, please try again");
//                }
        }
    }
}