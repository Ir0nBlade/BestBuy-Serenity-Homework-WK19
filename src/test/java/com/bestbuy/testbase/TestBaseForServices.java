package com.bestbuy.testbase;

import com.bestbuy.constants.Path;
import com.bestbuy.utils.PropertyReader;
import io.restassured.RestAssured;
import org.junit.BeforeClass;

/**
 * @author Vimal Vithalpura
 * @project BestBuy-Serenity-Homework-WK19
 * @created 08/01/2022
 */
public class TestBaseForServices {

    public static PropertyReader propertyReader;

    @BeforeClass
    public static void initialize(){
        propertyReader = PropertyReader.getInstance();
        RestAssured.baseURI = propertyReader.getProperty("baseUrl");
        RestAssured.port = Integer.parseInt(propertyReader.getProperty("port"));
        RestAssured.basePath = Path.SERVICES;
    }
}
