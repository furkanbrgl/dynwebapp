package com.furkanbrgl.dynwebapp.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@Order(value=0) //Normal Security config den once devreye girmesi gerekiyor.
public class H2SecurityConfiguration extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.antMatcher("/h2-console/**").authorizeRequests().anyRequest().permitAll(); //h2-console ile baslan pathi yakalayıp herkesin erisebilecegini varsayar. (auth olmuş veya olmamıs)
        http.csrf().disable(); //csrg kabiliyetini devre dışı bırakalım. Cunku h2'nın kendi Login mekanizması var.
        http.headers().frameOptions().disable(); //H2 Html frameleri kullanıyor. Frame ile ilgili response header ların olusumuda devre dısı olmalı.

    }
}