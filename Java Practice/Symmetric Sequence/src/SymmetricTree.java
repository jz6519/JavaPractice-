import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SymmetricTree {

	private static final int Integer = 0;

	public static void main(String[] args) {
		int sequenceLength = 10;
		
		List<Integer> listRight = IntStream.range(1, sequenceLength + 1)
										.boxed()
										.collect(Collectors.toList());
		
		
		System.out.println(listRight);		
	
	Collections.reverse(listRight);
	
		System.out.println(listRight);
		
	}

	private static List[] split(List<Integer> listRight) {
		// TODO Auto-generated method stub
		return null;
	}

}
 