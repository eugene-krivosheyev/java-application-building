import jtraining.Demo;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.Enumeration;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

public class Main {
    public static void main(String[] args) throws Exception {

        URL[] urls = ((URLClassLoader) (Thread.currentThread().getContextClassLoader())).getURLs();

        for(URL url: urls){
            System.out.println(url.getFile());

            if (!url.getPath().endsWith(".jar")) {
                continue;
            }
            JarFile jar = new JarFile(new File(url.toURI()));
            Enumeration<JarEntry> entries = jar.entries();
            while (entries.hasMoreElements()) {
                JarEntry entry = entries.nextElement();
                String name = entry.getName();
                if (name.endsWith(".class")) {
                    System.out.println(name);
                }
            }
        }

        new Demo().show();

    }
}
