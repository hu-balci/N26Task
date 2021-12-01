package com.N26.Task3;

import com.Utilities.ConfigurationRW;
import io.restassured.http.ContentType;
import io.restassured.response.ValidatableResponse;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import io.restassured.response.Response;

import java.util.HashMap;
import java.util.Map;

public class ProductFlow {


        /*
    Given accept type and Content type is JSON
    And request json body is:
    {
      "name": "Pixel XL",
    "type": "Cellphone",
    "price": 250,
    "shipping": 0,
    "upc": "04945060711",
    "description": "Unlocked",
    "manufacturer": "Google-Inc",
    "model": "GA02099-US",
    "url": "www.bestbuy.com/site/google-pixel",
    "image": "jpg;maxHeight=640;maxWidth=550"
   }
    When user sends POST request to 'http://localhost:3030/products'
    Then status code 201
    And content type should be application/json
    And json payload/response should contain:
    same data posted.
 */


    @Test
    public void postProduct(){


        Product product=new Product();

        product.setName("Pixel XL");
        product.setType("Cellphone");
        product.setPrice(250);
        product.setShipping(0);
        product.setUpc("04945060711");
        product.setDescription("Unlocked");
        product.setManufacturer("Google-Inc");
        product.setModel("GA02099-US");
        product.setUrl("www.bestbuy.com/site/google-pixel");
        product.setImage("jpg;maxHeight=640;maxWidth=550");

                 given().log().all()
                .accept(ContentType.JSON)
                .and()
                .contentType(ContentType.JSON)
                .and()
                .body(product)
                .when()
                .post("http://localhost:3030/products")

                .then().log().all()
                .assertThat().statusCode(201)
                .and()
                .contentType("application/json")
                .and().assertThat().header("Allow",equalTo("GET,POST,PUT,PATCH,DELETE"))
                .and().assertThat().header("Access-Control-Allow-Origin",equalTo("*"))
                .and().assertThat().header("X-Powered-By",equalTo("Express"))
                .and().header("Connection",equalTo("keep-alive"))
                         .and().assertThat().header("allow",equalTo(""))
                .and().body("name",equalTo("Pixel XL"),"type",equalTo("Cellphone"));



    }

    //    a new product is created by using POJO class.
//    an object created for custom java class
//    all necessary data is added by using custom java class object
//    I defined content type.
//    when send post method to "http://localhost:3030/products"
//    A new product is created with a unique id
//    Assertion of status code, headers and some part of payload is done





    /*
          Given accept type is Json
          And Id parameter value is 9999687
          When user sends GET request to "http://localhost:3030/products/{id}"
          Then response status code should be 200
          And response content-type: application/json;charset=UTF-8
          And "Pixel XL" should be in response payload
       */

    @Test
    public void getProduct(){

                 given().log().all()
                .accept(ContentType.JSON)
                .and().pathParam("id", "9999687")
                .when().get("http://localhost:3030/products/{id}")
                .then().log().all()
                .assertThat().statusCode(200)
                .and()
                .contentType("application/json; charset=utf-8")
                .and().header("connection", equalTo("keep-alive"))
                .and().header("Vary", equalTo("Accept, Accept-Encoding"))
                .and().assertThat().body("name", equalTo("Pixel XL"));

    }

    //retrieved data of a product with id
//    I defined content type and id as a path parameter
//    when send get method to "http://localhost:3030/products/{id}"
//    The information about that specific product is appear in the request
//    Assertion of status code,headers and payload is done






 /*
          Given accept type is Json
          And Id parameter value is 9999687
          And request json body is:
        {
      "type": "Mobile Phone",
         }
          When user sends Patch request to "http://localhost:3030/products/{id}"
          Then response status code should be 200
          And response content-type: application/json;charset=UTF-8
          And "Mobile Phone" should be in response payload
       */


    @Test
    public void patchProduct(){

        Map<String,Object> patchProductMap = new HashMap<>();
        patchProductMap.put("type","Mobile Phone");


        given().log().all()
                .and()
                .contentType(ContentType.JSON)
                .and()
                .pathParam("id",9999685)
                .and()
                .body(patchProductMap).
                when()
                .patch("http://localhost:3030/products/{id}")
                .then().log().all()
                .assertThat().statusCode(200).and()
                .contentType("application/json; charset=utf-8")
                .and().header("connection", equalTo("keep-alive"))
                .and().header("Vary", equalTo("Accept, Accept-Encoding"))
                .and().body("type",equalTo("Mobile Phone"));

    }

    //update data of a product with id
//    I defined content type and path parameter id
//    when send patch method to "http://localhost:3030/products/{id}"
//    The information about that specific product is updated
//    Assertion of status code,headers and payload is done



/*         Given accept type is Json
          And Id parameter value is 9999687
          When user sends Delete request to "http://localhost:3030/products/{id}"
          Then response status code should be 200

 */

    @Test
    public void deleteProduct(){

        given().
                pathParam("id",9999685)
                .when()
                .delete("http://localhost:3030/products/{id}")
                .then()
                .statusCode(200).log().all();


    }

    //delete data of a service with id
//    I defined id as a path parameter
//    when send delete method to "http://localhost:3030/products/{id}"
//    The all information about that deleted service is appear in the payload
//    Assertion of status code is done









}
