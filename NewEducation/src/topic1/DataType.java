package topic1;
  /*    
    byte bytehold_1 = 8;
      short shorthold_2 = 16;
      int inthold_4 = 32;
      long longhold_8 = 64;
      float floathold_4 = 32;
      double doublehold_8 = 64;
      char charhold_2 = 16;
 */ 
public class DataType {
	public static void main(String[] args) {
   byte mybyte = 42;
   short[] myshort = {8808, 8000,10008, 5050};
   int myint = 330_000_000;
   long mylong = 12_500_000_00;
     float myfloat = 1.73f;
     double mydouble = 5.5555;
      char mychar = 'U';
    
      // Bellows are implicit casting ( widening).
      
      short byte_to_short = mybyte;
      int byte_to_int = mybyte;
      long byte_to_long = mybyte;
      float byte_to_float = mybyte;
      double byte_to_double = mybyte;
      
      int short_to_int = myshort[0];
      long short_to_long = myshort[1];
      float short_to_float = myshort[2];
      double short_to_double = myshort[3];
      
      int char_to_int = mychar; // Never used
      long char_to_long = mychar;
      float char_to_float = mychar;
      double char_to_double = mychar;
      
      long int_to_long = myint;
      float int_to_float = myint;
      double int_to_double = myint;
      
      float long_to_float = mylong;
      double long_to_double = mylong;
      
      double float_to_double = myfloat;
      
      // Bellows are Explicit casting (narrowing).
      
    byte short_to_byte = (byte)myshort[0];
    char short_to_char = (char)myshort[1];
    
    byte int_to_byte = (byte)mybyte;
    short int_to_short = (short)myint;
    char int_to_char = (char)myint;
    
    byte long_to_byte = (byte)mylong;
    short long_to_short = (short)mylong;
    char long_to_char = (char)mylong;
    
    byte float_to_byte =(byte)myfloat;
    short float_to_short =(short)myfloat;
    char float_to_char = (char)myfloat;
    int float_to_int = (int)myfloat;
    long float_to_long = (long)myfloat;
    
    byte double_to_byte = (byte)mydouble;
    short double_to_short = (short)mydouble;
    char double_to_char = (char)mydouble;
    int double_to_int = (int)mydouble;
    long double_to_long = (long)mydouble;
    float double_to_float = (float)mydouble;
    
	 System.out.println("Belows are implixit casting (widenning)");
	 System.out.println(" ");
	System.out.println("");
	System.out.println("byte " + 42 + " to short " + byte_to_short);
	System.out.println("byte " + 42 + " to int " + byte_to_int);
	System.out.println("byte " + 42 + " to long " + byte_to_long);
	System.out.println("byte " + 42 + " to float " + byte_to_float);
	System.out.println("byte " + 42 + " to double " + byte_to_double);
	System.out.println("");
	System.out.println("short " + 8088 + " to int " + short_to_int);
	System.out.println("short " + 8000 + " to long " + short_to_long);
	System.out.println("short " + 10008 + " to_float " + short_to_float);
	System.out.println("short " + 5050 + " to int " + short_to_double);
	System.out.println("");
	System.out.println("char " + 'U' + " to long " + char_to_long);
	System.out.println("char " + 'U' + " to float " + char_to_float);
	System.out.println("char " + 'U' + " to double " + char_to_double);
	System.out.println("");
	System.out.println("int " + 330_000_000 + " to long " + int_to_long);
	System.out.println("int " + 330_000_000 + " to float " + int_to_float);
	System.out.println("int " + 330_000_000 + " to double " + int_to_double);
	System.out.println("");
	System.out.println("long " + 12_500_000_00 + " to float " + long_to_float);
	System.out.println("long " + 12_500_000_00 + " to double " + long_to_double);
	System.out.println("");
	System.out.println("float " + 1.73f + " to double " + float_to_double);
	System.out.println("");
    System.out.println("Belows are Exlicity casting (narrowing)");
    System.out.println("");
    System.out.println("short " + 8088 + " to byte " + short_to_byte);
    System.out.println("short " + 8088 + " to char " + short_to_char);
    System.out.println(" ");
    System.out.println("int " + 330_000_000 + " to byte " + int_to_byte);
    System.out.println("int " + 330_000_000 + " to short " + int_to_short);
    System.out.println("int " + 330_000_000 + " to char " + int_to_char);
	System.out.println("");
	System.out.println("long " + 12_500_000_00 + " to byte " + long_to_byte);
	System.out.println("long " + 12_500_000_00 + " to short " + long_to_short);
	System.out.println("long " + 12_500_000_00 + " to char " + long_to_char);
	System.out.println("");
	System.out.println("float " + 1.73f + " to byte " + float_to_byte);
	System.out.println("float " + 1.73f + " to short " + float_to_short);
	System.out.println("float " + 1.73f + " to char " + float_to_char);
	System.out.println("float " + 1.73f + " to int " + float_to_int);
	System.out.println("float " + 1.73f + " to long " + float_to_long);
	System.out.println("");
	System.out.println("double " + 5.5555 + " to byte " + double_to_byte);
	System.out.println("double " + 5.5555 + " to short " + double_to_short);
	System.out.println("double " + 5.5555 + " to char " + double_to_char);
	System.out.println("double " + 5.5555 + " to int " + double_to_int);
	System.out.println("double " + 5.5555 + " to long " + double_to_long);
	System.out.println("double " + 5.5555 + " to float " + double_to_float);
	}

}
