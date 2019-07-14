package com.tfss;

import com.jayway.jsonpath.JsonPath;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TfssJsonpathApplicationTests {

	String json = "{\n" +
			"    \"store\": {\n" +
			"        \"book\": [\n" +
			"            {\n" +
			"                \"category\": \"reference\",\n" +
			"                \"author\": \"Nigel Rees\",\n" +
			"                \"title\": \"Sayings of the Century\",\n" +
			"                \"price\": 8.95\n" +
			"            },\n" +
			"            {\n" +
			"                \"category\": \"fiction\",\n" +
			"                \"author\": \"Evelyn Waugh\",\n" +
			"                \"title\": \"Sword of Honour\",\n" +
			"                \"price\": 12.99\n" +
			"            },\n" +
			"            {\n" +
			"                \"category\": \"fiction\",\n" +
			"                \"author\": \"Herman Melville\",\n" +
			"                \"title\": \"Moby Dick\",\n" +
			"                \"isbn\": \"0-553-21311-3\",\n" +
			"                \"price\": 8.99\n" +
			"            },\n" +
			"            {\n" +
			"                \"category\": \"fiction\",\n" +
			"                \"author\": \"J. R. R. Tolkien\",\n" +
			"                \"title\": \"The Lord of the Rings\",\n" +
			"                \"isbn\": \"0-395-19395-8\",\n" +
			"                \"price\": 22.99\n" +
			"            }\n" +
			"        ],\n" +
			"        \"bicycle\": {\n" +
			"            \"color\": \"red\",\n" +
			"            \"price\": 19.95\n" +
			"        }\n" +
			"    },\n" +
			"    \"expensive\": 10\n" +
			"}";
	@Test
	public void contextLoads() {
		List<String> test1 = JsonPath.read(json,"$.store.book[*].author");
		System.out.println(test1);
		List<String> test2 = JsonPath.read(json,"$..author");
		System.out.println(test2);
		List<String> test3 = JsonPath.read(json,"$.store.*");
		System.out.println(test3);

	}

}
