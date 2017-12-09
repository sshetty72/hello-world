package com.mycompany.apps.pkg;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
	if (args.length != 0) {
		System.out.println("Did not expect any parameters");
		System.exit(-1);
	}
	System.exit(0);
    }
}
