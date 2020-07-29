package ZadanieIV.Dom;

public class UrlSpliter {
    private static final String PROTOCOL_SPLITER = "://";
    private static final String DOMAIN_SPLITTER = "/";

    public Url analize (String urlToanalyze) throws UrlException {
        String[] urlParts = urlToanalyze.split(PROTOCOL_SPLITER);
        if (urlParts.length != 2) {
            throw new UrlException("Invalid url");
        }
        String protocol = urlParts[0];
        String domainAndResource = urlParts[1];
        int index = domainAndResource.indexOf(DOMAIN_SPLITTER);
        if (index == -1) {
            throw new UrlException("Invalid url");
        }
        String domain = domainAndResource.substring(0, index);
        String resource = domainAndResource.substring(index);
        return new Url(domain, protocol, resource);
    }
}
