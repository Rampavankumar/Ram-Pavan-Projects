package Interface;

public class Execute1 implements Example1 {

	public void rampavan() {
		
	for(int i=0;i<=100;i++){
		
		if(i%3==0){
			System.out.println("puzz");
			
			
		}
		else if(i%5==0){
			System.out.println("buzz");
			
			
		}else if(i%3!=0 && i%5!=0){
			System.out.println(i);
		}
	}
	}


	public void pavan() {

	for(int j=0;j<5;j++){
		
		System.out.println("the rebel");
		
		
		
	}
		
	}
	

	
	public void kumar() {
	System.out.println("46lakestreet");
	
		
	}

	
	public void vamc() {
		
System.out.println("king");		
	}



public static void main(String[] args) {

Execute1 ex=new Execute1();

ex.rampavan();
ex.kumar();
ex.vamc();
ex.pavan();

System.out.println(ex);
	
}
}




