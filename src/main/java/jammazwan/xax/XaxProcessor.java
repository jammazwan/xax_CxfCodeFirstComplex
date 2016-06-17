package jammazwan.xax;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.springframework.stereotype.Component;

import jammazwan.entity.Company;
import jammazwan.entity.CorporateEventPass;

@Component
public class XaxProcessor implements Processor {

	public void process(Exchange exchange) throws Exception {
		Company company = exchange.getIn().getBody(Company.class);
		CorporateEventPass corporateEventPass = new CorporateEventPass(company);
		exchange.getIn().setBody(corporateEventPass);
	}

}
