package ChainOfResponsibility;

 interface SupportHandler {
	void handleRequest(Request request);
    void setNextHandler(SupportHandler nextHandler);
}
