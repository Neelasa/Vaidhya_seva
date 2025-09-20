package adsaaprograms;



	import java.util.*;

	public class SumOfSubsets {
	    // Array to store the subset
	    private int[] x;
	    private int[] w;
	    private int n;
	    private int m;

	    public SumOfSubsets(int[] w, int m) {
	        this.n = w.length;
	        this.w = w;
	        this.m = m;
	        this.x = new int[n];
	    }

	    // Recursive function to find all subsets that sum to m
	    public void sumOfSubsets(int s, int k, int r) {
	        x[k] = 1; // Include w[k] in the subset

	        // Check if a valid subset is found
	        if (s + w[k] == m) {
	            printSolution(k);
	        } else if (s + w[k] + w[k + 1] <= m) {
	            sumOfSubsets(s + w[k], k + 1, r - w[k]); // Consider next element in the subset
	        }

	        // Exclude w[k] from the subset and consider next element
	        if ((s + r - w[k] >= m) && (s + w[k + 1] <= m)) {
	            x[k] = 0;
	            sumOfSubsets(s, k + 1, r - w[k]);
	        }
	    }

	    // Helper method to print the solution
	    private void printSolution(int k) {
	        System.out.print("{ ");
	        for (int i = 0; i <= k; i++) {
	            if (x[i] == 1) {
	                System.out.print(w[i] + " ");
	            }
	            
	        }
	        System.out.println("}");
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the number of elements:");
	        int n = sc.nextInt();
	        int[] w = new int[n];
	        System.out.println("Enter the elements:");
	        for (int i = 0; i < n; i++) {
	            w[i] = sc.nextInt();
	        }
	        System.out.println("Enter the sum m:");
	        int m = sc.nextInt();
	        // Sort the array
	        Arrays.sort(w);

	        // Calculate the total sum of the array elements
	        int totalSum = Arrays.stream(w).sum();

	        SumOfSubsets sos = new SumOfSubsets(w, m);
	        sos.sumOfSubsets(0, 0, totalSum);
	        sc.close();
	    }
	}


