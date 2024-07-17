/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package main.java.com.virul.fileops;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Virul Nirmala Wickramasinghe
 */
public class FileFormatUtilTest {
    
        @Test
    public void testWriteCSV() {
            try {
                String filePath = "testwrite.csv";
                List<String[]> data = new ArrayList<>();
                data.add(new String[]{"Name", "Age", "City"});
                data.add(new String[]{"Alice", "30", "New York"});
                FileFormatUtil.writeCSV(filePath, data);
                List<String[]> rows = FileFormatUtil.readCSV(filePath);
                assertEquals(2, rows.size());
                assertArrayEquals(new String[]{"Alice", "30", "New York"}, rows.get(1));
            } catch (IOException ex) {
                Logger.getLogger(FileFormatUtilTest.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    
}
