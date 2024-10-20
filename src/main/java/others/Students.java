package others;
import enums.Gender;

import java.io.*;
import java.util.Scanner;

//staff is an interface containing the filepath of the writer so it has to be implemented here
public class Students implements staff {
    public Students(){

    }
    @Override
    public String staffWriterMethod1() throws IOException {
        return "";
    }

    //This is a reader file that reads student information from csv file
    public static String StudentInfo() throws IOException{

        FileReader fr = new FileReader(desktopPath+ "/mySchoolSystem.csv");
        BufferedReader br = new BufferedReader (fr);

        int i;
        while((i = br.read()) != -1){
            System.out.print((char)i);
        }
        br.close();
        fr.close();

        return "";
    }


    public String studentWriterMethod() throws IOException {
        int schRow;
        Scanner schoolDataBase = new Scanner(System.in);

        System.out.println("How many columns do you want");
        int schCol = schoolDataBase.nextInt();

        boolean fileCheck = false;
//        while (!fileCheck) {
//            if (fileName.exists() & fileName.isFile()) {
//                System.out.println("File exists already");
//                fileCheck = true;
//            } else {
//                //System.out.println("file created successfully");
//                fileCheck = true;
//            }
//        }

            BufferedWriter wr = new BufferedWriter(new FileWriter(desktopPath + "mySchoolSystem.csv"));

        for (int i = 0;i<schCol - 1 ;i++){
            if (i == 0) {
                System.out.println("Please enter ID");
                schstudentsDBArrayList.add("000"+ schoolDataBase.next());
            }
            System.out.println("Please enter detail " + (i + 1));
            schstudentsDBArrayList.add(schoolDataBase.next());

            if (i == schCol - 1){
                schstudentsDBArrayList.add("\n");

            }

        }

        schDBArrayList.add(schstudentsDBArrayList) ;
        wr.write(String.valueOf(schDBArrayList));
        wr.close();


        return "Data Successfully written to my School System file";
    }

}
