import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


class Difference {
  	private int[] elements;
  	public int maximumDifference;
	  // Add your code here

    Difference (int[] elements) {
      this.elements = elements;
    }

    void computeDifference() {
      Arrays.sort(elements);
      maximumDifference = elements[elements.length-1] - elements[0];
    }
}