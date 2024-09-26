package co.edu.uptc.animals_rest.models;

public class AnimalCategoryCount {
    private String category;
    private int number;

    public AnimalCategoryCount(String category, int number) {
        this.category = category;
        this.number = number;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
