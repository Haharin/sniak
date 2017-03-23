package com.sniak;
import java.io.*;
/**
 * Created by sniak on 23.03.2017.
 */
public class GameHelper {
    public String getUserInput(String prompt) {
        String inputeLine = null;
        System.out.print(prompt + "  ");
        try {
            BufferedReader is = new BufferedReader(new InputStreamReader((System.in)));
            inputeLine = is.readLine();
            if (inputeLine.length() ==0) return  null;
        } catch (IOException e) {
            System.out.println("IOException: " + e);
        }
        return inputeLine;
    }
}
