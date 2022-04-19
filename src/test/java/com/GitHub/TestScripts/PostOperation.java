package com.GitHub.TestScripts;
import static io.restassured.RestAssured.*;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.TY.GitHub.Ecommerce.IEEndPoints;
import com.TY.GitHub.Ecommerce.JavaUtility;
import com.TY.GitHub.pojolib.Project;

import io.restassured.http.ContentType;


public class PostOperation extends BaseClass {
	@Test
	public void tc2() throws FileNotFoundException, IOException
	{
		String repoName=pdata.getData("name")+JavaUtility.getRandomNumb();
		Project pobj=new Project(repoName,"demo repo");
		
		given()
		.auth().oauth2(IEEndPoints.verificationcode)
		.contentType(ContentType.JSON)
		.body(pobj)
		
		.when()
		.post(IEEndPoints.postOperation)
		
		.then()
		.log().all()
		.assertThat().statusCode(201)
		.contentType(ContentType.JSON);
		
		Reporter.log("PostOperation is successful",true);
		
	}

}
