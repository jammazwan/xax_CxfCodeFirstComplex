package jammazwan.xax;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.beans.factory.annotation.Autowired;

public class XaxRoutes extends RouteBuilder {

	@Autowired
	private XaxProcessor xaxProcessor;

	@Override
	public void configure() throws Exception {
		from("cxf:bean:eventPassEndpoint").process(xaxProcessor).log("\n\n${body}\n\n");
	}
}
