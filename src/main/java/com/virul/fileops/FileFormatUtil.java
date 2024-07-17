/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.java.com.virul.fileops;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Virul Nirmala Wickramasinghe
 */
public class FileFormatUtil {

    public static List<String[]> readCSV(String filePath) throws IOException {
        List<String[]> rows = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                rows.add(values);
            }
        }
        return rows;
    }
    public static void writeCSV(String filePath, List<String[]> data) throws IOException {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath))) {
            for (String[] row : data) {
                List<String> escapedRow = new ArrayList<>();
                for (String field : row) {
                    escapedRow.add(escapeCSVField(field));
                }
                bw.write(String.join(",", escapedRow));
                bw.newLine();
            }
        }
    }
    private static String escapeCSVField(String field) {
        if (field.contains(",") || field.contains("\"")) {
            field = field.replace("\"", "\"\"");
            return "\"" + field + "\"";
        }
        return field;
    }
}
