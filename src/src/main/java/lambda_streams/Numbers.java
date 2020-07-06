package lambda_streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.math.BigInteger;

interface compVal {
	public int compare(int i, int j);
}

interface lambdaAppend {
	public int lAppend(int i);

	public class Numbers {

		public static void main(String[] args) {
			List<Integer> nums = Arrays.asList(10, 100, 1000, 5, 50, 500, 3, 30, 300, 7, 70, 700, 1, 10, 100, 25, 250,
					2500);

			Object[] arr = nums.toArray();
			System.out.println(arr.length);

			int comp = compare(23, 33);
			System.out.println("Compare values : " + comp);

			compVal num = (i, j) -> {
				if (nums.get(i) > nums.get(j)) {
					return 1;
				} else {
					return -1;
				}
			};
			System.out.println("Compare Lambda " + num.compare(2, 3));

			

			List<Integer> lambdaOdd = nums.stream().filter(n -> (n % 2 != 0)).collect(Collectors.toList());
			// lambdaOdd.forEach(n -> System.out.println(n));
			System.out.println(lambdaOdd);

			List<Integer> lambdaEven = nums.stream().filter(n -> (n % 2 == 0)).collect(Collectors.toList());
//		lambdaEven.forEach(n -> System.out.println(n));
			System.out.println(lambdaEven);

			List<Integer> lambdaPrime = nums.stream().filter(n -> (n % 2 != 0 && n % n == 0))
					.collect(Collectors.toList());
//		lambdaPrime.forEach(n -> System.out.println("prime numbers :" + n));
			System.out.println(lambdaPrime);

			Function<List<Integer>, Integer> lambdaAdded = (n) -> nums.stream().mapToInt(value -> value).sum();
			System.out.println("The sum of the elements in the array list is " + lambdaAdded.apply(nums));

			Function<List<Integer>, BigInteger> lambdaMultiplied = (n) -> nums.stream().map(BigInteger::valueOf)
					.reduce(BigInteger.ONE, BigInteger::multiply);
			System.out.println("The product of elements in the array list is " + lambdaMultiplied.apply(nums));

			int lambdaMin = nums.stream().min((i1, i2) -> i1.compareTo(i2)).get();
			System.out.println("Minimum number of all elements :" + lambdaMin);

			int lambdaMax = nums.stream().min((i1, i2) -> -i1.compareTo(i2)).get();
			System.out.println("Maximum number of all elements :" + lambdaMax);

			int appNumber = append(37);
			System.out.println("The appended Number is : " + appNumber);

			lambdaAppend appNum1 = (int i) -> {
				List<Integer> newNums = new ArrayList<Integer>(nums);
				newNums.add(i);
				return newNums.get(newNums.size() - 1);
			};
			System.out.println("Append - Lambda " + appNum1.lAppend(28));
		}

		private static int append(int i) {
			// TODO Auto-generated method stub
			return 0;
		}

		// int lambdaAdd = nums.addAll(nums);
//lambdaAdd.forEach(n -> System.out.println("prime numbers :"+n));

//	 //Part I :complete the static class methods that have been set up in this Numbers class java file.  Use streams to compute the results wheever possible.
//		        System.out.println(nums);
//
//		        //Part II - refactor all of the class methods to accept lambda expressions. You can put the lambda functions directly inside the method calls, or defined them first, then pass them into the methods. give them the same names as the static methods, but add the word 'lambda' in front of every lambda function:
//		        /* e.g.
//
//		        added(() -> {});
//
//		        OR
//
//		        lambdaAdd = () -> {};
//		        added(lambdaAdd);
//
//		        isOdd(() -> {});
//
//		        OR
//
//		        lambdaOdd = () -> {};
//		        isOdd(lambdaOdd);
//		        etc...
//
//		        */
//
//		    }
//
//		    static boolean isOdd(int i) {
//		        //determine if the value at the index i is odd.  return true if yes, return false if  no.
//		        return false;
//		    }
//
//		    static boolean isEven(int i) {
//		        //determine if the value at the index i is even.  return true if yes, return false if  no.
//		        return false;
//		    }
//
//		    static boolean isPrime(int i) {
//		         //determine if the value at the index i is a prime number.  return true if yes, return false if no.
//		         return false;
//		    }
//
//		    static int added() {
//		        //add all the elements in the list.  return the sum.  
//		        return 0;
//		    }
//
//		    static int subtracted() {
//		        //subtract all the elements in the list. return the remainder.
//		        return 0;
//		    }
//
//		    static int multipled() {
//		        //multiply all the elements in the list. and return the product.
//		        return 0;
//		    }
//
//		    static int divided() {
//		        //multiply all the elements in the list. and return the product.
//		        return 0;
//		    }
//
//		    static int findMax() {
//		         //return the maximum value in the list.
//		        return 0;
//		    }
//
//		    static int findMin() {
//		        //return the minimum value in the list.
//		        return 0;
//		    }
//
//		    static int compare(int i, int j) {
//		        //compare the values stored in the array at index position i and j.  
//		        //if the value at i is greater, return 1.  if the value at j is greater, return -1.  if the two values are equal, return 0.
//		        return 0;
//		    }
//
//		    static int append(int n) {
//		        //add a new value to the values list. return that value after adding it to the list.
//		        return 0;
//		    }
//
//		}
//

	}

	static int compare(int i, int j) {
		// TODO Auto-generated method stub
		return 0;
	}

}
