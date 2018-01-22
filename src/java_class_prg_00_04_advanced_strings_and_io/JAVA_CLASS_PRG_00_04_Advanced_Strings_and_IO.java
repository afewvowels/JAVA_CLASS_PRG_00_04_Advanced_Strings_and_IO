/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_class_prg_00_04_advanced_strings_and_io;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author kbsmith01
 */
public class JAVA_CLASS_PRG_00_04_Advanced_Strings_and_IO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Comparing objects, memory locations v. similar object contents
        Stack s1 = new Stack();
        Stack s2 = new Stack();
        
        if (s1 == s2) {
            System.out.println("s1 equals s2");
        }
        else {
            // Will print becuase s1 and s2 have different
            // memory locations
            System.out.println("s1 not equal s2");
        }
        
        // Assigning same memory location:
        s1 = s2;
        // Now will equal each other
        if (s1 == s2) {
            System.out.println("s1 equals s2");
        }
        else {
            // Will print becuase s1 and s2 have different
            // memory locations
            System.out.println("s1 not equal s2");
        }
        
        // Compare strings .equals method
        String password = "xyzzy";
        if (password .equals("xyzzy")) {
            System.out.println("Equals");
        }
        else {
            System.out.println("Not equal");
        }
        
                
        // Compare strings == shortcut
        // Works in newer versions of Java
        if (password == "xyzzy") {
            System.out.println("Equals");
        }
        else {
            System.out.println("Not equal");
        }
        
        // Input / Output
        // Input, println v. print
        // Line break v. no line break
        System.out.println("Print this");
        System.out.print("Print that");
        System.out.print("\n");
        
        // Input, input string and scanner
        String input;
        
        Scanner keyboard = new Scanner(System.in);
        
        input = keyboard.nextLine();
        System.out.println(input);
        
        // 2 variations of catching invalid input
        if (keyboard.hasNextDouble()) {
            input = keyboard.nextLine();
        }
        else {
            System.out.println("That is not a double");
        }
        
        while (!keyboard.hasNextDouble()) {
            input = keyboard.nextLine();
            System.out.println("That is not a double, please try again: ");
        }
    }
    
}
