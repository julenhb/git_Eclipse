package com.julen.HolaMundo;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Scanner entrada = new Scanner(System.in);
    	System.out.println("hola, dime tu nombre");
    	String nombre = entrada.next();
        System.out.println(nombre);
    }
}
