package Test;

import org.testng.annotations.Test;

public class Battle {
 
@Test(priority=0)
	public void Actressacting(){
	System.out.println("Demo3");

}
	
@Test(priority=3)
public void Actoracting() {
	System.out.println("Actor");
	//throw new SkipException("msg");
}
}
