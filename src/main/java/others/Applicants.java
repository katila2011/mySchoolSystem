package others;
import enums.Gender;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

//staff is an interface containing the filepath of the writer so it has to be implemented here
public class Applicants implements staff{
    public Applicants(){

    }

    public void applicantsMethod() throws IOException{
        String applName;
        int age;
        Gender applGender = null;
        String applGenderSpecific;
        Scanner scanInput = new Scanner(System.in);
        System.out.println("Please enter age of applicant");
        age =  scanInput.nextInt();
        if (age<8) {
            System.out.println("Sorry, Applicant too young, wait till at least 8 years old");
        } else if (age>15) {
            System.out.println("Sorry, Applicants older than 15 can't be admitted");
        }else{
            boolean applicantsboolean = false;
            while(!applicantsboolean) {
                System.out.println("Please enter Name of Applicant");
                applName = scanInput.next();
                System.out.println("Please 'male' or 'female' for gender of Applicant");
                applGenderSpecific = scanInput.next();
                schApplicantsDBArrayList.add(applName);
                schApplicantsDBArrayList.add(String.valueOf(age));
                schApplicantsDBArrayList.add(applGenderSpecific);
                schApplicantsDBArrayList.add("\n");
                System.out.println("Would you like to add another applicant detail? Yes or No please");
                if (!(scanInput.next() == "yes")) {
                    applicantsboolean = false;
                    break;
                }else{
                    continue;
                }
            }

            //writing to csv operation
            BufferedWriter wr = new BufferedWriter(new FileWriter(desktopPath + "mySchoolSystem.csv"));
            schDBArrayList.add(schApplicantsDBArrayList);
            wr.write(String.valueOf(schDBArrayList));
            wr.close();
            System.out.println("Successfully written to my School System file");
        }
    }

    @Override
    public String staffWriterMethod1() throws IOException {
        return "";
    }
}
