public class God{
public static void main(String [] args){
Human obj=Human.getInstance();
 boolean alive=obj.getLife() ;
if (alive)
			System.out.println("I'm still alive");
		else
			System.out.println("I'm still died");
obj.setLife(!alive);
Human obj2=Human.getInstance(); 
}
}
