package com.fabioanjosit.inm_reqres_api;

import org.junit.Assert;
import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;

public class RestAPI_Test {

	@Test
	public void TestREST_API(){
		Response response = RestAssured.request(Method.GET,"https://reqres.in/api/users?page=2");
        Assert.assertTrue("StatusCode deveria ser 200",response.statusCode() == 200);
        Assert.assertEquals(200, response.statusCode());
 	}
	
}
