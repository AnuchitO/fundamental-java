import java.lang.reflect.Method;

public class Processor {
	public static void processAnnotation(Object target) {
		Class<?> clazz = target.getClass();
		Method[] methods = clazz.getDeclaredMethods();
		for (Method method : methods) {
			GetMapping getMapping = method.getAnnotation(GetMapping.class);
			if (getMapping != null) {
				System.out.println("Do something here - GetMapping: to  " + getMapping.value());
			}
		}
	}
}
