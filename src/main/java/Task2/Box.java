package Task2;

import java.util.ArrayList;

public class Box <T extends Fruit> {

    private ArrayList<T> fruitList;

    public Box(ArrayList<T> fruitList) {
        this.fruitList = fruitList;
    }

    public ArrayList<T> getFruitList() {
        return fruitList;
    }

    public Integer getWeightList() {
        Integer result = 0;
        for(T t: getFruitList()){
            if(t!=null) {
                Integer value = t.getWeightFruit();
                result += value;
            }
        }
        return result;
    }

    public Boolean compareList(Box<? extends Fruit> box) {
        if (this.getWeightList().intValue() == box.getWeightList().intValue()) return true;
        return false;
    }

    public void toEmptyList(Box<T> box) {
        System.out.println("Вес коробки, которую нужно пересыпать равен: " + this.getWeightList() + " килограмм.");
        System.out.println("Вес коробки, в которую нужно пересыпать равен: " + box.getWeightList() + " килограмм.");
        for (T t: this.getFruitList()) {
            box.getFruitList().add(t);
        }
        this.getFruitList().clear();
        System.out.println("Вес коробки, которую пересыпали равен: " + this.getWeightList() + " килограмм.");
        System.out.println("Вес коробки, в которую пересыпали равен: " + box.getWeightList() + " килограмм.\n");
    }
}