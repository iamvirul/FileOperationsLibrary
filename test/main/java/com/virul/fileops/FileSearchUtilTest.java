/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package main.java.com.virul.fileops;

import java.util.List;
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
public class FileSearchUtilTest {
    
    public FileSearchUtilTest() {
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
     * Test of searchInFile method, of class FileSearchUtil.
     */
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
