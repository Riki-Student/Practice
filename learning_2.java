
public class learning_2 {
static void riki(int num) {

	int someone=0;
	if(num==0)
	{
		return;
	}
	System.out.print(num%10);
	riki(num/10);
	

}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num=1234;
riki(num);
//changes
//more changes
	}

}
