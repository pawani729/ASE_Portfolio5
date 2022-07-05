package FP;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.List;
import java.util.stream.Collectors;

public class File8 {
	public static void main(String[] args) throws Exception{
		BufferedReader r = new BufferedReader(new FileReader("WS5Data/The-King-James-Bible.txt"));
		List <String> l =r.lines().collect(Collectors.toList());
		
		for(String line:l)
			System.out.println(line);
		
		r.close();
	}

}
