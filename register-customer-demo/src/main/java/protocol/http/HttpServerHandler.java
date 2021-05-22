package protocol.http;

import framework.Invocation;
import framework.URL;
import org.apache.commons.io.IOUtils;
import register.Register;

import javax.servlet.ServletInputStream;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.lang.reflect.Method;

public class HttpServerHandler {

    public void handle(HttpServletRequest req, HttpServletResponse resp) {

        try {
            ServletInputStream inputStream = req.getInputStream();
            ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
            Invocation invocation = (Invocation) objectInputStream.readObject();

            // 找实现类
            String interfaceName = invocation.getInterfaceName();
            URL url = new URL("localhost", 8080);
            Class implClass = Register.get(url, interfaceName);

            Method method = implClass.getMethod(invocation.getMethodName(), invocation.getParamTypes());
            String result = (String) method.invoke(implClass.newInstance(), invocation.getParams());

            ServletOutputStream outputStream = resp.getOutputStream();
            IOUtils.write(result, outputStream);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
