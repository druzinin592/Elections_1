package elections;

import java.awt.Component;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Result {
   
String Candidates0 = "D:\\1.txt";
       File file_0 = new File(Candidates0);
String Candidates1 = "D:\\2.txt";
       File file_1 = new File(Candidates1);
String Candidates2 = "D:\\3.txt";
       File file_2 = new File(Candidates2); 
       
       String Name_Programs = "Elections 0.4";      
       
       String[] Result = new String[3];

       Component frame = null;     
       Component icon = null;      
       
       String ZA = " за ";

       public void End_of_voting() throws IOException{ 
           
       Result[0] = "Унификацию с Германией";
       Result[1] = "Статус-кво";
       Result[2] = "Унификацию с Францией";   
   
        Scanner scan0 = new Scanner(file_0); 
                String Q0 = scan0.nextLine(); 
                   int I0 = Integer.parseInt(Q0);  
       
       Scanner scan1 = new Scanner(file_1); 
               String Q1 = scan1.nextLine(); 
                  int I1 = Integer.parseInt(Q1); 
        
       Scanner scan2 = new Scanner(file_2);
               String Q2 = scan2.nextLine(); 
                  int I2 = Integer.parseInt(Q2);
       
                  double Number_of_voters = I0+I1+I2; 
                  
                  double A0 = (I0*100)/Number_of_voters;
                  String B0 = String.format("%.2f", A0);
                              String C0 = B0+" %"+ZA+Result[0];
       
                  double A1 = (I1*100)/Number_of_voters;
                  String B1 = String.format("%.2f", A1);
                              String C1 = B1+" %"+ZA+Result[1];
       
                  double A2 = (I2*100)/Number_of_voters;
                  String B2 = String.format("%.2f", A2);
                              String C2 = B2+" %"+ZA+Result[2];
           
                              double Number_of_elector = 1000;
                              
                              double Voter_turnout_percentage = (Number_of_voters/Number_of_elector)*100;
                              String Voter_Turnout_Percentage_UPD = String.format("%.2f", Voter_turnout_percentage); 
                  
                              if(Voter_turnout_percentage > 100){
                                  
                                 JOptionPane.showMessageDialog(frame,
                                 "Голосование не действительно"+"\n"+"Явка "+Voter_turnout_percentage+" %",
                                 Name_Programs,JOptionPane.PLAIN_MESSAGE);    
                                 
                                 }else{
                                  
                                  JOptionPane.showMessageDialog(frame,
                                  "Голосование закончелось",
                                  Name_Programs,JOptionPane.PLAIN_MESSAGE);      
                        
                                  JOptionPane.showMessageDialog(frame,
                                  C0+"\n"+C1+"\n"+C2+"\n"+"Явка "+Voter_Turnout_Percentage_UPD+" %",
                                  Name_Programs,JOptionPane.PLAIN_MESSAGE);
                                  
                  }
                                                }
                    }