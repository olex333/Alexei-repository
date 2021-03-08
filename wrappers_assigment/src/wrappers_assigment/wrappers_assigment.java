package wrappers_assigment;

public class wrappers_assigment {

	public static void main(String[] args) {
		Float f1=11.11f;
		Float f2= 11.11f;
		Float f3=new Float(11.11f);
		
		Double d1 = 2.34;
		Double d2 = 2.34;
		Double d3 = new Double(2.34);
		
		Long l1 = 13L;
		Long l2 = 13L;
		Long l3 = new Long (13L);
		
		
		System.out.println("f1==f2 : "+(f1==f2)); // false
		System.out.println("f1==f3 : "+(f1==f3)); // false
		
		System.out.println("d1==d2 : "+(d1==d2)); // false
		System.out.println("d1==d3 : "+(d1==d3)); // false
		
		System.out.println("l1==l2 : "+(l1==l2)); // true
		System.out.println("l1==l3 : "+(l1==l3)); // false
		
		System.out.println("(f1.equals(f2)) : "+(f1.equals(f2))); // true
		System.out.println("(f1.equals(f3)) : "+(f1.equals(f3))); // true
		
		System.out.println("(d1.equals(d2)) : "+(d1.equals(d2))); // true
		System.out.println("(d1.equals(d3)) : "+(d1.equals(d3))); // true
		
		System.out.println("(l1.equals(l2)) : "+(l1.equals(l2))); // true
		System.out.println("(l1.equals(l3)) : "+(l1.equals(l3))); // true
		
		
		System.out.println(System.identityHashCode(f1));
		System.out.println(System.identityHashCode(f2));
		System.out.println(System.identityHashCode(f3));
		
		f2++;
		System.out.println(System.identityHashCode(f2));
		
		System.out.println(System.identityHashCode(d1));
		System.out.println(System.identityHashCode(d2));
		System.out.println(System.identityHashCode(d3));
		
		d2++;
		System.out.println(System.identityHashCode(d2));
		
		System.out.println(System.identityHashCode(l1)); // same as l2
		System.out.println(System.identityHashCode(l2)); // same as l1
		System.out.println(System.identityHashCode(l3));
		
		l2++;
		System.out.println(System.identityHashCode(l2));
		
		
		float x=f2;   //auto boxing -> obj to primitive
		System.out.println("x = "+x);
		x=7.7f;
		f2=x; 
		System.out.println("f2 = "+f2);
		
		System.out.println("Float max value " +Float.MAX_VALUE);
		System.out.println("Float min value " +Float.MIN_VALUE);
		
		double c=d2;   //auto boxing -> obj to primitive
		System.out.println("c = "+c);
		c=7.7;
		d2=c; 
		System.out.println("d2 = "+d2);
		
		System.out.println("Double max value " +Double.MAX_VALUE);
		System.out.println("DOuble min value " +Double.MIN_VALUE);
		
		long v=l2;   //auto boxing -> obj to primitive
		System.out.println("v = "+v);
		v=7L;
		l2=v; 
		System.out.println("l2 = "+l2);
		
		System.out.println("Long max value " +Long.MAX_VALUE);
		System.out.println("Long min value " + Long.MIN_VALUE);
//		
//		
		String s="123.22";
		float f =Float.parseFloat(s);
		System.out.println(f);
		
		String s1="123.22";
		double d =Double.parseDouble(s1);
		System.out.println(d);
		
		String s2="123";
		// Cannot pass an number with decimal point in it
		long l = Long.parseLong(s2);
		System.out.println(l);
//		
//		
		Double d4 = f2.doubleValue();  //double long etc
		System.out.println("d = "+ d4);
		
		d4 = l2.doubleValue();  //long to double
		System.out.println("d = "+ d4);
		
		Long l4 = f2.longValue();  // float to long
		System.out.println("l = "+ l4);
		
		l4 = d2.longValue();  //double to long 
		System.out.println("l = "+ l4);
		
		Float f4 = l2.floatValue();  //long to float 
		System.out.println("f = "+ f4);
		
		f4 = d2.floatValue();  //double to float
		System.out.println("f = "+ f4);
		

	}

}
