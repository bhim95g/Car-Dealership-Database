package com.pluralsight;

import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Get database connection CarDealership
        String url = "jdbc:mysql://localhost:3306/car_dealership";
        String user = "root";
        String password = "yearup";

        // Create DataManager instance
        DataManager dataManager = new DataManager(url, user, password);

        try {
            dataManager.getAllVehicles();
            demonstrateVehicleDAO(dataManager);

        } finally {
            // Clean up resources
            try {
                dataManager.close();
                System.out.println("\nDataManager resources cleaned up successfully.");
            } catch (SQLException e) {
                System.err.println("Error closing DataManager: " + e.getMessage());
            }
        }
    }

    private static void demonstrateVehicleDAO(DataManager dataManager) {
        String query = "SELECT * FROM vehicles";

        try {
            List<Vehicle> vehicles = VehicleUtility.getVehicles(dataManager, query);
            System.out.println("Total vehicles: " + vehicles.size());
            for (Vehicle vehicle : vehicles) {
                System.out.println(vehicle);
            }
        } catch (SQLException e) {
            System.err.println("Error reading vehicles: " + e.getMessage());
        }
    }
}
