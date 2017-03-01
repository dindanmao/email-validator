package email_validator.email_validator;

public class EmailValidator {
	
	public boolean isValidEmail(String str){
		//check @
		int counter = 0;
		char[] arr = str.toCharArray();
		for (char ch : arr){
			if(ch == '@'){
				counter += 1;
			}
			if(counter > 1){
				break;
			}
		}
		
		//check if there is only one @ and at least one "."
		return(counter == 1 && str.contains("."));
	}
}
