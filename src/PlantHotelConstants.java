public class PlantHotelConstants {

    private PlantHotelConstants() {

    }

    // Plant names
    public static final String IGGE = "Igge";
    public static final String LAURA = "Laura";
    public static final String MEATLOAF = "Meatloaf";
    public static final String OLOF = "Olof";

    // Search names
    public static final String IGGE_SEARCH = "igge";
    public static final String LAURA_SEARCH = "laura";
    public static final String MEATLOAF_SEARCH = "meatloaf";
    public static final String OLOF_SEARCH = "olof";
    public static final String EXIT = "exit";

    //
    public static final int INDEX_IGGE = 0;
    public static final int INDEX_LAURA = 1;
    public static final int INDEX_MEATLOAF = 2;
    public static final int INDEX_OLOF = 3;

    // Plant heights
    public static final double IGGE_HEIGHT = 0.20;
    public static final double LAURA_HEIGHT = 5.0;
    public static final double MEATLOAF_HEIGHT = 0.7;
    public static final double OLOF_HEIGHT = 1;

    // Plant factors
    public static final double PALM_FACTOR = 0.5;
    public static final double CARNIVOROUS_BASE = 0.1;
    public static final double CARNIVOROUS_FACTOR = 0.2;
    public static final double CACTUS_LITERS = 0.02;

    // User messages
    public static final String WELCOME = "Welcome to Greenest Plant Hotel!";
    public static final String QUESTION = "Which plant needs liquid?";
    public static final String EMPTY_INPUT = "You must enter a plant name.";
    public static final String UNKNOWN_PLANT = "This plant is not staying at the hotel.";
    public static final String AVAILABLE_PLANTS = "Available plants: Igge, Laura, Meatloaf, Olof.";
    public static final String INVALID_INPUT = "Invalid input. Please enter a plant name.";
    public static final String EXIT_MESSAGE = "The program is closing.";
    public static final String CONTINUE_QUESTION = "Would you like to serve another plant? (yes/no): ";
    public static final String INVALID_ANSWER = "Please answer yes or no";
    public static final String YES = "yes";
    public static final String NO = "no";

    public static final String RESULT_SEPARATOR = " - ";
    public static final String LITER_UNIT = " liter";


    public static final String DIGIT_PATTERN = ".*\\d.*";
    public static final String LETTER_PATTERN = ".*\\p{L}.*";
}
