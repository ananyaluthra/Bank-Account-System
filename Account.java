public class Account {
private String id;
private String name;
private int balance;
public Account(String id, String name){
this.id=id;
this.name=name;
balance=0;
}
public Account(String id, String name,int balance){
this.id=id;
this.name=name;
this.balance=balance;
}
public String getId(){
	return id;
}
public String getName(){
	return name;
}
public int getBalance(){
	return balance;
}
public int credit(int amount){
	balance+=amount;
	return balance;
}
public int debit(int amount){
	if(amount>=balance){
		System.out.println("Not enough balance");
	}
	else{
		balance=balance-amount;
	}
	return balance;
}
public int transferto(Account another, int amount){
	if (balance>=amount){
		this.debit(amount);
	    another.credit(amount);
	}
	else{
		System.out.println("Insuffiecient balance to debit");
	}
	return balance;

}
public String toString(){
	return "Account[id="+id+", name="+name+",balance="+balance+"]";
}
}
