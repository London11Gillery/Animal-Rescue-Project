import java.util.ArrayList;
import java.util.Scanner;

public class Driver {

    private static ArrayList<Dog> dogList = new ArrayList<Dog>();
    private static ArrayList<Monkey> monkeyList = new ArrayList<Monkey>();

    public static void main(String[] args) {

        initializeDogList();
        initializeMonkeyList();

        Scanner scanner = new Scanner(System.in);
        String menuChoice = "";

        // Display the menu till the user picks q

        while (!menuChoice.equalsIgnoreCase("q")) {

            displayMenu();
            menuChoice = scanner.nextLine();

            switch (menuChoice) {

                case "1":
                    intakeNewDog(scanner);
                    break;

                case "2":
                    intakeNewMonkey(scanner);
                    break;

                case "3":
                    reserveAnimal(scanner);
                    break;

                case "4":
                    printAnimals("dog");
                    break;

                case "5":
                    printAnimals("monkey");
                    break;

                case "6":
                    printAnimals("available");
                    break;

                case "q":
                case "Q":
                    System.out.println("Exiting application...");
                    break;

                default:
                    System.out.println("Invalid menu selection. Please try again.");
            }
        }

        scanner.close();
    }

    // Display Menu Options

    public static void displayMenu() {

        System.out.println("\n\n");
        System.out.println("\t\t\t\tRescue Animal System Menu");
        System.out.println("[1] Intake a new dog");
        System.out.println("[2] Intake a new monkey");
        System.out.println("[3] Reserve an animal");
        System.out.println("[4] Print a list of all dogs");
        System.out.println("[5] Print a list of all monkeys");
        System.out.println("[6] Print a list of all animals that are not reserved");
        System.out.println("[q] Quit application");
        System.out.println();
        System.out.println("Enter a menu selection");

    }

    // Add dogs for testing

    public static void initializeDogList() {

        Dog dog1 = new Dog(
            "Spot",
            "German Shepherd",
            "male",
            "1",
            "25.6",
            "05-12-2019",
            "United States",
            "intake",
            false,
            "United States"
        );

        Dog dog2 = new Dog(
            "Rex",
            "Great Dane",
            "male",
            "3",
            "35.2",
            "02-03-2020",
            "United States",
            "Phase I",
            false,
            "United States"
        );

        Dog dog3 = new Dog(
            "Bella",
            "Chihuahua",
            "female",
            "4",
            "25.6",
            "12-12-2019",
            "Canada",
            "in service",
            true,
            "Canada"
        );

        dogList.add(dog1);
        dogList.add(dog2);
        dogList.add(dog3);

    }

    // Add Monkeys for testing
    // Optional use
    public static void initializeMonkeyList() {

    }

    // Complete intakeNewDog Method
  
    public static void intakeNewDog(Scanner scanner) {

        System.out.println("What is the dog's name?");
        String name = scanner.nextLine();

        // Check if dog is already in system
        for (Dog dog : dogList) {
            if (dog.getName().equalsIgnoreCase(name)) {
                System.out.println("\n\nThis dog is already in our system\n\n");
                return; //returns to menu

            }
        }

	// New Dog Information

        System.out.println("What is the dog's breed?");
        String breed = scanner.nextLine();

        System.out.println("What is the dog's gender?");
        String gender = scanner.nextLine();

        System.out.println("What is the dog's age?");
        String age = scanner.nextLine();

        System.out.println("What is the dog's weight?");
        String weight = scanner.nextLine();

        System.out.println("What is the dog's acquisition date?");
        String acquisitionDate = scanner.nextLine();

        System.out.println("What is the dog's acquisition country?");
        String acquisitionCountry = scanner.nextLine();

        System.out.println("What is the dog's training status?");
        String trainingStatus = scanner.nextLine();

        System.out.println("Is the dog reserved? (true/false)");
        boolean reserved = Boolean.parseBoolean(scanner.nextLine());

        System.out.println("What is the dog's in-service country?");
        String inServiceCountry = scanner.nextLine();

        // New Dog Object
        Dog newDog = new Dog(
            name,
            breed,
            gender,
            age,
            weight,
            acquisitionDate,
            acquisitionCountry,
            trainingStatus,
            reserved,
            inServiceCountry

        );

        // Add dog to dog ArrayList

        dogList.add(newDog);

        System.out.println("The dog has been successfully added.");
    }

    // Complete intakeNewMonkey Method
    
