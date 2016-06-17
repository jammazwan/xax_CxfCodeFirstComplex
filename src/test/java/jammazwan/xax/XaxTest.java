package jammazwan.xax;

import org.apache.camel.test.spring.CamelSpringTestSupport;
import org.junit.Test;
import org.springframework.context.support.AbstractXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import jammazwan.entity.Company;
import jammazwan.entity.CorporateEventPass;

public class XaxTest extends CamelSpringTestSupport {

	@Override
	protected AbstractXmlApplicationContext createApplicationContext() {
		return new ClassPathXmlApplicationContext("META-INF/spring/camel-context.xml");
	}

	@Test
	public void testXax() throws Exception {
		 Thread.sleep(Long.MAX_VALUE); // poor man's server
		Company company = new Company();
		company.setCompanyName("Abc Corporation");
		company.setContacts(756);
		company.setRank(27);
		CorporateEventPass corporateEventPass = template.requestBody("cxf:bean:eventPassEndpoint", company,
				CorporateEventPass.class);
		assertEquals("Purple", corporateEventPass.getColor());
	}

}
