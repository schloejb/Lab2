class Main {
  public static void main(String[] args) {
    System.out.println("M&M Color Counts");

    int total = 55 * 11;

    double blue = .24;
    double brown = .13;
    double green = .16;
    double orange = .20;
    double red = .13;
    double yellow = .14;

    blue = total * .24;
    System.out.println("blue: " + blue);

    brown = total * .13;
    System.out.println("brown: " + brown);

    green = total * .16;
    System.out.println("green: " + green);

    orange = total * .20;
    System.out.println("orange: " + orange);

    red = total * .13;
    System.out.println("red: " + red);

    yellow = total * .14;
    System.out.println("yellow: " + yellow);

    int sum = 605;
    System.out.println(" Sum is: " + sum);

    if ( blue < brown & red > orange)
    System.out.println("Blue under Brown and Red over Orange");

    if (brown >= green)
    System.out.println("Brown is greater than or equal to Green");

    if ( sum == total)
    System.out.println("Numbers match");
  }
}