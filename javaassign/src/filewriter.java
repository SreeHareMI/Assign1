import java.io.File;
import java.io.FileWriter;

public class filewriter {
	
		public static void main(String args[]) {
			String name= "sree hare is in Mphasis";
			try{
				FileWriter output = new FileWriter("D://Users//sony//Simplilearn//javaassign//src//innerclass");
			
			    output.write(name);
			    
			     System.out.println("Data is written to the file.");

		     
		      output.close();
			
			}	
			catch (Exception e) {
			      e.getStackTrace();
			    }
		}
	}

