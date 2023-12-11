package com.hdu.my12306.config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;



@Configuration
public class CorsConfig {
    @Bean
    public CorsFilter corsFilter() {
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        CorsConfiguration config = new CorsConfiguration();

        // 允许来自特定域名的跨域请求
        config.addAllowedOrigin("http://localhost:100");

        // 允许发送身份验证信息（例如 cookies）
        config.setAllowCredentials(true);

        // 允许的 HTTP 方法
        config.addAllowedMethod("*");

        // 允许的请求头
        config.addAllowedHeader("*");

        source.registerCorsConfiguration("/**", config);
        return new CorsFilter(source);
    }


}
