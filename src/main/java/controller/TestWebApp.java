package controller;

import io.vertx.core.Vertx;

/**
 * Created by Peonsson on 18/03/16.
 */
public class TestWebApp {

    public static void main(String[] args) {

        Vertx vertx = Vertx.vertx();
        vertx.deployVerticle(new WebAppVerticle());

//        vertx.deployVerticle(new PostResult());
//        vertx.deployVerticle(new PostVote());

     }
}
