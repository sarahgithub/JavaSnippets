package com.snippets;

import java.io.*;
import java.net.URL;

public class IOUtils {

    // Downloads a file from a URL and saves it locally
    public static void downloadFile(String fileUrl, String saveDir) throws IOException {
        URL url = new URL(fileUrl);
        try (InputStream in = url.openStream();
             OutputStream out = new FileOutputStream(saveDir)) {
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = in.read(buffer)) != -1) {
                out.write(buffer, 0, bytesRead);
            }
        }
    }
}
