/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package main.java.com.virul.fileops;

import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Virul Nirmala Wickramasinghe
 */
public class FileSearchUtilTest {

    @Test
    public void testSearchInFile() throws Exception {
        System.out.println("searchInFile");
        String filePath = "";
        String keyword = "";
        List<String> expResult = null;
        List<String> result = FileSearchUtil.searchInFile(filePath, keyword);
        assertEquals(expResult, result);
    }
}
