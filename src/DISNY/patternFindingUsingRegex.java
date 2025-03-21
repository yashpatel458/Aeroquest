package DISNY;

import java.io.*;
import java.nio.*;
import java.nio.file.*;
import java.util.*;
import java.util.regex.*;


public class patternFindingUsingRegex {
	
	public static void patterns(String pat, String folderPath) throws IOException {
		String pattern = "C\\$[\\s]+[0-9]*";



        String text;
        //System.out.println(text);
        Pattern regexPattern = Pattern.compile(pattern);

        File folder = new File(folderPath);

        for(File f : folder.listFiles()) {

            text = new String(Files.readAllBytes(Path.of(f.getAbsolutePath())));
            //System.out.println(f.getName()+"-------------------------------------------------------------");
            Matcher matcherToFindPattern = regexPattern.matcher(text);
            while (matcherToFindPattern.find()) {
            	String[] s = matcherToFindPattern.group().split(" ");
            	
            	if(s.length > 1) {
            		if(s[1].length()>2) {
                		System.out.print(s[0]+" "+s[1]+"  -  ");
                
            		}
            	}            	
            }	
            }

        }


    public static void main(String []args) throws IOException {
        patterns("C\\$[\\s]+[0-9]*","");
    }
}