package FP;

import java.io.BufferedReader;
import java.io.FileReader;

public class File1 {
	public static void main(String[] args)throws Exception{
		BufferedReader r = new BufferedReader(new FileReader("WS5Data/The-King-James-Bible.txt"));
		r.lines().forEach(l->System.out.println(l));
		r.close();
	}


}
