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
		int howManyTimeSantaInBasement = 1;
		char[] array = data.toCharArray();
		for (int i=0; i<array.length; i++) {
			if(array[i] =='('){
				floor ++ ; 
			}else if(array[i] ==')'){
				floor -- ; 
			}else {
				System.out.println("Error Unwanted Character found"); 
			}

		
			if(floor == -1 ){
				// here we have to account for Starting the loop from 0 
				System.out.println("Santa is in the basement!! at step number: "+ (i+ 1) + " , number of occurences" + howManyTimeSantaInBasement); 
				howManyTimeSantaInBasement ++;
			}
		}
							
		return floor;
	}
}