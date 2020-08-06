
public class DemoOb {

	public static void main(String[] args) {
		DemoOb d1=new DemoOb();/*Instance of d1 created on stack and pointing to instance
								of demoob which is created on heap*/
		DemoOb d2=d1;		   /*Instance of d2 created on stack and pointing to that instance
								Where d1 points to*/
		d1=new DemoOb(); 		/*Instance of d1 which is already created on stack now pointing to instance
								of demoob which is newly created on heap*/
		/*now d1 pointing to twoo object and d2 pointing to same object where firstly d1 points to*/
		

	}

}
