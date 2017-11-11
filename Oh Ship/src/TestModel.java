
public class TestModel {

	//private String input;
	private String output;
	
	public TestModel() {
		//input = "";
		output = "";
		System.out.println("Constructed");
		
	}
//	public void setInput(String input) {
//		//this.input = input;
//	}
	
	public void setOutput(String output) {
		this.output = output;
	}
	
	public String getOutput() {
		return output;
	}
	
	public String update(String input) {
		output = input + ", this was added by the testmodel class";
		return output;
	}
	
	
	
}
