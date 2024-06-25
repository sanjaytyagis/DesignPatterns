package ChainOfResponsibility;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 	SupportHandler level1Handler = new Level1SupportHandler();
	        SupportHandler level2Handler = new Level2SupportHandler();
	        SupportHandler level3Handler = new Level3SupportHandler();
	 
	        level1Handler.setNextHandler(level2Handler);
	        level2Handler.setNextHandler(level3Handler);
	 
	        Request request1 = new Request(Priority.BASIC);
	        Request request2 = new Request(Priority.INTERMEDIATE);
	        Request request3 = new Request(Priority.CRITICAL);
	 
	        level1Handler.handleRequest(request1);
	        level1Handler.handleRequest(request2);
	        level1Handler.handleRequest(request3);

	}

}
