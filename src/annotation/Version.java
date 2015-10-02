package annotation;

public @interface Version {
	int major();
	int minor() default 0;
}
