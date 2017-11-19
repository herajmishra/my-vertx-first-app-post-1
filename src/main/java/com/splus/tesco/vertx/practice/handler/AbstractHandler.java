package com.splus.tesco.vertx.practice.handler;

import io.vertx.core.Handler;
import io.vertx.ext.web.RoutingContext;

public abstract class AbstractHandler implements Handler<RoutingContext>, IParametersRequestHandler{

}
