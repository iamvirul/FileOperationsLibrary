/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package main.java.com.virul.fileops;

import org.junit.Test;

/**
 *
 * @author Virul Nirmala Wickramasinghe
 */
public class FileWriterUtilTest {

    @Test
    public void testAppendToFile() throws Exception {
        System.out.println("appendToFile");
        String filePath = "";
        String content = "";
        FileWriterUtil.appendToFile(filePath, content);
    }
}
