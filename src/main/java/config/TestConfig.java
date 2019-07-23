package config;

/**
 * Created by A.Bartolome 19/07/2019
 */
public class TestConfig {

    public class Appium{
        // URL for set up and run Appium server
        public static final String AppiumURL = "http://127.0.0.1:4723/wd/hub";
    }

    public class Runner {
        // Time out in seconds
        public static final int Timeout = 20;
    }

    public class Device {
        // Testing device, name and platform version, for real or emulated device
        public static final String Name = "Pixel 3";
        public static final String PlatformVersion = "9";
    }

    public class App {
        // APK name of the app to be launched and tested
        public static final String Name = "Android-NativeDemoApp-0.2.1.apk";
    }

    public class TestData {
        public static final String email = "bender_rodriguez@gmail.com";
        public static final String password = "12345678";
    }
}
