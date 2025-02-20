package com.learning.designpatterns.creational.singleton;

public class LicenseManager {
    private static LicenseManager instance;
    private int availableLicenses;

    /* In this example, LicenseManager class provides a singleton instance to manage a limited number of licenses.
    When a component of the application needs a license, it requests one from the LicenseManager.
    The singleton pattern ensures that licenses are managed centrally, and there's no risk of over-allocating licenses.
    */

    private LicenseManager() {
        // Initialize with a fixed number of licenses
        availableLicenses = 5; // Example: 5 licenses available
    }

    public static synchronized LicenseManager getInstance() {
        if (instance == null) {
            instance = new LicenseManager();
        }
        return instance;
    }

    public synchronized boolean requestLicense() {
        if (availableLicenses > 0) {
            availableLicenses--;
            return true; // License granted
        } else {
            return false; // No available licenses
        }
    }

    public synchronized void releaseLicense() {
        availableLicenses++;
    }

    public int getAvailableLicenses() {
        return availableLicenses;
    }
}
