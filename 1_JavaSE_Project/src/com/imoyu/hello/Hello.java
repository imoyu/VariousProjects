package com.imoyu.hello;

import java.io.File;
import java.net.URL;

public class Hello {

    public static void main(String[] args) {
        System.out.println("[System.getProperty(\"user.dir\")]: "
                + System.getProperty("user.dir"));
        System.out.println("[new File(\"\").getAbsolutePath()]: "
                + new File("").getAbsolutePath());
        System.out.println("[Hello.class.getResource(\"/\").getPath()]: "
                + Hello.class.getResource("").getPath());
        System.out.println(getRuntimePath());

        System.out.println(Hello.class.getProtectionDomain().getCodeSource().getLocation().getPath());
        System.out.println(Hello.class.getProtectionDomain().getCodeSource().getLocation().getFile());

        System.out.println(new File(getRuntimePath() + "/resource.txt").exists());
        System.out.println(new File(Hello.class.getProtectionDomain().getCodeSource().getLocation().getPath() + "!/resource.txt").exists());

        System.out.println("[Hello.class.getResource(\"/\").getPath()]: " + Hello.class.getResource("/").getPath());
    }

    private static String getRuntimePath() {
        String classPath = Hello.class.getName().replaceAll("\\.", "/") + ".class";
        URL resource = Hello.class.getClassLoader().getResource(classPath);
        if (resource == null) {
            return null;
        }
        String urlString = resource.toString();
        int insidePathIndex = urlString.indexOf('!');
        boolean isInJar = insidePathIndex > -1;
        if (isInJar) {
            urlString = urlString.substring(urlString.indexOf("file:") + 5, insidePathIndex + 1);
            return urlString;
        }
        return urlString.substring(urlString.indexOf("file:"), urlString.length() - classPath.length());
    }
}
