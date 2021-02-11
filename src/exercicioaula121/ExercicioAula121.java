/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicioaula121;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Cesar
 */
public class ExercicioAula121 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                
        System.out.println("Enter Client data:");
        System.out.print("Name:");
        String name = sc.nextLine();
        System.out.print("Email:");
        String email = sc.nextLine();
        System.out.print("Bith date: DD/MM/YYYY ");
        Date birthDate = sdf.parse(sc.nextLine());              
       
        Client client = new Client(name, email, birthDate);
        
        System.out.println("Enter order data:");
        System.out.print("Status:");
        String orderStatus = sc.nextLine();
        
        Order order = new Order( new Date(), OrderStatus.valueOf(orderStatus) , client );   
        System.out.print(" How Many items to this order?");
        int qorder = sc.nextInt();
        
        
        for (int i = 0 ; i < qorder; i++){
            System.out.println("Enter #" + i + " item data:");
            System.out.print("Product name:");
            sc.nextLine();
            String productName = sc.nextLine();
            System.out.print("Product price:");
            double price = sc.nextDouble();
            System.out.print("Quantity:");
            int quantity = sc.nextInt();
            Product product = new Product(productName, price);
            OrderItem orderItem = new OrderItem(quantity , product);
            order.addItem(orderItem);
            
        }
         
        System.out.println();
        System.out.println(order);
        
        sc.close();
        // TODO code application logic here
    }
    
}
