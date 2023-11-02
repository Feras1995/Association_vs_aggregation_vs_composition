public class WebServer2 {
    private HttpListner httpListner;
    private RequestProcessor requestProcessor;
    public WebServer2(HttpListner httpListner,RequestProcessor requestProcessor){
        this.httpListner=httpListner;
        this.requestProcessor=requestProcessor;
    }
}
