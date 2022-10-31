/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author acer
 */
public class Main {
    public static void main(String args[]) {
		Person p1;
		Girlfriend gf = new Girlfriend("Chiella", 20, "Filipino", "Engineer");
		Boyfriend bf = new Boyfriend("Darren", 21, "Canadian", "Architect");
		
		
		p1 = gf;
		System.out.println(p1.getName() + ": " + p1.greetings(bf));
		
		p1 = bf;
		System.out.println(p1.getName() + ": " + p1.greetings());
	}  
}
