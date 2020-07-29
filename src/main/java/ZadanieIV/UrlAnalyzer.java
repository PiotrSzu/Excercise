package ZadanieIV;

import java.util.ArrayList;
import java.util.List;

public class UrlAnalyzer {
    public List<String>analyze(String urlToBeAnalyzed) throws Exception{
        List<String> urlElements = new ArrayList<>();
        String[] rawUrlParts = urlToBeAnalyzed.split("://");
        if (rawUrlParts.length == 2) {
            String protocol = rawUrlParts[0];
            urlElements.add(protocol);
            int index = rawUrlParts[1].indexOf("/");
            String domain = rawUrlParts[1].substring(0, index);
            urlElements.add(domain);
            String resource = rawUrlParts[1].substring(index + 1);
            urlElements.add(resource);
            return urlElements;
        } else {
            throw new Exception("Invalid URL");
        }
    }
}
