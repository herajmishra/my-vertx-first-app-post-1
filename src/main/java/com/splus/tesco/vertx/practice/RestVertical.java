package com.splus.tesco.vertx.practice;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Future;
import io.vertx.core.json.Json;
import io.vertx.ext.web.Router;
import io.vertx.ext.web.RoutingContext;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.splus.tesco.vertx.practice.beans.Product;
import com.splus.tesco.vertx.practice.handler.FirstHandler;

public class RestVertical extends AbstractVerticle{
	private Map<Integer, Product> products = new LinkedHashMap<>();
	
	@Override
	public void start(Future<Void> future){
		List names = Arrays.asList("Heraj", "Sonam", "Mamta", "Hemant", "Harsh");
		names.forEach(name -> System.out.println(name));
		createSomeData();
		Router router = Router.router(vertx);
		router.get("/api/products").handler(this::getAll);
		router.get("/api/products1").handler(this::getAll1);
		//router.route().handler(new FirstHandler());
		vertx
	     .createHttpServer()
	     .requestHandler(router::accept)
	     .listen(
	         // Retrieve the port from the configuration,
	         // default to 8080.
	         config().getInteger("http.port", 8080),
	         result -> {
	           if (result.succeeded()) {
	        	   future.complete();
	           } else {
	        	   future.fail(result.cause());
	           }
	         }
	     );
		
		
	}
	
	private void createSomeData(){
		Product product = new Product(1, "Samsung J7 Pro", "2343tdf344", "black", 1);
		products.put(Product.getCounter(), product);
		product = new Product(2, "Apple iphone 5S", "aip343tdf344", "white", 1);
		products.put(Product.getCounter(), product);
	}
	
	private void getAll(RoutingContext routingContext) {
		routingContext.response().putHeader("content-type", "application/json; charset=utf-8").end(Json.encodePrettily(products.values()));
	}
	
	private void getAll1(RoutingContext routingContext) {
		
		//routingContext.response().putHeader("content-type", "application/json; charset=utf-8").end(Json.encodePrettily(products.values()));
	}

}
