package test;
public class Test{ 

public static void main(String[] args) { 

byte bytes = -2; 

int result = bytes&0xff; 
System.out.println("�޷�����: \t"+result); 
System.out.println("2����bitλ: \t"+Integer.toBinaryString(result)); 
} 
}