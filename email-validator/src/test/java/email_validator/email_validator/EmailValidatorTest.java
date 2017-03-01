package email_validator.email_validator;

import org.junit.Test;
import junit.framework.TestCase;
import static org.junit.Assert.*;

public class EmailValidatorTest  extends TestCase{
	
	@Test
	public void testIsValidEmail(){
		EmailValidator ev = new EmailValidator();
		
		//valid email
		String validEmail = "test@test.com";
		String validEmailTwoDots = "test.test@test.com";
		
		//invalid email
		String invalidEmailNoAt = "test.test.com";
		String invalidEmailTowAt = "test@test@test.com";
		String invalidEmailNoDot = "test@testcom";
		
		//check if the valid emails return true
		assertEquals(ev.isValidEmail(validEmail), true);
		assertEquals(ev.isValidEmail(validEmailTwoDots), true);
		
		//check if the invalid emails return false
		assertEquals(ev.isValidEmail(invalidEmailNoAt), false);
		assertEquals(ev.isValidEmail(invalidEmailTowAt), false);
		assertEquals(ev.isValidEmail(invalidEmailNoDot), false);
		
	}
	
}
