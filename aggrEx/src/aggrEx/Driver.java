package aggrEx;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Driver {

	public static void main(String[] args) throws FileNotFoundException{
		// TODO Auto-generated method stub
		 
	Circle c = new Circle();
	double result = c.area(5);
	System.out.println(result);

	BufferedReader Employee = new BufferedReader(new FileReader("empList.txt"));
	BufferedReader Address = new BufferedReader(new FileReader("address.txt"));

	Scanner employeeScanner = new Scanner(Employee);
	Scanner addressScanner = new Scanner(Address);

	while(employeeScanner.hasNextLine()){
		String data = employeeScanner.nextLine();
		System.out.println(data);
	}
	while(addressScanner.hasNextLine()){
		String data1 = addressScanner.nextLine();
		System.out.println(data1);
	}
	
	Address address0 = new Address("Norman", "OK", "USA");
	Address address1 = new Address("OKC", "OK", "USA");
	Address address2 = new Address("Dallas", "Tx", "USA");
	
	Emp e0 = new Emp(100, "John", address0);
	Emp e1 = new Emp(100, "John", address1);
	Emp e2 = new Emp(100, "John", address2);
	
	e0.display();
	e1.display();
	e2.display();
	
	}

}
