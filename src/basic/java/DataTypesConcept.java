package basic.java;

public class DataTypesConcept {

	public static void main(String[] args) {
		//data types:
				//strict-type data
				
				//1. primitive data types: no need of object
					//A. Boolean type: true, false
					//B. Numeric Type: 
							//B.1: Character: char
							//B.2: Integral Value:
									//B.2.1: Integer: byte, short, int, long
									//B.2.2: Floating-point: float, double
				//2. non-primitive data types: String, Arrays, Class, Abs, Interface
						
				
				//1. byte:
				//size: 1 byte = 8 bits
				//range: -128 to 127
				byte b = 10;
				byte c = 120;
				byte f = -90;
				byte t = 0;
				
				byte i = 10;
				i = 20;
				i = 30;
				
				System.out.println(b);
				System.out.println(i+c+f+t);
				
				//2. short:
				//size: 2 bytes = 2x8 = 16 bits
				//range: -32768 to 32767
				short s = 1000;
				short s1 = 10;
				System.out.println(s);
				System.out.println(s1);
				
				//3. int:
				//size: 4 bytes = 4x8 = 32 bits
				//range: -2147483648 to 2147483647
				int total = 12000;
				int fee = 34567890;
				System.out.println(total);
				System.out.println(fee);
				int k = 1;
				int p = 12;
				System.out.println(k);
				System.out.println(p);
				
				//4. long:
				//size: 8 bytes: 8x8 = 64 bits
				//range: 
				long l = 10;
				long distance = 12121212121212l;
				System.out.println(distance);
				System.out.println(l);
				//long ph = 9898989898l;
				long pop = 1212121212;
				System.out.println(pop);
				
				//5. float:
				//size: 4 bytes = 32 bits
				//range: upto 7 decimal digits
				float t1 = 12.33f;
				float t2 = (float)123.44;
				System.out.println(t1);
				System.out.println(t2);
				System.out.println(t1+t2);
				
				
				//6. double:
				//size: 8 bytes = 64 bits
				//range: upto 16 decimal digits
				double d1 = 12.33d;
				double d2 = 1.333445d;
				System.out.println(d1);
				System.out.println(d2);
				double d3 = 100;
				System.out.println(d3);
				
				//7. char:
				//size: 2 bytes = 16 bits
				char x = 'a';
				char x1 = 'b';
				char y = '1';
				char z = '$';
				System.out.println(x);
				System.out.println(x+x1);
				System.out.println(y+z);
				
				//8. boolean: 1 bit 
				boolean flag = true;
				flag = false;
				System.out.println(flag);
	}

}
