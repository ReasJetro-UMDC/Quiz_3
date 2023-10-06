/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quiz_3;

import java.util.Scanner;


public class Quiz_3 {

    public static int MAX = 10;
    private int [] data = new int [MAX];
    
    private int front = -1;
    private int rear = -1;
    
    public void insertBeginning (int item) throws Exception {
        if (rear == MAX -1) {
             throw new Exception("Queue is full");
             
        } if (front == -1) {
            front = rear = 0;
            data[front] = item;
            
        } else {
            if (front == 0) {
           throw new Exception("Cannot insert at the beginning. Queue is full.");
           
        }
            data[--front] = item;
        }
    }
    
    private void insertEnding (int item)throws Exception {
        
        if (rear == MAX - 1) {
            throw new Exception("Queue is full");
        }
        data[++rear] = item;
    }
    
    public int deleteBeginning () throws Exception {
        if (front == -1) {
          throw new Exception("Queue is empty");
          
        } 
        int temp = data [front];
        if (front == rear) {
            front = rear = -1;
            
        } else {
            rear ++;
            
        }
        return temp;
    }
    
    public int deleteEnding () throws Exception {
        if (front == -1) {
          throw new Exception("Queue is empty");
          
        } 
        int temp = data [front];
        if (front == rear) {
            front = rear = -1;
            
        } else {
            rear --;
            
        }
        return temp;
    }
    
    public void display () throws Exception {
        if (front == -1) {
            throw new Exception("Queue is empty");
            
        } for (int i = front; i <= rear; i++) {
            System.out.println(data[i] + ",");
            
        }
        System.out.println("null");
    }
   
    public static void main(String[] args) {
        Quiz_3 list = new Quiz_3 ();
        Scanner scn = new Scanner (System.in);
        
      while (true) {
            System.out.println("===========Number List===========");
            System.out.println("1. Insert a number the beginning");
            System.out.println("2. Delete number from the beginning");
            System.out.println("3. Insert number at the end");
            System.out.println("4. Delete number from the end");
            System.out.println("5. Display of number");
            System.out.println("6. Exit");
          int choice = scn.nextInt();
        
          try {
              switch (choice) {
                  case 1:
                      System.out.println("Insert number at beginning: ");
                      int item = scn.nextInt();
                      list.insertBeginning(item);
                      break;
                  case 2 :
                      System.out.println("delete number at beginning");
                     int deleteItem = list.deleteBeginning();
                      System.out.println("deleted string" + deleteItem);
                  case 3:
                      System.out.println("insert number at ending");
                      int item1 = scn.nextInt();
                      list.insertEnding(item1);
                  case 4:
                      System.out.println("delete a number");
                      int deleteItem1 = list.deleteEnding();
                      System.out.println("deleted name" + deleteItem1);
                  case 5:
                      System.out.println("Display list of number : ");
                      list.display();
                  case 6:
                      System.out.println("Exiting the program.");
                      scn.close();
                      System.exit(MAX);
                  default:
                      throw new AssertionError();
              }
              
              
              
          } catch (Exception e) {
              System.out.println("Exception" +e.getMessage());
    }
  }  
 }
}
