public class TotatCharacters {
  public static void main(String[] args) {
    String str = "Scaler by InterviewBit";
    int count = 0;
    System.out.println("Input String: " + str);
    //Count total characters in the given string except space
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) != ' ') count++;
    }
    //Display total number of characters in the given string
    System.out.println("The total number of characters in the given string: " + coun
  }
}