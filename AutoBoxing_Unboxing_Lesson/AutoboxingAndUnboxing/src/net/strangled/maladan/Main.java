package net.strangled.maladan;

import java.util.ArrayList;
class IntegerClass {
	private int myValue;

	public IntegerClass(int myValue) {
		this.myValue = myValue;
	}

	public int getMyValue() {
		return myValue;
	}

	public void setMyValue(int myValue) {
		this.myValue = myValue;
	}
	
}
public class Main {

	public static void main(String[] args) {
		String[] strArray = new String[10];
		int[] intArray = new int[10];
		strArray[0] = "hello";
		intArray[0] = 100;
		ArrayList<String> list = new ArrayList<String>();
		list.add("Tim");
		ArrayList<IntegerClass> intList = new ArrayList<IntegerClass>();
		intList.add(new IntegerClass(100));
		
		Integer integer = new Integer(54);
		Double Value = new Double(19.34);
		
		ArrayList<Integer> intArrayList = new ArrayList<Integer>();
		for(int i = 0; i <= 10; i++) {
			//Autoboxing
			intArrayList.add(Integer.valueOf(i));
		}
		int i = 0;
		for(Integer blarg: intArrayList) {
			System.out.println((i) + " --> " + (intArrayList.indexOf(blarg)));
			//Unboxing
			System.out.println("Unboxing --> " + intArrayList.get(i).intValue());
			i++;
		}
		
		Integer myIntValue = 56;
		int myInt = myIntValue;
		
		ArrayList<Double> myDoubleValues = new ArrayList<Double>();
		for(double dbl=0.0; dbl <=10.0; dbl += 0.5) {
			myDoubleValues.add(Double.valueOf(dbl));
		}
		i = 0;
		for(i = 0; i < myDoubleValues.size(); i++) {
			double value = myDoubleValues.get(i);
			System.out.println(i + " --> " + value);
		}
	}

}
