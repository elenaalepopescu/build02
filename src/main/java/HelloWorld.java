import java.util.logging.Logger;
/**
 * This is the class prints "Hello, World" to the terminal.
 */
public class HelloWorld {
private static final Logger logger = Logger.getLogger(HelloWorld.class.getName());
/**
 * Main method that runs the application.
 *
 * @param args command-line arguments (not used)
 */
public static void main(String[] args) {
// Prints "Hello, World" to the terminal window.
HelloWorldHelper helper = new HelloWorldHelper();
logger.info(helper.useEnglish());
}
}
