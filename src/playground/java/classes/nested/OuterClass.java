package playground.java.classes.nested;

public class OuterClass {

	int outerRequestId;
	public int getOuterRequestId() {
		return outerRequestId;
	}

	public void setOuterRequestId(int outerRequestId) {
		this.outerRequestId = outerRequestId;
	}

	public String getOuterComments() {
		return outerComments;
	}

	public void setOuterComments(String outerComments) {
		this.outerComments = outerComments;
	}

	String outerComments;
	
	static class NestedClass{
		int nestedClassId;
		public int getNestedClassId() {
			return nestedClassId;
		}
		public void setNestedClassId(int nestedClassId) {
			this.nestedClassId = nestedClassId;
		}
		public String getNestedClassComments() {
			return nestedClassComments;
		}
		public void setNestedClassComments(String nestedClassComments) {
			this.nestedClassComments = nestedClassComments;
		}
		String nestedClassComments;
	}
		
}
