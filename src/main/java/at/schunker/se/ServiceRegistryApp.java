package at.schunker.se;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableEurekaServer
@EnableZuulProxy
@EnableDiscoveryClient
//@EnableEurekaClient
public class ServiceRegistryApp {
    public static void main( String[] args ) {
        SpringApplication.run(ServiceRegistryApp.class, args);
        System.out.println( "service registry running" );
    }
}
