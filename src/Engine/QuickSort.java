/*
 * Author(s): Jason Ian Murray
 * Creation Date: 24/11/2017
 * Date Modified: 27/11/2017
 * Description:
 * This implementation of the quick sort algorithm
 * is a version of the recursive quick sort and
 * partition algorithm as described within
 * Newcastle University's Algorithm Design and
 * Analysis course.
 * 
 * It will be used to sort the population by fitness
 * for selection.
 */
package Engine;
import Agent.Agent;

public class QuickSort {
	int p;
	public QuickSort(Agent [] pop, int left, int right) {
		p = partition(pop, left, right);
		new QuickSort(pop, left, p-1);
		new QuickSort(pop, p+1, right);
	}
	
	private int partition(Agent [] pop, int left, int right) {
		double v = pop[right].getFitness();
		int pLeft = left, pRight = right;
		
		while(pLeft < pRight) {
			while(pop[pLeft].getFitness() < v) pLeft++;
			while(pop[pRight].getFitness() >= v && pRight > left) pRight--;
			if(pLeft < pRight) swap(pop, pLeft, pRight);
		}
		
		swap(pop, pLeft, right);
		return pLeft;
	}
	
	
	private void swap(Agent [] pop, int pLeft, int pRight) {
		Agent temp = pop[pLeft];
		pop[pLeft] = pop[pRight];
		pop[pRight] = temp;
	}
}

