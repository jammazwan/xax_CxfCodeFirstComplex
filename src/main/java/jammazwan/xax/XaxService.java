package jammazwan.xax;

import javax.jws.WebService;

import org.springframework.stereotype.Component;

import jammazwan.entity.Company;
import jammazwan.entity.CorporateEventPass;

@Component
@WebService
public interface XaxService {
	CorporateEventPass getPass(Company company);
}
