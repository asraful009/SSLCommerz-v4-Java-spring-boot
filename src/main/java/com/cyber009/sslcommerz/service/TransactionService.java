package com.cyber009.sslcommerz.service;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.cyber009.sslcommerz.sslutility.SSLCommerz;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class TransactionService {

  public TransactionService() {
  }

  public String trInit(UUID orderId, Float total) {
    try {
      SSLCommerz commerz = new SSLCommerz("simec631ec4d8482e2", "simec631ec4d8482e2@ssl", true);
      Map<String, String> postData = new HashMap<>();
      log.info(orderId.toString());

      postData.put("total_amount", "" + total);
      postData.put("currency", "BDT");
      postData.put("tran_id", "" + orderId.toString());

      postData.put("success_url", "http://localhost:9000/success.php"); // your success url
      postData.put("fail_url", "http://localhost:9000/fail.php"); // your fail url --error
      postData.put("cancel_url", "http://localhost:9000/cancel.php"); // your cancel url
      postData.put("ipn_url", "http://localhost:9000/ipn.php"); // your ipn url

      postData.put("product_category", "SecurityDeposit");
      // postData.put("tokenize_id", "1");
      postData.put("emi_option", "1");
      postData.put("product_profile_id", "2");
      postData.put("product_amount", "" + total);
      postData.put("product_profile", "non-physical-goods");
      // postData.put("previous_customer", "No");

      postData.put("cus_name", "ABC XYZ");
      postData.put("cus_email", "abc@abc.com");
      postData.put("cus_add1", "Dhaka");
      postData.put("cus_add2", "Dhaka");
      postData.put("cus_city", "Dhaka");
      postData.put("cus_state", "Dhaka");
      postData.put("cus_postcode", "1000");
      postData.put("cus_country", "Bangladesh");
      postData.put("cus_phone", "01778359951");
      postData.put("cus_fax", "01778359951");

      postData.put("ship_name", "DDDGGGG");
      postData.put("ship_add1", "Dhaka");
      postData.put("ship_add2", "Dhaka");
      postData.put("ship_city", "Dhaka");
      postData.put("ship_state", "Dhaka");
      postData.put("ship_postcode", "1000");
      postData.put("ship_phone", "");
      postData.put("ship_country", "Bangladesh");

      postData.put("shipping_method", "NO");
      postData.put("product_name", "Security Deposit");

      postData.put("num_of_item", "1");
      postData.put("cart",
          "{\"sku\" : \"REF0001\", \"supplier reg\" : \"DHK TO BRS AC A1\", \"quantity\" : \"1\", \"amount\" : \"120.00\"}");

      postData.put("topup_number", "01711111111");

      String a = commerz.initiateTransaction(postData, true);

      log.info("a>>> {}", a);
      return a;
    } catch (Exception e) {
      e.printStackTrace();
      return e.getMessage();
    }
  }
}
