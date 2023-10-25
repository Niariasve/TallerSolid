public class CloudServicePlatform {
    private int cloudServicePlatform;
    String[] arrayCloudServicePlatform = {"AWS", "Microsoft Azure", "Google Cloud"}
    public void hostingTo (AppWeb app) {
        System.out.println("Connect to: " + arrayCloudServicePlatform[cloudServicePlatform - 1]);
        // More Code
    }

    // More Methods
}

