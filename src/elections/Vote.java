package elections;
// Too bad there is no export
import java.awt.Component;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;
import javax.swing.Icon;
import javax.swing.JOptionPane;

public class Vote {
  
// File location and name
String Candidates0 = "D:\\1.txt";
       File file_0 = new File(Candidates0);
String Candidates1 = "D:\\2.txt";
       File file_1 = new File(Candidates1);
String Candidates2 = "D:\\3.txt";  
       File file_2 = new File(Candidates2);     
       // various variables       
       Scanner scan;
       String text,Q;
       int I;
       File Main_File;
   
       String[] Result = new String[3];
       
       Component frame = null;     
       Component icon = null;
      
       String R = "Спасибо за голос";
       String Foreword = "Саарский плебисцит (1935)";  
       String Name_Programs = "Elections 0.4";

       String ZA = " за";
    
       public void Choice() throws IOException{  
       // date and time start of voting  
       Calendar calendar = new GregorianCalendar();
                calendar.set(Calendar.YEAR, 2021);
                calendar.set(Calendar.MONTH, 2);
                calendar.set(Calendar.DAY_OF_MONTH, 8);
                
                Date date0 = calendar.getTime();
                // date and timeend of voting
                Date date1 = new Date(); 
                
                if( date1.getTime() >= date0.getTime()){
                    Result Result0 = new Result();
                           Result0.End_of_voting();     
                /*            
                }else if(date1.getTime() <= date0.getTime()){
                        Result Result = new Result();
                        Result.End_of_voting();  
                */        
                }else{  
                // Choice options    
                Result[0] = "Унификацию с Германией"; 
                Result[1] = "Статус-кво";
                Result[2] = "Унификацию с Францией";
                         
                Object[] possibilities = {Result[0], 
                                          Result[1], 
                                          Result[2]};   
                
                String V = (String)JOptionPane.showInputDialog(frame,
                            Foreword,
                            Name_Programs,
                            JOptionPane.PLAIN_MESSAGE,(Icon) 
                            icon,
                            possibilities,
                            Result[0]);
                            // Assigning values
                            if(V.equals(Result[0])) Main_File = new File(Candidates0);
                            if(V.equals(Result[0])) scan = new Scanner(Main_File);

                               if(V.equals(Result[1])) Main_File = new File(Candidates1);
                               if(V.equals(Result[1])) scan = new Scanner(Main_File);

                                  if(V.equals(Result[2])) Main_File = new File(Candidates2);
                                  if(V.equals(Result[2])) scan = new Scanner(Main_File);                                  
                                     // Voice recording
                                     Q = scan.nextLine();                                              
                                     I =Integer.parseInt(Q);                             
                                     I++;                          
                                     // Voice file recording
                                     try (FileWriter writers = new FileWriter(Main_File)) { 
                                                     text = Integer.toString(I);
                                                     writers.write(text);
                                     } 
                                     
                     }
                
                               
                                              }  
                  }
//предупреждение: [параметры] путь к классу начальной загрузки не задан вместе с -source 8 (1 предупреждение)
//warning: [options] bootstrap class path not set in conjunction with -source 8 (1 warning)
//C:\Windows\System32\javaw.exe