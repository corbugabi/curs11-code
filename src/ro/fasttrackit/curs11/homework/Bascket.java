package ro.fasttrackit.curs11.homework;

import java.util.*;

public class Bascket {
    private final List<String> fruits;

    public Bascket(){
        this(new ArrayList<>());
    }

    public Bascket(Collection<String> fruits){
        this.fruits = new ArrayList<>();
        this.fruits.addAll(fruits);
    }

    public boolean find(String fruit){
       for(String myFruit : fruits){
           if(myFruit.equals(fruit)){
               return true;
           }
       }
       return false;
    //   return fruits.contains(fruit);
    }

    public boolean remove(String fruit){
//        return fruits.remove(fruit);
        Iterator<String> iterator = fruits.iterator();
        boolean removed = false;
        while (iterator.hasNext()){
            String myFruit = iterator.next();
            if (myFruit.equals(fruit)){
                iterator.remove();
                removed = true;
            }
        }
        return removed;
    }

    public int getPosition(String fruit){
        for(int i = 0; i<fruits.size(); i++){
            if (fruits.get(i).equals(fruit)){
                return i;
            }
        }
        return -1;
//        return fruits.indexOf(fruit);
    }

    public List<Integer> getPositions(String fruit){
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i<fruits.size(); i++){
            if (fruits.get(i).equals(fruit)){
                result.add(i);
            }
        }
        return result;
    }

    public Collection<String> distinct(){
        return new HashSet<>(fruits);
    }

    public Collection<String> distinct2(){
        List<String> result = new ArrayList<>();
        for(String myFruits : fruits){
            if(!result.contains(myFruits)){
                result.add(myFruits);
            }
        }
        return result;
    }

    public void add(String fruit){
        this.fruits.add(fruit);
    }

    public int count(){
//        return fruits.size();
        int count = 0;
        Iterator<String> iterator = this.fruits.iterator();
        while(iterator.hasNext()){
            count++;
            iterator.next();
        }
        return count;
    }


}


