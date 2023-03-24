
public class ArrayCube {
public static void main(String[] args) {
	int a[]= {1,2,3,4,5};
	int cube=1;
	for (int i = 0; i < a.length; i++) {
		cube=a[i]*a[i]*a[i];
		System.out.println(cube);
	}
	
}
}
