package com.example.predicate;

import org.springframework.cloud.gateway.handler.predicate.AbstractRoutePredicateFactory;
import org.springframework.cloud.gateway.handler.predicate.GatewayPredicate;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.server.ServerWebExchange;


import java.util.function.Predicate;

@Component
public class TokenRoutePredicateFactory extends AbstractRoutePredicateFactory<TokenRoutePredicateFactory.Config>  {

    public TokenRoutePredicateFactory() {
        super(Config.class);
    }

    @Override
    public Predicate<ServerWebExchange> apply(TokenRoutePredicateFactory.Config config) {
        return new GatewayPredicate() {


            /**
             * 驗證的機制目前評估寫在這裡 繼續研究在看對不對
             */
            @Override
            public boolean test(ServerWebExchange serverWebExchange) {


                return true;
            }
        };
    }


    // 已驗證
    @Validated
    public static class Config {

        private String token;


        public String getToken() {
            return token;
        }

        public void setToken(String token) {
            this.token = token;
        }
    }

}

