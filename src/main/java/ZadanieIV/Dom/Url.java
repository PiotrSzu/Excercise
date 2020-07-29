package ZadanieIV.Dom;

public class Url {

    private String domain;
    private String protocol;
    private String resource;

    public Url(String domain, String protocol, String resource) {
        this.domain = domain;
        this.protocol = protocol;
        this.resource = resource;
    }

    @Override
    public String toString() {
        return "Url{" +
                "domain='" + domain + '\'' +
                ", protocol='" + protocol + '\'' +
                ", resource='" + resource + '\'' +
                '}';
    }
}
