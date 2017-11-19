package com.splus.tesco.vertx.practice;

import io.vertx.core.Vertx;

public class VertxApp {

    public static void main(String[] args) {
        Vertx vertx = Vertx.vertx();
        vertx.deployVerticle(new RestVertical());
        System.out.println("Vertx Deployed.");
    }

}
