/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.java.com.virul.fileops;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Virul Nirmala Wickramasinghe
 */
public class FileSearchUtil {
       public static List<String> searchInFile(String filePath, String keyword) throws IOException {
        List<String> matchingLines = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (line.contains(keyword)) {
                    matchingLines.add(line);
                }
            }
        }
        return matchingLines;
    }
}
