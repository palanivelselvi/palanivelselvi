package Demo;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Testcase1 {
  @Test
  public void f() {
	  
	  Response response;
	  
	  response = RestAssured.get("http://localhost:8080/InfyClinicV2/getDoctor/byID?doctorId=1001");
	  String value = response.getBody().asString();
	  System.out.println(value);
  }
}
