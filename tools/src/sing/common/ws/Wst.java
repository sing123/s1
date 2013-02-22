package sing.common.ws;

import javax.jws.WebService;

@WebService
public class Wst {

	public String sayHello() {
		return "helloworld";
	}

	public static void main(String[] args) {
		//发布一个WebService 
		javax.xml.ws.Endpoint.publish("http://localhost:8989/Wst", new Wst());
	}

}
