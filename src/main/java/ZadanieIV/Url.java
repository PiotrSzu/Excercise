package ZadanieIV;

public class Url {
    private final String protocol;
    private final String domain;
    private final String resource;
    Url(String protocol, String domain, String resource) {
        this.protocol = protocol;
        this.domain = domain;
        this.resource = resource;
    }
    @Override
    public String toString() {
        return "Url{" +
                "protocol='" + protocol + '\'' +
                ", domain='" + domain + '\'' +
                ", resource='" + resource + '\'' +
                '}';
    }

}
