package iofile;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.FilterWriter;
import java.io.IOException;

public class OutputFile {
    public void writeFile(String pathFile, String line){
        try {
            FileWriter fileWriter = new FileWriter(pathFile, true);
            BufferedWriter bufferWrite = new BufferedWriter(fileWriter);
            bufferWrite.write(line);
            bufferWrite.newLine();
            bufferWrite.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }

    // test 
    public static void main(String[] args) {
        OutputFile out = new OutputFile();
        out.writeFile("D:/Downloads", "Phú");
    }
}
