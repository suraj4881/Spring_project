package in.ineuron.service;

import in.ineuron.dto.CustomerDTO;

public interface ICustomerMgmtService {

	public String calcuateSimpleInterest(CustomerDTO dto) throws Exception;
	
}
