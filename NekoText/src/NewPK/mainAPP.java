package NewPK;

public class mainAPP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//版本一
		System.out.println("1st Version");
		neko na = new neko();
		System.out.println();
		System.out.println(na.add(10, 5));
		//new push
	}

}
class neko{
	int add(int a, int b) {
		return a+b;
	}
}