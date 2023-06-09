package com.techelevator.logger;

import java.io.Closeable;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Logger implements Closeable {

    private File logFile; // holds the File object
    private FileWriter writer; // FileWriter object

    public Logger(String pathName){
        logFile = new File(pathName); // instantiate the log file to the path
        // if the file already exists, we want to append
        if (logFile.exists()){
            // need to append
            // in order to append, we need a FileWriter that we set append to true
            try {
                writer = new FileWriter(logFile, true);
            } catch (IOException e) {
                e.printStackTrace(); // maybe replace with sout?
            }
        } else {
            // otherwise we want to create
            try {
                writer = new FileWriter(logFile); // create the object
            } catch (IOException e) {
                System.out.println("Unable to to create logFile");
            }
        }
    }

    public void write(String message){
        try {
            writer.write(message + "\n");  // write to a buffer
            writer.flush(); // write to the logfile - flush the buffer to the file
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void close() throws IOException {
        writer.close();
    }
}
