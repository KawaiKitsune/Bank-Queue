/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bank.queue;

import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;
/**
 *
 * @author MissRed
 */
public class BankQueue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           Scanner scan = new
           Scanner (System.in);
           Queue<String> queue = new
           LinkedList<>();
           int customerNum = 1;
           
           
           while (true) {
               
               System.out.println("\n1. Add Customer");
               System.out.println("2. Server Customer"); 
               System.out.println("3. View Queue");
               System.out.println("4. Exit");
               
               int choice = scan.nextInt();
               scan.nextLine();
               
                switch (choice) {
                    case 1 : 
                        System.out.println("Enter customer name: "); 
                        String name = scan.nextLine();
                        String customer = "Customer # " + customerNum + " " + name;
                        queue.add(customer);
                        System.out.println(customer + " added.");
                        customerNum++;
                        break;
                    
                    case 2 :
                        if (queue.isEmpty()) {
                            System.out.println("No customers to serve.");
                        } else {
                            String served = queue.poll();
                            System.out.println("Now serve: " + served);
                        }
                        break;
                    
                    case 3:
                        if (queue.isEmpty()) {
                            System.out.println("Queue is currently empty."); 
                        } else {
                            System.out.println("Current queue: ");
                                for (String customers: queue){
                                    System.out.println(customers);
                            }
                        }
                        break;
                        
                    case 4:
                        scan.close();
                        return;
                        
                    default:
                         System.out.println("Invalid choice");
            }
        }
    }
}
