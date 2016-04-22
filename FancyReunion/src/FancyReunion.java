import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;



class Alumnus implements Comparable<Alumnus>{
	public String name;
	public int year;
	public Alumnus(){
		name = "John";
		year = 1950;
	}
	public Alumnus(String str, int yr){
		name = str;
		year = yr;
	}
	public String toString(){
		return name + " (" + year + ")";
	}
	@Override
	public int compareTo(Alumnus arg0) {
		
		return (name.compareTo(arg0.name));
	}
}
public class FancyReunion {

	public static void main(String[] args) {
		
		ArrayList<Alumnus> alumni = new ArrayList<Alumnus>();
		int count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter file name: ");
		String fname = sc.nextLine();
		String line;
		String[] parts;
		String name;
		int year;
		
		try {
		Scanner filesc = new Scanner(new File(fname));
		while (filesc.hasNextLine()) {
		line = filesc.nextLine();
		parts = line.split(" ");
		name = parts[0] + " " + parts[1];
		year = Integer.parseInt(parts[2]);
		alumni.add(new Alumnus(name,year));
		count++;
		}
		
		filesc.close();
		Collections.sort(alumni);//sorting of the alumni list
		for (int i = 0; i < count; i++) {
		System.out.println(alumni.get(i));
		}
		
		} catch (Exception e) {
		System.out.println(e);
		System.out.println("oops");
		}
	}

}
