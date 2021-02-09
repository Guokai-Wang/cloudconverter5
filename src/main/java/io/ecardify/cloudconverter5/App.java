package io.ecardify.cloudconverter5;
import java.io.File;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // System.out.println( "Hello World!" );
    	CloudConverter converter = new CloudConverter("API-key here");
    	try
    	{
    		converter.convert(new File("abc.txt"), new File("abc.doc"), "txt", "doc");
    	}
    	catch(Exception exception) {}
    }
}
