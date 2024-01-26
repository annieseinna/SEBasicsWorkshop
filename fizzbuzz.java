
public void fizzbuzz() {
  for (int i = 1; i < 21; i++) {

    if (i % 5 == 0 && i % 3 == 0) {
      System.out.println("FizzBuzz");
      System.out.prinln();
    }
    else if (i % 3 == 0) {
      System.out.println("Fizz");
      System.out.prinln();
    }
    else if (i % 5 == 0) {
      System.out.println("Buzz");
      System.out.prinln();
    }
    else {
      System.out.println(i);
      System.out.prinln();
    }
  }
}
