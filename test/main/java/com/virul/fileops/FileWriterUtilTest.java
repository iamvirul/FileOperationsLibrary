/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package main.java.com.virul.fileops;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Virul Nirmala Wickramasinghe
 */
public class FileWriterUtilTest {
    
    public FileWriterUtilTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of writeFile method, of class FileWriterUtil.
     */
    @Test
    public void testWriteFile() throws Exception {
        System.out.println("writeFile");
        String filePath = "";
        String content = "";
        FileWriterUtil.writeFile(filePath, content);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of appendToFile method, of class FileWriterUtil.
     */
    @Test
    public void testAppendToFile() throws Exception {
        System.out.println("appendToFile");
        String filePath = "";
        String content = "";
        FileWriterUtil.appendToFile(filePath, content);
    }
    
}
