/*
 * Author(s): Jason Ian Murray
 * Creation Date: 24/11/2017
 * Date Modified: 27/11/2017
 * Description:
 * This is the GA the will be used to generate and evolve
 * populations of subsolitions. Each subsolution would represent
 * an invidual potential build.
 * 
 * GA structure
 * -- initialisation
 * -- fitness assignment
 * -- selection
 * -- crossover
 * -- mutation
 * -- repeat until stopping criteria
 * -- provide fittest solution(s)
 */

package Engine;

import Agent.Agent;

public class GeneticAlgorithm {
	Agent [] pop;
	int popSize;
	
	public Agent [] run(int iter, int popSize) {
		this.popSize = popSize;
		initialization();
		for(int x = 0; x < iter; x++) {
			fitnessAssignment();
			selection();
			crossover();
			mutation();
		}
		return pop;
	}

	private void initialization() {
		pop = new Agent[popSize];
		for(int x = 0; x < pop.length; x++) {
			pop[x] = new Agent();
		}
	}
	
	private void fitnessAssignment() {
		for(int x = 0; x < pop.length; x++) {
			pop[x].calcFitness();
		}
		
	}
	
	private void selection() {
		new QuickSort(pop, 0, pop.length - 1);
		// Pop should now be sorted (fittest first)
		// Decide on selection strategy
		
	}
	
	private void crossover() {
		// TODO Auto-generated method stub
		
	}
	
	private void mutation() {
		// TODO Auto-generated method stub
		
	}

}
