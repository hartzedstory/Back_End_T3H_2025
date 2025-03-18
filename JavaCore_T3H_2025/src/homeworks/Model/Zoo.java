package homeworks.Model;

public class Zoo {
    private Animal[] animalList = new Animal[0];

    public void addAnimal(Animal animal){
        //Tu dong tang them 1 o nho khi add
        this.increaseSizeListIfNeeded(this.animalList);
        this.animalList[animalList.length-1] = animal;
    }

    public void makeAllSound() {
        for (int i = 0; i < this.animalList.length; i++) {
            System.out.println("------------------------");
            this.animalList[i].makeSound();
        }
    }

    public void displayAllInfor() {
        for (int i = 0; i < this.animalList.length; i++) {
            System.out.println("------------------------");
            this.animalList[i].displayInfor();
        }
    }

    private void increaseSizeListIfNeeded(Animal[] animalList){
        Animal[] newAnimalList = new Animal[animalList.length + 1];
        this.animalList = newAnimalList;
    }
}
