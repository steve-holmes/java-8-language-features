package lambda;

@FunctionalInterface
public interface Mapper<T> {
	int map(T source);
	
	public static <U> int[] mapToInt(U[] list, Mapper<? super U> mapper) {
		int[] mappedValues = new int[list.length];
		
		for (int i = 0; i < list.length; i++) {
			mappedValues[i] = mapper.map(list[i]);
		}
		
		return mappedValues;
	}
}
