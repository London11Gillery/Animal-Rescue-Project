public class Monkey extends RescueAnimal {

    //  For Monkey Attributes
    private String species;
    private double tailLength;
    private double height;
    private double bodyLength;

    // Def constructor
    public Monkey() {
        super();
    }

    // Full constructor
    public Monkey(String name, String animalType, String gender, String age,
        String weight, String acquisitionDate, String acquisitionCountry,
        String trainingStatus, boolean reserved, String inServiceCountry,
        String species, double tailLength, double height, double bodyLength) {

        super();

        setName(name);
        setAnimalType(animalType);
        setGender(gender);
        setAge(age);
        setWeight(weight);
        setAcquisitionDate(acquisitionDate);
        setAcquisitionCountry(acquisitionCountry);
        setTrainingStatus(trainingStatus);
        setReserved(reserved);
        setInServiceCountry(inServiceCountry);

        this.species = species;
        this.tailLength = tailLength;
        this.height = height;
        this.bodyLength = bodyLength;
    }

    // Species Getter
    public String getSpecies() {
        return species;
    }

    // Species Setter 
    public void setSpecies(String species) {
        this.species = species;
    }

    // Tail length Getter 
    public double getTailLength() {
        return tailLength;
    }

    // Tail length Setter
    public void setTailLength(double tailLength) {
        this.tailLength = tailLength;
    }

    // Height Getter
    public double getHeight() {
        return height;
    }

    // Height Setter
    public void setHeight(double height) {
        this.height = height;
    }

    // Body length Getter
    public double getBodyLength() {
        return bodyLength;
    }

    // Body length Setter
    public void setBodyLength(double bodyLength) {
        this.bodyLength = bodyLength;
    }
}