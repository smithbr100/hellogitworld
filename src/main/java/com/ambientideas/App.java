package com.ambientideas;

/**
 * Hello again
 * Hello world!
 * Hello
 */
public class App 
{
    public static void main( String[] args )
    {
    	//Comment
        System.out.println( "Hello World from Ambient Ideas!\nHere's where I am:" );
		try {
			throw new ArithmeticException();
		}
		catch(Throwable t) {
			t.printStackTrace();
		}
    }
}

//foo
