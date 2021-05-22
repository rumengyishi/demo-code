package register;

import framework.URL;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Register {

    private static Map<String, Map<URL, Class>> REGISTER = new HashMap<String, Map<URL, Class>>();

    public static void register(URL url, String interfaceName, Class implClass) throws IOException {
        Map<URL, Class> map = new HashMap<>();
        map.put(url, implClass);
        REGISTER.put(interfaceName, map);
        saveFile();
    }

    public static Class get(URL url, String interfaceName) {
        REGISTER = getFile();
        return REGISTER.get(interfaceName).get(url);
    }

    private static Map<String, Map<URL, Class>> getFile() {
        try {
            FileInputStream fileInputStream = new FileInputStream("E:/data/register.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            return (Map<String, Map<URL, Class>>)objectInputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static URL random(String interfaceName) {
        REGISTER = getFile();
        return REGISTER.get(interfaceName).keySet().iterator().next();
    }

    private static void saveFile() throws IOException {
        try {
            FileOutputStream outputStream = new FileOutputStream("E:/data/register.txt");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
            objectOutputStream.writeObject(REGISTER);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
