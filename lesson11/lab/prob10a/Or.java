package lesson11.lab.prob10a;

import java.util.*;

public class Or {

	public static void main(String[] args) {
		List<Simple> list = Arrays.asList(new Simple(false), new Simple(false), new Simple(true));

		Or or = new Or();
		System.out.println(or.someSimpleIsTrue(list));
	}
	
	public boolean someSimpleIsTrue(List<Simple> list) {
//		boolean accum = false;
//		for(Simple s: list) {
//			accum = accum || s.flag;
//		}
//		return accum;



		return list.stream()
					.map(s -> s.flag)
					.reduce(false, (a, b) -> a || b);
	}
}
