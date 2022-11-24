public  class Animal {

    private int weight;
    private int age;
    private char gender;
    private String nicName;


    public Animal(int weight, int age, char gender, String nicName) {
        this.weight = weight;
        this.age = age;
        this.gender = gender;
        this.nicName = nicName;
    }

    public Animal() {
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getNicName() {
        return nicName;
    }

    public void setNicName(String nicName) {
        this.nicName = nicName;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "weight=" + weight +
                ", age=" + age +
                ", gender=" + gender +
                ", nicName='" + nicName + '\'' +
                '}';
    }
    
}
