public class soal17 {
   
    public static int methodA(int a, int b) {
	return a * b / methodB(a, b);
}

public static int methodB(int a, int b) {
	if (b == 0)
		return a;
	return methodB(b, a % b);
} 

 public static void main(String[] args) {
    int a = 8;
    int b = 25;
    int hasil = methodA(a, b); 
    System.out.println(hasil);
 }


}






