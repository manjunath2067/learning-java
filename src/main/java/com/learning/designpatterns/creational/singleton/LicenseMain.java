package com.learning.designpatterns.creational.singleton;

public class LicenseMain {
    public static void main(String[] args) {
        // Get the singleton instance of LicenseManager
        LicenseManager licenseManager = LicenseManager.getInstance();

        // Check the initial number of available licenses
        System.out.println("Initial available licenses: " + licenseManager.getAvailableLicenses());

        // Request licenses
        for (int i = 0; i < 7; i++) {
            boolean granted = licenseManager.requestLicense();
            if (granted) {
                System.out.println("License granted. Available licenses: " + licenseManager.getAvailableLicenses());
            } else {
                System.out.println("No available licenses.");
            }
        }

        // Release licenses
        for (int i = 0; i < 3; i++) {
            licenseManager.releaseLicense();
            System.out.println("License released. Available licenses: " + licenseManager.getAvailableLicenses());
        }
    }
}
