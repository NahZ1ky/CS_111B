package zybook_724;

public class FoodItem {
    private String name;
    private double fat;
    private double carbs;
    private double protein;

    // TODO: Define default constructor
    public FoodItem() {
        this.name = "Water";
    }

    // TODO: Define second constructor with parameters to initialize private fields (name, fat, carbs, protein)
    public FoodItem(String name, double fat, double carbs, double protein) {
        this.name = name;
        this.fat = fat;
        this.carbs = carbs;
        this.protein = protein;
    }
    public FoodItem(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getFat() {
        return fat;
    }

    public double getCarbs() {
        return carbs;
    }

    public double getProtein() {
        return protein;
    }

    public double getCalories(double numServings) {
        // Calorie formula
        double calories = ((fat * 9) + (carbs * 4) + (protein * 4)) * numServings;
        return calories;
    }

    public void printInfo() {
        System.out.println("Nutritional information per serving of " + name + ":");
        System.out.printf("  Fat: %.2f g\n", fat);
        System.out.printf("  Carbohydrates: %.2f g\n", carbs);
        System.out.printf("  Protein: %.2f g\n", protein);
    }
}