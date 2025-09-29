/*package com.jobPortal.job_portal.Service;
 
import org.json.JSONObject; 
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.razorpay.Order;
import com.razorpay.RazorpayClient;


@Service
public class RazorPayService {

	@Value("${razorpay.key}")
	private String key;
	
	@Value("${razorpay.secret}")
	private String secret;
	
	public String createOrder(Double amount,String currency,String receipt) {
		try {
			RazorpayClient client = new RazorpayClient(key,secret);
			
			JSONObject orderRequest=new JSONObject();
			orderRequest.put("amount",(int)(amount*100));
			orderRequest.put("currency",currency);
			orderRequest.put("receipt",receipt);
			
			Order order = client.orders.create(orderRequest);
			return order.toString();
			
		}catch(Exception e) {
			throw new RuntimeException("Error creating the Razorpay Order",e);
		}
	}
}
*/

