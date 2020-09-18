package javainterview;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Read_Write_Excel {

	public static void main(String[] args) {
		
		
		try {
			FileInputStream fis=new FileInputStream("C:\\Users\\Siddu\\Desktop\\Testdata.xlsx");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		

	}

}
