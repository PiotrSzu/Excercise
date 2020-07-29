package ZadanieIV;

import java.util.Scanner;

public class UrlService {
    static Url divideUrl(String url) {
        String[] temp = url.split("://");
        if(temp.length > 2) {
            throw new InvalidUrl("Invalid URL.");
        }
        final String protocol = temp[0];
        int index = temp[1].indexOf("/");
        final String domain = temp[1].substring(0, index);
        final String resource = temp[1].substring(index + 1);
        return new Url(protocol, domain, resource);
    }
}
