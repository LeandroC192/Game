public class Level
{
    private boolean goalReached;
    private int points;

    /** Returns true if the player reached the goal on this level and returns false otherwise */
    public boolean goalReached()
    { 
        /* implementation not shown */
        return goalReached;
    }

    public void reachGoal()
    {
        goalReached = true;
    }

    /** Returns the number of points (a positive integer) recorded for this level */
    public int getPoints()
    { 
        /* implementation not shown */ 
        return points;
    }

    public void setPoints(int p)
    {
        points = p;
    }

    // There may be instance variables, constructors, and methods that are not shown.
}
