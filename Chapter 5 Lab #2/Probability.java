
/**
 * Write a description of class Probability here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Probability implements ProbabilityCalc, Comparable<Probability>
{
    // instance variables - replace the example below with your own
    private double chance;
    /**
     * Constructor for objects of class Probability
     */
    public Probability(double chace)
    {
        // initialise instance variables
        this.chance = chace;
    }
    
    public double probabilityAND(Probability p2) {
        return this.getChance() * p2.getChance();
    }
    
    public double probabilityOR(Probability p2, double overlap) {
        return this.getChance() + p2.getChance() - (this.probabilityAND(p2));
    }
    
    public int compareTo(Probability p2) {
        
        if (this.getChance() == p2.getChance()) {
            return -1;
        }
        else if (this.chance > p2.chance) {
            return 1;
        }
        else {
            return 0;
        }
    }
    public double getChance() {
        return this.chance;
    }
}
