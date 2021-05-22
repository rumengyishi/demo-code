package provider;

import framework.URL;
import protocol.http.HttpServer;
import provider.api.HelloService;
import provider.impl.HelloServiceImpl;
import register.Register;

import java.io.IOException;

public class Provider {
    public static void main(String[] args) throws IOException {
        // 注册服务
        URL url = new URL("localhost", 8080);
        Register.register(url, HelloService.class.getName(), HelloServiceImpl.class);

        // 启动Tomcat
        HttpServer httpServer = new HttpServer();
        httpServer.start(url.getHostname(), url.getPort());
    }
}
