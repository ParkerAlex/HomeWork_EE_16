package eu.senla;

 
import java.io.File;
import java.io.FileOutputStream;
 
 
import java.text.SimpleDateFormat;
import java.time.LocalDate;
 
import java.util.ArrayList;
import java.util.Calendar;
 
import java.util.List;
import java.util.Scanner;

 

import eu.senla.product.Product;

public class Main {
	public static void main(String[] args) {

		String date = new SimpleDateFormat("MM/dd/yyyy").format(Calendar.getInstance().getTime());
		 
		System.out.println(date);
		 
		List<Product> productList = new ArrayList<>();
		
		File file = new File("C:/КУРСЫ/ECLIPSE/javadev/ws/Homework_EE_16/src/eu/senla/files/product");
		try {
		 		
				Scanner scan = new Scanner(file);
				  while (scan.hasNextLine()) {
					  String line = scan.nextLine();  
					  String[] s = line.split("-");
					  Product product = new Product(Integer.parseInt(s[0]), s[1], getDate(s[2]));
					  
					  productList.add(product);
 
				  }
		} catch (Exception e) {
			e.printStackTrace();
		   }
		
		 
		
		try {
	 		 
			while(true) {
				Scanner sc = new Scanner(System.in);
				System.out.println("Выберете:");
				System.out.println("1 - работа с товарами");
				System.out.println("2 - работа с заказами"); 
				System.out.println("3 - ВЫХОД");
				
				String number_1 = sc.next();
	
				  if("3".equals(number_1)) {
					  break;
				    }
				  
				  if ("1".equals(number_1)) {
					  
					 
					  
					  while(true) {
						  
						  
						  System.out.println("Напишите что делать  с товарами:");
						  System.out.println("1 -  Просмотреть все товары");
						  System.out.println("2 -  Добавить товары");
						  System.out.println("3 -  Удалить товары");
						  System.out.println("4 -  ВЫХОД");
						  
						  String number_2 = sc.next();
						  
							  if((!"1".equals(number_2)) && (!"2".equals(number_2)) && (!"4".equals(number_2))) {	//если неверное число			     
								  System.out.println("ВВедено неверное число, повторите:");
								  System.out.println();
							    }
						  
						    if ("1".equals(number_2)) {
						    	System.out.println(productList);
						    	System.out.println();
					           }
						    
						    if ("2".equals(number_2)) {                                //ВВОДИМ НОВЫЙ ТОВАР
						    	System.out.println("ВВЕДИТЕ ТОВАР:");
						    	System.out.println();
						    	 String number_3 = sc.next();  
						    	try(FileOutputStream out = new FileOutputStream(file, true)) {
						    		

						    		 int size = productList.size() + 1;
							    	  out.write(("\r\n" + size + "-" + number_3 + "-" + date.toString()).getBytes());
									  
							    	 
							    	  
								} catch (Exception e) {
									e.printStackTrace();
								    }
					           }
						    
						    if ("4".equals(number_2)) {
						    	break;
					  }
						    
				    }
				
			}
			 
			  }
	} catch (Exception e) {
		e.printStackTrace();
	   }
	    
		}
	
	
	
	    private static LocalDate getDate(String date) {
	    	String[] split = date.split("/");
	    	return LocalDate.of(Integer.parseInt(split[2]), Integer.parseInt(split[1]), Integer.parseInt(split[0]));	    	 
	    } 
	}


