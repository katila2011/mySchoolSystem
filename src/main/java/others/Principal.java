package others;

import enums.Gender;

import java.io.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Scanner;

public class Principal extends Applicants implements staff{
    String name = "Godwin";
    int age = 46;

    public Principal(String name, int age, Gender gender){
        //super(name,age,gender);
        this.name = name;
        this.age = age;

    }
    public boolean Password(String passcheckPrin){
        boolean checkSame = false;
        String pass = "hardworkissuccess";
       if (pass.equals(passcheckPrin)){
            //System.out.println("Same");
            checkSame = true;
        }
        return checkSame;
    }

    public String changePassword (String newPassMain) throws IOException {
        int key = 5;
        String newPass = "";
        String status = "";
        char[] chars = newPass.toCharArray();
        for (char pp: chars){
            pp += 5;
            //System.out.println(pp);
        }
        schAdminDBArrayList.add(chars.toString());

        BufferedWriter wr = new BufferedWriter(new FileWriter(desktopPath + "mySchoolSystem.csv"));
        schDBArrayList.add(schAdminDBArrayList);
        wr.write(String.valueOf(schDBArrayList));
        wr.close();
        System.out.println("Successfully written to my School System file");


        status = "Password change Successful";
        return status;
    }

    public String principalSelect(boolean check) throws IOException{
        int prinValue = 0;
        String mainPrinChoiceStatus = null;
        Students studentsmodify = new Students();
        Scanner scanPrinChoice = new Scanner(System.in);
        while (!check) {
            System.out.println("""
                            What would you like to work on? Select Numbers only
                            1. Current Students' Information
                            2. Applicants' Details
                            3. Staff Details
                            4. Change Admin Password""");
            String scanPrinInput = scanPrinChoice.next();

            try{
                prinValue = Integer.parseInt(scanPrinInput);
                switch (prinValue) {
                    case 1:
                        studentsmodify.studentWriterMethod();
                        break;

                    case 2:
                        applicantsMethod();
                        break;
                    case 3:
                        staffWriterMethod1();
                        break;
                    case 4:
                        System.out.println("Enter new password");
                        String newPass = scanPrinChoice.next();
                        schAdminDBArrayList.clear();
                        changePassword(newPass);
                        break;
                }
                check = true;

            }catch (NumberFormatException e){
                System.out.println("Wrong Input. Please try again");
                throw new RuntimeException();
            }
        }
        mainPrinChoiceStatus = "Concluded";
        return mainPrinChoiceStatus;
    }


    @Override
    public String staffWriterMethod1() throws IOException {

        try{
            int schRow;
            Scanner schoolDataBase = new Scanner(System.in);

            System.out.println("How many columns do you want");
            int schCol = schoolDataBase.nextInt();

            boolean fileCheck = false;
//            while (!fileCheck) {
//                if (fileName.exists() & fileName.isFile()) {
//                    System.out.println("File exists already");
//                    fileCheck = false;
//                } else {
//                    System.out.println("file created successfully");
//                    fileCheck = false;
//                }
//            }
            BufferedWriter wr = new BufferedWriter(new FileWriter(desktopPath + "mySchoolSystem.csv"));

            for (int i = 0;i<schCol - 1 ;i++){
                if (i == 0) {
                    System.out.println("Please enter ID");
                    schStaffDBArrayList.add("000"+ schoolDataBase.next());
                }
                System.out.println("Please enter detail " + (i + 1));
                schStaffDBArrayList.add(schoolDataBase.next());
                if (i == schCol - 1){
                    schStaffDBArrayList.add("\n");
                }
            }

            schDBArrayList.add(schStaffDBArrayList) ;
            wr.write(String.valueOf(schDBArrayList));
            wr.close();
            System.out.println("Successfully written to my School System file");

        }catch(IOException e){
            throw new RuntimeException(e);
        }
        return "";
    }
}
