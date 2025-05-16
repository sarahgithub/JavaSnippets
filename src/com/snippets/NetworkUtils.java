package com.snippets;

import java.net.*;
import java.io.*;

public class NetworkUtils {

    // Returns the public IP address of the machine
    public static String getPublicIP() throws IOException {
        URL url = new URL("https://api.ipify.org");
        BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
        return reader.readLine();
    }
}
