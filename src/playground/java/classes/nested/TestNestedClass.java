package playground.java.classes.nested;

import java.util.ArrayList;
import java.util.List;

public class TestNestedClass {
	public void testNestedClass(){
		List<OuterClass.NestedClass> nestedClassList = new ArrayList<>();
		for(int i=0;i<5;i++){
			OuterClass.NestedClass nestedclass = new OuterClass.NestedClass();
			nestedclass.setNestedClassId(i);
			nestedclass.setNestedClassComments("Comments for element: "+i);
			System.out.println("Added to nested List: Element:"+nestedclass.getNestedClassId()+" and comments:"+nestedclass.getNestedClassComments());
			nestedClassList.add(nestedclass);
		}
		for(OuterClass.NestedClass nestedClass : nestedClassList){
			System.out.println("iterating Over nestedClass. Current id is:"+nestedClass.getNestedClassId()+"; Current comments are:"+nestedClass.getNestedClassId()+";");
		}
		
	}
	public static void main(String[] args){
		TestNestedClass testClass =new TestNestedClass();
		testClass.testNestedClass();
	}
		
}
