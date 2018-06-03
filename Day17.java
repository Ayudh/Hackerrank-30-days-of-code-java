class Calculator {
  public int power(int p, int n) throws Exception {
    if (p<0 || n<0)
      throw new Exception("n and p should be non-negative");
    return (int)Math.pow(p,n);
  }
}