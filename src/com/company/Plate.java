package com.company;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public void info(){
        System.out.println("Еда в миске: " + food);
    }

    public int getFood() {
        return food;
    }

    public  void decreaseFood(int n){
        food -= n;
    }

    public void setFood(int food) {
        this.food = food;
    }
    public void increaseFood(int n) {
        food+=n;
    }
}
