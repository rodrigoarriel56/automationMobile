package suporte.plataforma;

public class PlatformFactory {

    private static PlatformFactory _instance;

    private PlatformFactory() { }

    public static synchronized PlatformFactory getInstance() {
        if (_instance == null)
            _instance = new PlatformFactory();

        return _instance;
    }

    public IPlatform getPlatform(String platform) {

            if (platform.equals("Android"))
                return new AndroidSupport();
            else if (platform.equals("iOS"))
                return new IosSupport();

            else
                throw new IllegalArgumentException(platform);
    }

}
