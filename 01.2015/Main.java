import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.FileReader;

public class Main {

	public static void main(String[] args){
		int finalFloor = 0;
		BufferedReader reader = null;

		try {
			File file = new File("input.txt");
			reader = new BufferedReader(new FileReader(file));

			String line;
			while ((line = reader.readLine()) != null) {
				finalFloor = GetFinalFloor(line) ; 
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Final Floor Santa is on: " + finalFloor); 
	}

	public static int GetFinalFloor(String data){
		int floor = 0 ; 

		char[] array = data.toCharArray();
		for (int i=0; i<array.length; i++) {
			if(array[i] =='('){
				floor ++ ; 
			}else if(array[i] ==')'){
				floor -- ; 
			}else {
				System.out.println("Error Unwanted Character found"); 
			}

			
		}
				
		return floor;
	}
}