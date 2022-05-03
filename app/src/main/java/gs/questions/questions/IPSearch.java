package gs.questions.questions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.HashMap;

public class IPSearch {
    public static String MostCommonIP(String[] logs) {
        // maps IPs to the number of times they've occurred
        var ipMap = new HashMap<String, Integer>();
        // regex pattern for finding the IP string
        final String patternStr = "^(\\d+\\.\\d+\\.\\d+\\.\\d+)";
        final Pattern pattern = Pattern.compile(patternStr);
        // loop over the logs
        for (String logEntry : logs) {
            // match the regex
            Matcher m = pattern.matcher(logEntry);
            if (m.find()) {
                final String ip = m.group(1);
                // add to the map
                if (ipMap.containsKey(ip)) {
                    ipMap.replace(ip, ipMap.get(ip) + 1);
                } else {
                    // add to the map
                    ipMap.put(ip, 1);
                }
            }
        }

        // now find the most common IP
        String ip = null;
        int num = 0;
        for (var entry : ipMap.entrySet()) {
            if (entry.getValue() > num) {
                num = entry.getValue();
                ip = entry.getKey();
            }
        }
        return ip;
    }
}