    public static void intakeNewMonkey(Scanner scanner) {

        System.out.println("What is the monkey's name?");
        String name = scanner.nextLine();

        // Check if monkey is already in the system

        for (Monkey monkey : monkeyList) {
            if (monkey.getName().equalsIgnoreCase(name)) {
                System.out.println("\n\nThis monkey is already in our system.\n\n");
                return;

            }
        }

        System.out.println("What is the monkey's species?");
        String species = scanner.nextLine();

        // Only monkey species allowed
        if (!species.equalsIgnoreCase("Capuchin")
                && !species.equalsIgnoreCase("Guenon")
                && !species.equalsIgnoreCase("Macaque")) {

            System.out.println("Invalid species. Monkey was not added.");
            return;
        }

        System.out.println("What is the monkey's gender?");
        String gender = scanner.nextLine();

        System.out.println("What is the monkey's age?");
        String age = scanner.nextLine();

        System.out.println("What is the monkey's weight?");
        String weight = scanner.nextLine();

        System.out.println("What is the acquisition date?");
        String acquisitionDate = scanner.nextLine();

        System.out.println("What is the acquisition country?");
        String acquisitionCountry = scanner.nextLine();

        System.out.println("What is the training status?");
        String trainingStatus = scanner.nextLine();

        System.out.println("Is the monkey reserved? (true/false)");
        boolean reserved = Boolean.parseBoolean(scanner.nextLine());

        System.out.println("What is the in-service country?");
        String inServiceCountry = scanner.nextLine();

        System.out.println("What is the monkey's tail length?");
        String tailLength = scanner.nextLine();

        System.out.println("What is the monkey's height?");
        String height = scanner.nextLine();

        System.out.println("What is the monkey's body length?");
        String bodyLength = scanner.nextLine();

        System.out.println("What is the monkey's eye color?");
        String eyeColor = scanner.nextLine();

        // Create the new Monkey object.
        Monkey newMonkey = new Monkey(
            name,
            species,
            gender,
            age,
            weight,
            acquisitionDate,
            acquisitionCountry,
            trainingStatus,
            reserved,
            inServiceCountry,
            tailLength,
            height,
            bodyLength,
            eyeColor
        );

        // Adds the new monkey to monkey ArrayList.
        monkeyList.add(newMonkey);

        System.out.println("The monkey has been successfully added.");
    }

    // Complete reserveAnimal.
    // Find the animal by animal type and in service country
    public static void reserveAnimal(Scanner scanner) {

        System.out.println("Enter the animal type (dog or monkey):");
        String animalType = scanner.nextLine();

        System.out.println("Enter the animal's in-service country:");
        String country = scanner.nextLine();

        if (animalType.equalsIgnoreCase("dog")) {

            for (Dog dog : dogList) {

                if (dog.getInServiceCountry().equalsIgnoreCase(country)
                        && !dog.getReserved()) {

                    dog.setReserved(true);

                    System.out.println("The dog has been reserved.");
                    return;
                }
            }

        } else if (animalType.equalsIgnoreCase("monkey")) {

            for (Monkey monkey : monkeyList) {

                if (monkey.getInServiceCountry().equalsIgnoreCase(country)
                        && !monkey.getReserved()) {

                    monkey.setReserved(true);

                    System.out.println("The monkey has been reserved.");
                    return;
                }
            }

        } else {

            System.out.println("Invalid animal type.");
            return;
        }

        System.out.println("No available animal matched your criteria.");
    }

    // Complete printAnimals.
    // Prints dogs, monkeys, or other available animals
    public static void printAnimals(String listType) {

        // Prints all dogs
        if (listType.equalsIgnoreCase("dog")) {

            for (Dog dog : dogList) {

                System.out.println(
                    dog.getName() + " | " +
                    dog.getAnimalType() + " | " +
                    dog.getTrainingStatus() + " | " +
                    dog.getAcquisitionLocation() + " | " +
                    dog.getReserved()
                );
            }

        // Prints all monkeys
        } else if (listType.equalsIgnoreCase("monkey")) {

            for (Monkey monkey : monkeyList) {

                System.out.println(
                    monkey.getName() + " | " +
                    monkey.getAnimalType() + " | " +
                    monkey.getTrainingStatus() + " | " +
                    monkey.getAcquisitionLocation() + " | " +
                    monkey.getReserved()
                );
            }

        // Prints all available animals
        } else if (listType.equalsIgnoreCase("available")) {

            // Check dogs list
            for (Dog dog : dogList) {

                if (dog.getTrainingStatus().equalsIgnoreCase("in service")
                        && !dog.getReserved()) {

                    System.out.println(
                        dog.getName() + " | dog | " +
                        dog.getTrainingStatus() + " | " +
                        dog.getAcquisitionLocation() + " | " +
                        dog.getReserved()
                    );
                }
            }

            // Check monkeys list
            for (Monkey monkey : monkeyList) {

                if (monkey.getTrainingStatus().equalsIgnoreCase("in service")
                        && !monkey.getReserved()) {

                    System.out.println(
                        monkey.getName() + " | monkey | " +
                        monkey.getTrainingStatus() + " | " +
                        monkey.getAcquisitionLocation() + " | " +
                        monkey.getReserved()
                    );
                }
            }

        } else {

            System.out.println("Invalid list type.");
        }
    }
}