
public class Testcountthechar {
public static void main(String[] args) {
	 String[] name = {"koashal","satyam","shubham"};
			  int count = 0;
	 for (char ch= 'a';ch<='z'; ch++){
		 for (int i = 0; i < name.length; i++) {
			for (int j = 0; j < name[i].length(); j++) {
				if(name[i].charAt(j)==ch) {
					count++;
				System.out.println(  name[i].charAt(j)+ "="+ch);
				}
				count = 0;
			}
		}
		 
		 
		 
		 
		 
		 
		 
		 
	 }
	
	
	
	
	
	
	
	
	
	
	
}
}
