package framework;

import java.io.Serializable;
import java.util.Objects;

public class URL implements Serializable {
    private String hostname;
    private Integer port;

    public URL(String hostname, Integer port) {
        this.hostname = hostname;
        this.port = port;
    }

    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof URL)) return false;
        URL url = (URL) o;
        return Objects.equals(hostname, url.hostname) &&
                Objects.equals(port, url.port);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hostname, port);
    }
}
