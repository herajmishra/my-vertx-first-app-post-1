package com.splus.tesco.vertx.practice.handler;

import io.vertx.core.Handler;
import io.vertx.core.eventbus.Message;
import io.vertx.ext.web.RoutingContext;

import com.splus.tesco.vertx.practice.beans.Product;
import com.splus.tesco.vertx.practice.beans.RequestInput;

public class FirstHandler extends AbstractHandler {

	@Override
	public void handle(RoutingContext event) {
		
	}

	@Override
	public RequestInput validateRequest(RoutingContext routingContext)
			throws Exception {
		return null;
	}

	
}
