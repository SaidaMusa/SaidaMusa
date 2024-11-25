public class Food {
    String countryOfFood;
    String nameOfFood;
    double priceOfFood;
    int quantity;

    public Food(String countryOfFood, String nameOfFood, double priceOfFood, int quantity) {
        this.countryOfFood = countryOfFood;
        this.nameOfFood = nameOfFood;
        this.priceOfFood = priceOfFood;
        this.quantity = quantity;
    }

    public String getCountryOfFood() {
        return countryOfFood;
    }

    public void setCountryOfFood(String countryOfFood) {
        this.countryOfFood = countryOfFood;
    }

    public String getNameOfFood() {
        return nameOfFood;
    }

    public void setNameOfFood(String nameOfFood) {
        this.nameOfFood = nameOfFood;
    }

    public double getPriceOfFood() {
        return priceOfFood;
    }

    public void setPriceOfFood(double priceOfFood) {
        this.priceOfFood = priceOfFood;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


    public void updateFood(String name,double price){
       this.nameOfFood=name;
       this.priceOfFood=price;
    }

    public  void showAllFoodData(){
        System.out.println("Country: "+countryOfFood+"\n"+"Name: "+nameOfFood+"\n"+"Price: "+priceOfFood+"sum"+"\n"+"Quantity: "+quantity);
    }
}
