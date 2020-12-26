package equals;

class Laptop
{
	int rs  ; 
	int hs  ; 
	double ps  ; 
	Laptop() {} 
	Laptop(int rs , int hs , double ps ){
		this.rs = rs ; 
		this.hs = hs  ; 
		this.ps = ps  ; 
	}
	public String toString() {
		System.out.println("Ram Size : " + rs + " GB") ;
		System.out.println("Hard Disk: " + hs + " GB") ;
		System.out.println("Processor Speed: "+ ps + "GHz") ;
		System.out.println("======================") ;
		return "" ; 
	}
	// override equals method 
	public boolean equals(Object obj )  
	{
		Laptop temp = (Laptop)obj;
		return rs == temp.rs && hs == temp.hs  &&  ps == temp.ps;
	}
}






