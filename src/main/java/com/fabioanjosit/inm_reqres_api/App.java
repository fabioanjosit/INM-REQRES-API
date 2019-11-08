package com.fabioanjosit.inm_reqres_api;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;

/**
 * Hello world!
 *1. Executar a request GET https://reqres.in/api/users?page=2
 *2. Validar que o status code é igual a 200
 */
public class App 
{
    public static void main( String[] args )
    {
    	Response response = RestAssured.request(Method.GET,"https://reqres.in/api/users?page=2");
        System.out.println( response.getBody().asString() );
        System.out.println( response.statusCode());
    }
}
