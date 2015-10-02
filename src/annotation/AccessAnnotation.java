package annotation;

@Version(major=1, minor=0)
public class AccessAnnotation {
	@Version(major=1, minor=1)
	public void testMethod1() {
		
	}
	
	@Version(major=1, minor=2)
	@Deprecated
	public void testMethod2() {
		
	}
}
