package lesson13.lab.prob2;
import java.util.*;

public class GroupUtil {
	//Fix this code
	public static <T> Group<?> copy(Group<?> group) {
		List<T> elements = (List<T>) group.getElements();
		Group<T> grp = new Group<T>((T) group.getSpecialElement(), elements);
		return grp;
	}
	
	//Test using this main method
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(0,1,2,3,4);
		Group<Integer> group = new Group<>(0, list);
		System.out.println(group);
		System.out.println(GroupUtil.copy(group));
	}
}
