package datastructures.linear;

class User{
	int user_id;
	String user_name;
	//parameterised constructor
	public User(int user_id,String user_name) {
		super();
		this.user_id=user_id;
		this.user_name=user_name;
	}
}
public class constructor {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User[] user;
		user = new User[5];
		user[0]=new User(101,"Alex");
		user[1]=new User(102,"Alen");
		user[2]=new User(103,"bob");
		user[3]=new User(104,"clare");
		user[4]=new User(105,"daniel");
		for(int i=0;i<user.length;i++) {
			System.out.println(i+" "+user[i]);
		}
	}

}
