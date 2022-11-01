public class CatInformation {
    protected String catName;
    protected int catAge;
    protected double weight;
    protected String breed;
    protected String furColor;
    protected String congenitalDisease;

    public CatInformation() {

    }

    public CatInformation(String catName, int catAge, double weight, String breed, String furColor,
            String congenitalDisease) {
        this.catName = catName;
        this.catAge = catAge;
        this.weight = weight;
        this.breed = breed;
        this.furColor = furColor;
        this.congenitalDisease = congenitalDisease;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }

    public String getCatName() {
        return catName;
    }

    public void setCatAge(int catAge) {
        this.catAge = catAge;
    }

    public int getCatAge() {
        return catAge;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }

    public String getFurColor() {
        return furColor;
    }

    public void setCongenitalDisease(String congenitalDisease) {
        this.congenitalDisease = congenitalDisease;
    }

    public String getCongenitalDisease() {
        return congenitalDisease;
    }

    public String toString() {
        return "";
    }
    
}
