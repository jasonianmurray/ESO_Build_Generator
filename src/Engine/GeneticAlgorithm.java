/*
 * Author(s): Jason Ian Murray
 * Creation Date: 24/11/2017
 * Date Modified: --/--/----
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
		// TODO Auto-generated method stub
		
	}
	
	private void selection() {
		// TODO Auto-generated method stubS
		
	}
	
	private void crossover() {
		// TODO Auto-generated method stub
		
	}
	
	private void mutation() {
		// TODO Auto-generated method stub
		
	}

}
