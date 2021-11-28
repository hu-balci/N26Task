package com.N26.Task3;

import io.restassured.http.ContentType;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

public class ServiceFlow {

      /*
    Given accept type and Content type is JSON
    And request json body is:
    {
      "name": "New Digital Bank",

   }
    When user sends POST request to 'http://localhost:3030/services'
    Then status code 201
    And content type should be application/json
    And json payload/response should contain:
    same data posted.
 */


    @Test
    public void postService(){
        Map<String,Object> newService=new HashMap<>();

       newService.put("name","New Digital Bank");
        given().log().all()
                .accept(ContentType.JSON)
                .and()
                .contentType(ContentType.JSON)
                .and()
                .body(newService)
                .when()
                .post("http://localhost:3030/services")
                .then().log().all()
                .assertThat().statusCode(201)
                .and()
                .contentType("application/json; charset=utf-8")
                .and().assertThat().header("allow",equalTo("GET,POST,PUT,PATCH,DELETE"))
                .and().assertThat().header("access-control-allow-origin",equalTo("*"))
                .and().assertThat().header("x-powered-by",equalTo("Express"))
                .and().header("connection",equalTo("keep-alive"))
                .body("name",equalTo("New Digital Bank"));

    }

//    a new service is created by using Map structure.
//    I add necessary data to body and defined content type.
//    when send post method to "http://localhost:3030/services"
//    A new services created with a unique id
//    Assertion of status code,headers and payload is done




     /*
          Given accept type is Json
          And Id parameter value is 31
          And request json body is:
        {
      "name": "New Digital Bank2",
         }
          When user sends Patch request to "http://localhost:3030/services/{id}"
          Then response status code should be 200
          And response content-type: application/json;charset=UTF-8
          And "New Digital Bank2" should be in response payload
       */

     @Test
    public void GetService(){

         given().log().all()
                .and().accept(ContentType.JSON)
                .and().pathParam("id","31")
                .when().get("http://localhost:3030/services/{id}")
                .then().log().all()
                 .and().assertThat().statusCode(200)
                .and().contentType("application/json; charset=utf-8")
                .and().assertThat().header("allow",equalTo("GET,POST,PUT,PATCH,DELETE"))
                .and().assertThat().header("access-control-allow-origin",equalTo("*"))
                .and().assertThat().header("x-powered-by",equalTo("Express"))
                .and().header("connection",equalTo("keep-alive"))
                 .body("name",equalTo("New Digital Bank"));



    }

    //retrieved data of a service with id
//    I defined content type and id as a path parameter
//    when send get method to "http://localhost:3030/services/{id}"
//    The information about that specific service is appear in the request
//    Assertion of status code,headers and payload is done






   /*
          Given accept type is Json
          And Id parameter value is 31
          And request json body is:
        {
      "name": "New Digital Bank2",
         }
          When user sends Patch request to "http://localhost:3030/services/{id}"
          Then response status code should be 200
          And response content-type: application/json;charset=UTF-8
          And "New Digital Bank2" should be in response payload
       */

    @Test
    public void patchService(){
        Map<String,Object> patchServiceMap = new HashMap<>();
        patchServiceMap.put("name","New Digital Bank2");


        given().log().all()
                .and()
                .contentType(ContentType.JSON)
                .and()
                .pathParam("id",31)
                .and()
                .body(patchServiceMap).
                when()
                .patch("http://localhost:3030/services/{id}")
                .then().log().all()
                .assertThat().statusCode(200)
        .and().body("name",equalTo("New Digital Bank2"));

    }

    //update data of a service with id
//    I defined content type and path parameter id
//    when send patch method to "http://localhost:3030/services/{id}"
//    The information about that specific service is updated
//    Assertion of status code,headers and payload is done





    /*         Given accept type is Json
          And Id parameter value is 31
          When user sends Delete request to "http://localhost:3030/services/{id}"
          Then response status code should be 200

 */
    @Test
    public void deleteService(){

        given().
                pathParam("id",31)
                .when()
                .delete("http://localhost:3030/services/{id}")
                .then()
                .statusCode(200).log().all();



    }

    //delete data of a service with id
//    I defined id as a path parameter
//    when send delete method to "http://localhost:3030/services/{id}"
//    The all information about that deleted service is appear in the payload
//    Assertion of status code is done




}
