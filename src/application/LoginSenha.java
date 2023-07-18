package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Login;

public class LoginSenha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner scString = new Scanner(System.in);
		Scanner sc =  new Scanner(System.in);
		
		System.out.println("-----------------");
		
		System.out.println("Creating your User.");
		System.out.print("Enter your User Login: ");
		String tempLogin = scString.nextLine();
		System.out.print("Enter your Password: ");
		String tempSenha = scString.nextLine();
		Login login1 = new Login(tempLogin, tempSenha);
		System.out.println();
		System.out.println("Login "+ login1.getUsuario() +" created");
		System.out.println("-----------------");
		
		System.out.println();
		System.out.println("Login identification.");
		System.out.print("Enter your username: ");
		String testeLogin = scString.nextLine();
		System.out.print("Enter your password: ");
		String testeSenha = scString.nextLine();
		login1.fazerLogin(testeLogin, testeSenha);
		
		scString.close();
		sc.close();
	}

}
