class Student extends Person{
	private int[] testScores;

    /*	
    *   Class Constructor
    *   
    *   @param firstName - A string denoting the Person's first name.
    *   @param lastName - A string denoting the Person's last name.
    *   @param id - An integer denoting the Person's ID number.
    *   @param scores - An array of integers denoting the Person's test scores.
    */
    // Write your constructor here
    Student(String firstName, String lastName, int id, int[] scores) {
      super(firstName, lastName, id, scores);
      this.testScores = scores;
    }
    /*	
    *   Method Name: calculate
    *   @return A character denoting the grade.
    */
    // Write your method here
    public char calculate() {
      int total = 0;
      for (int i:testScores)
        total = total + i;
      int average = total / testScores.length;
      if (average>=90)
        return 'O';
      if (average>=80)
        return 'E';
      if (average>=70)
        return 'A';
      if (average>=55)
        return 'P';
      if (average>=40)
        return 'D';
      return 'T';
    }
}