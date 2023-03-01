public class CmdArg {
  public static void main(String[] args) {
    // Check if any arguments were passed
    if (args.length == 0) {
      System.out.println("No arguments provided.");
    } else {
      System.out.println("Arguments provided:");
      // Loop through each argument and display it
      for (int i = 0; i < args.length; i++) {
        System.out.println(args[i]);
      }
    }
  }
}