/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package main.java.com.virul.fileops;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Virul Nirmala Wickramasinghe
 */
public class FileReaderUtilTest {

    @Test
    public void testReadFile() throws Exception {
        System.out.println("readFile");
        String filePath = "";
        String expResult = "";
        String result = FileReaderUtil.readFile(filePath);
        assertEquals(expResult, result);
    }
}
