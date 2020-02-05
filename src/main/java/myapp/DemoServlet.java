/*
 * Copyright 2016 Google Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


import java.util.Locale;
import java.util.Scanner;
/*Very very simple Java Calculator for beginners just for 4 operations on 
 * two variables without exception and while loop*/

public class DemoServlet {
	Scanner scan = new Scanner(System.in); 
	
	
	

	public void showMenu() {
		System.out.println("1.Addition");
		System.out.println("2.Substraction");
		System.out.println("3.Multiplication");
		System.out.println("4.Division");

	}

	public double division() {
		scan.useLocale(Locale.US); //set to this have "." instead of "," it depends on your region
		double a, b;
		System.out.println("Enter first value");
		a = scan.nextDouble();
		System.out.println("Enter first value");
		b = scan.nextDouble();
		double val = a / b;

		return val;
	}

	public double mutliplication() {
		scan.useLocale(Locale.US);
		double a, b;
		System.out.println("Enter first value");
		a = scan.nextDouble();
		System.out.println("Enter first value");
		b = scan.nextDouble();
		double val = a * b;

		return val;
	}

	public double substraction() {
		scan.useLocale(Locale.US);
		double a, b;
		System.out.println("Enter first value");
		a = scan.nextDouble();
		System.out.println("Enter first value");
		b = scan.nextDouble();
		double val = a - b;

		return val;
	}

	public double addition() {
		scan.useLocale(Locale.US);
		double a, b;
		System.out.println("Enter first value");
		a = scan.nextDouble();
		System.out.println("Enter first value");
		b = scan.nextDouble();
		double val = a + b;

		return val;
	}

	public static void main(String[] args) {
		SimpleCalculator calc = new SimpleCalculator();
		Scanner scan = new Scanner(System.in);
		scan.useLocale(Locale.US);
		int x;
		double score;
		calc.showMenu();
		x = scan.nextInt();

		switch (x) {
		case 1:
			score = calc.addition();
			System.out.println(score);
			break;
		case 2:
			score = calc.substraction();
			System.out.println(score);
			break;
		case 3:
			score = calc.mutliplication();
			System.out.println(score);
			break;
		case 4:
			score = calc.division();
			System.out.println(score);
			break;
		default:
			System.out.println("Wrong choice");
			break;
		}

	}

}
