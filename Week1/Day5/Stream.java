


	/*
	 * Using Java 8 features write a method that returns a comma separated string
	 * based on a given list of integers. Each element should be preceded by the
	 * letter 'e' if the number is even, and preceded by the letter 'o' if the
	 * number is odd. For example, if the input list is (3,44), the output should be
	 * 'o3,e44'.
	 */

	public String getString(List<Integer> list) {
	return list.stream()
	  .map(i -> i % 2 == 0 ? "e" + i : "o" + i)
	  .collect(joining(",")); // accumulate elements of the Stream into a Collection.
	}


	/*
	 * Given a list of Strings, write a method that returns a list of all strings
	 * that start with the letter 'a' (lower case) and have exactly 3 letters. TIP:
	 * Use Java 8 Lambdas and Streams API's.
	 */
	public List<String> search(List<String> list) {
	return list.stream()
	  .filter(s -> s.startsWith("a"))
	  .filter(s -> s.length() == 3)
	  .collect(Collectors.toList()); //collect the result of stream pipeline in a List
	}
