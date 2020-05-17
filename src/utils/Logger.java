package utils;

import java.io.*;
import java.time.ZonedDateTime;

// Logger class
public class Logger {

    private static final File File = new File("src/resources/logs/app_log.txt");

    public Logger(){};

    // Log func
    public static void log(String user, boolean success){
        ZonedDateTime now =  ZonedDateTime.now();

        try{
            BufferedWriter bw = new BufferedWriter(new FileWriter(File,true));

            String delim = " - ";
            String  isSuccessful  = success ? "Success" : "Failure";
            String logText = now + delim + user + delim + isSuccessful ;

            bw.write(logText);
            bw.close();
            System.out.println("Success: Info written to log file");

        }catch (IOException e){
            System.out.println("Logger Exception: " + e.getMessage());
        }
    }


    // clear log - for testing
    public static void clearLog(){
        // TODO: function to delete the log file contents
    }

    // Test Logger
    public static void main(String args[]){
        Logger logit = new Logger();
        logit.log("thunt", true);
    }
}

