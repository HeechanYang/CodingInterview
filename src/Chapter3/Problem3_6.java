package Chapter3;

import java.util.LinkedList;

/**
 * Created by YangHC on 2018-01-31.
 * <p>
 * [문제 3-6]
 * 동물 보호소 : 먼저 들어온 동물이 먼저 나가는 동물 보호소(animal shelter)가 있다고 하자.
 * 이 보호소는 개와 고양이만 수용한다. 사람들은 보호소에서 가장 오래된 동물부터 입양할 수
 * 있는데, 개와 고양이 중 어떤 동물을 데려갈지 선택할 수 있다. 하지만 특정한 동물을 지정해
 * 데려갈 수는 없다.이 시스템을 자료구조로 구현하라.
 * 이 자료구조는 enqueue, dequeueAny, dequeueDog, dequeueCat의 연산을 제공해야 한다.
 * 기본적으로 탑재되어 있는 LinkedList 자료구조를 사용해도 좋다.
 * <p>
 * 1. LinkedList를 사용하여 앞에부터 찾아서 반환
 */
public class Problem3_6 {
}

class AnimalShelterQueue<Animal> extends LinkedList<Animal> {
    public Animal enqueue(Animal animal) {
        add(animal);
        return animal;
    }

    public Animal dequeueAny() {
        Animal animal = get(0);
        remove(animal);
        return animal;
    }

    public Dog dequeueDog() {
        for (Animal animal : this) {
            if (animal instanceof Dog) {
                remove(animal);
                return (Dog) animal;
            }
        }
        return null;
    }

    public Cat dequeueCat() {
        for (Animal animal : this) {
            if (animal instanceof Cat) {
                remove(animal);
                return (Cat) animal;
            }
        }
        return null;
    }

    public void printAnimalShelterQueue(){
        for (Animal animal : this) {
            if (animal instanceof Dog) {
                System.out.print("   [Dog] ");
            }else if(animal instanceof Cat){
                System.out.print("   [Cat] ");
            }
        }
        System.out.println();
    }
}

class Animal {
    private String name;
    public Animal(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}

class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }
}

class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }
}
