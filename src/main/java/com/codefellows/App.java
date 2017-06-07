package com.codefellows;

import com.google.code.externalsorting.ExternalSort;
import java.io.File;
import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
        File f1 = new File("input.txt");
        File f2 = new File("output.txt");
        ExternalSort.mergeSortedFiles(ExternalSort.sortInBatch(f1), f2);
    }
}
