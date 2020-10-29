package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Factory {

	static List<Pojo> emp = new ArrayList<>();

	public static void main(String[] args) {

		emp.add(new Pojo("venkat", 50));
		emp.add(new Pojo("akash", 60));
		emp.add(new Pojo("praveen", 70));
		emp.add(new Pojo("vijay", 80));
		emp.add(new Pojo("jerom", 80));
		emp.add(new Pojo("saran", 80));

//		Collecting to map
		Map<String, Integer> maps = emp.stream().filter(p -> p.id > 50)
				.collect(Collectors.toMap(Pojo::getName, Pojo::getId));

		System.out.println(maps);

//		Collecting and filtering values to set

		Set<String> names = emp.stream().filter(p -> p.getId() > 70).map(Pojo::getName).collect(Collectors.toSet());

		System.out.println(names);

//		Collecting as list

		List<Integer> id = emp.stream().map(p -> p.getId()).collect(Collectors.toList());

		System.out.println(id);

	}

}
