package com.pluralsight;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        VehicleDao dao = new VehicleDao();

        while (true) {
            System.out.println("\nSearch Vehicles:");
            System.out.println("1. By Price Range");
            System.out.println("2. By Make and Model");
            System.out.println("3. By Year Range");
            System.out.println("4. By Color");
            System.out.println("5. By Mileage Range");
            System.out.println("6. By Type");
            System.out.println("0. Exit");
            System.out.print("Choose option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            try {
                switch (choice) {
                    case 1 -> {
                        System.out.print("Min Price: ");
                        double min = scanner.nextDouble();
                        System.out.print("Max Price: ");
                        double max = scanner.nextDouble();
                        showResults(dao.searchByPriceRange(min, max));
                    }
                    case 2 -> {
                        System.out.print("Make: ");
                        String make = scanner.nextLine();
                        System.out.print("Model: ");
                        String model = scanner.nextLine();
                        showResults(dao.searchByMakeModel(make, model));
                    }
                    case 3 -> {
                        System.out.print("Min Year: ");
                        int minYear = scanner.nextInt();
                        System.out.print("Max Year: ");
                        int maxYear = scanner.nextInt();
                        showResults(dao.searchByYearRange(minYear, maxYear));
                    }
                    case 4 -> {
                        System.out.print("Color: ");
                        String color = scanner.nextLine();
                        showResults(dao.searchByColor(color));
                    }
                    case 5 -> {
                        System.out.print("Min Mileage: ");
                        int minMiles = scanner.nextInt();
                        System.out.print("Max Mileage: ");
                        int maxMiles = scanner.nextInt();
                        showResults(dao.searchByMileageRange(minMiles, maxMiles));
                    }
                    case 6 -> {
                        System.out.print("Type: ");
                        String type = scanner.nextLine();
                        showResults(dao.searchByType(type));
                    }
                    case 0 -> System.exit(0);
                    default -> System.out.println("Invalid option");
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }

    private static void showResults(List<Vehicle> vehicles) {
        if (vehicles.isEmpty()) {
            System.out.println("No vehicles found.");
        } else {
            for (Vehicle v : vehicles) {
                System.out.println(v);
            }
        }
    }
}
