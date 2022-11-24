import java.util.Arrays;

public class Farm {

    private String addrese;
    private Animal[] cows;
    private Animal[] horses;
    private Animal [] sheep;
    private String OwnerName;

    public Farm(String addrese, Animal[] cows, Animal[] horses, Animal[] sheep, String ownerName) {
        this.addrese = addrese;
        this.cows = cows;
        this.horses = horses;
        this.sheep = sheep;
        OwnerName = ownerName;
    }

    public Farm() {
    }

    public String getAddrese() {
        return addrese;
    }

    public void setAddrese(String addrese) {
        this.addrese = addrese;
    }

    public Cow[] getCows() {
        return (Cow[]) cows;
    }

    public void setCows(Cow[] cows) {
        this.cows = cows;
    }

    public Horse[] getHorses() {
        return (Horse[]) horses;
    }

    public void setHorses(Horse[] horses) {
        this.horses = horses;
    }

    public Sheep[] getSheep() {
        return (Sheep[]) sheep;
    }

    public void setSheep(Sheep[] sheep) {
        this.sheep = sheep;
    }

    public String getOwnerName() {
        return OwnerName;
    }

    public void setOwnerName(String ownerName) {
        OwnerName = ownerName;
    }

    @Override
    public String toString() {
        return "Farm{" +
                "addrese='" + addrese + '\'' +
                ", cows=" + Arrays.toString(cows) +
                ", horses=" + Arrays.toString(horses) +
                ", sheep=" + Arrays.toString(sheep) +
                ", OwnerName='" + OwnerName + '\'' +
                '}';
    }
}
