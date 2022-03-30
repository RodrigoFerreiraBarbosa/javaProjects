import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class passwordCode {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.print("Escreva sua senha: ");
	String input = scan.next();
	System.out.println(charPassword(input));
	
}

public static boolean charPassword(String password){
	if(password.length() > 6) {
		if(checkSenha(password)) {
			System.out.println("Senha boa");
			return true;
		}
		else {
			System.out.println("Senha ruim");
			return false;
		}
	}
	else {
		System.out.println("Faltam caracteres");
		return false;
	}
}


public static boolean checkSenha(String password) {
	Pattern sChar = Pattern.compile("[a-zA-z0-9]*");
	Matcher sMatChar = sChar.matcher(password);
	boolean Num = false;
	boolean Upper = false;
	boolean Lower = false;
	boolean SpeChar = false;
	char Letter;
	for(int i = 0; i < password.length(); i++) {
		Letter = password.charAt(i);
		if(Character.isDigit(Letter)) {
			Num = true;
		}
		else if(Character.isUpperCase(Letter)) {
			Upper = true;
		}
		else if(Character.isLowerCase(Letter)) {
			Lower = true;
		}
		else if(!sMatChar.matches()) {
			return true;
		}
		if(Num && Upper && Lower) {
			return true;
		}
	}
	return false;
}
}
