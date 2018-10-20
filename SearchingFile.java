package manual;

import java.io.File;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class SearchingFile {
	
	public static Scanner x;
	
	public void readRecord(String filepath, String searchItem) {
		boolean found = false;
		String ID = "";
		String name = "";
		String age = "";
		String next = "";
		
		try {
			x = new Scanner(new File(filepath));
			x.useDelimiter("[ \n]");
			
			while(x.hasNext() && !found) {
				 ID = x.next();
				 name = x.next();
				 age = x.next();
				 next = x.next();
				 
				 if(ID.equals(searchItem)) {
						System.out.println("result are below"+next);
						//JOptionPane.showMessageDialog(null, "Name : "+name+" ; ID : "+ID+" ; Age : "+age);
						found = true;
					}
			}
			if(found) {
				JOptionPane.showMessageDialog(null, "Name : "+name+" ; ID : "+ID+" ; Age : "+age);
			}else {
				JOptionPane.showMessageDialog(null, "The Result could not found!");
			}
			
			
			
		}catch(Exception e) {
			System.out.println("Erro"+e);
			
		}
	}
	

	public static void main(String[] args) {
		SearchingFile obj = new SearchingFile();
		String filepath = "C:\\Users\\Asus\\Desktop\\data.txt";
		String searchItem = "3001";
		obj.readRecord(filepath, searchItem);

	}

}
