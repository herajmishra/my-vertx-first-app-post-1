package com.splus.tesco.vertx.practice.handler;

import com.splus.tesco.vertx.practice.beans.RequestInput;

import io.vertx.ext.web.RoutingContext;

public interface IParametersRequestHandler {
	
	RequestInput validateRequest(RoutingContext routingContext) throws Exception;

}
