package Chapter3;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by YangHC on 2018-01-22.
 */
public class Problem3_6Test {
    private static AnimalShelterQueue animalShelterQueue;

    @Before
    public void makeInstance() throws Exception {
        animalShelterQueue = new AnimalShelterQueue();
    }

    @Test
    public void preOrderTraversalTest1() {
        animalShelterQueue.enqueue(new Cat("루비"));
        animalShelterQueue.enqueue(new Dog("멍이"));
        animalShelterQueue.enqueue(new Cat("네로"));
        animalShelterQueue.enqueue(new Dog("흰둥이"));
        animalShelterQueue.enqueue(new Dog("슈가"));
        animalShelterQueue.enqueue(new Cat("망치"));
        animalShelterQueue.enqueue(new Dog("검둥이"));
        animalShelterQueue.enqueue(new Dog("백구"));
        animalShelterQueue.enqueue(new Cat("샤넬"));
        animalShelterQueue.printAnimalShelterQueue();

        animalShelterQueue.dequeueAny();
        animalShelterQueue.printAnimalShelterQueue();
        animalShelterQueue.dequeueAny();
        animalShelterQueue.printAnimalShelterQueue();
        animalShelterQueue.dequeueDog();
        animalShelterQueue.printAnimalShelterQueue();
        animalShelterQueue.dequeueDog();
        animalShelterQueue.printAnimalShelterQueue();
        animalShelterQueue.dequeueDog();
        animalShelterQueue.printAnimalShelterQueue();
        animalShelterQueue.dequeueCat();
        animalShelterQueue.printAnimalShelterQueue();
//        assertEquals("c",);
    }

}
