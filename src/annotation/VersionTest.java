package annotation;

@Version(major = 1, minor = 0)
public class VersionTest {
	@Version(major = 1, minor = 1)
	private int xyz = 110;
	
	@Version(major = 1, minor = 0)
	public VersionTest() {
		
	}
	
	@Version(major = 1, minor = 0)
	public VersionTest(int xyz) {
		this.xyz = xyz;
	}
	
	@Version(major = 1, minor = 0)
	public void printData() {
		
	}
	
	@Version(major = 1, minor = 1)
	public void setXyz(int xyz) {
		int newValue = xyz;
		this.xyz = xyz;
	}
}
