
import java.util.HashMap;
import java.util.Scanner;

public class SimpleHashMap {

    // method main(): ALWAYS the APPLICATION entry point
    public static void main (String[] args) {

	System.out.println ("This program uses a hash map to store key-value country names:");

	//create a new HashMap with two Strings as Key-Value pairs
	HashMap<String, String> myHashMap = new HashMap<String, String>();

	//put items into the HashMap...Must be strings. The first argument is the Key. 
	myHashMap.put("GBR", "United Kingdom of Great Britain and Northern Ireland" );
	myHashMap.put("IDN", "Indonesia" );
	myHashMap.put("IND", "India" );
	myHashMap.put("MEX", "Mexico" );
	myHashMap.put("USA", "United States of America" );
	myHashMap.put("TUR", "Turkey" );

	//prints out the entire hash map, converted to string format
	//System.out.println (myHashMap.toString());

	//prints out a value from the key using the .get() functiona
	//System.out.println (myHashMap.get("IDN"));

	Scanner scan = new Scanner(System.in);
	System.out.println("enter a three letter country code...");
	String myInput = scan.nextLine();
	System.out.println(myHashMap.get(myInput));

    }
}