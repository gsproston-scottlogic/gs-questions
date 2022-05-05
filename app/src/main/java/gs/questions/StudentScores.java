package gs.questions;

import java.util.ArrayList;
import java.util.HashMap;

/*
Given an array of length-2 String arrays, 
with each length-2 array containing a student’s name and a string representation of a integral examination score, 
find the highest mean score across all students.  
Different students could have sat different numbers of exams; 
exam scores can be negative; 
no need to return the name of the student who did best, just the score; 
if there are no students at all, return zero; 
if the mean for a student is not an integer, 
then use the highest integer that is lower than the exact mean 
(tip, not part of the question: be careful about assuming this can be done with integer division).  
Question had a single, simple test case; I was required to write more.  
Initial test case was something like : 
{{“Charles”, “50”}, {“Barry”, “67”}, {“Charles”, “80”}, {“John”, “49”}}.  
The result should be 67, because that is the highest mean score across all students. 
*/

public class StudentScores {
    public static Integer getHighestMean(final String[][] scores) {
        var map = new HashMap<String, ArrayList<Integer>>();
        // parse out the scores
        for (String[] entry : scores) {
            if (entry.length <= 0)
                return null;
            // get the name and result
            final String name = entry[0];
            final int result = Integer.parseInt(entry[1]);
            // add the entry to the map
            if (!map.containsKey(name)) {
                map.put(name, new ArrayList<Integer>());
            }
            map.get(name).add(result);
        }

        // now find the best mean score
        Integer bestMean = null;
        for (var entry : map.entrySet()) {
            if (!entry.getValue().isEmpty()) {
                int mean = 0;
                for (Integer score : entry.getValue()) {
                    if (score != null) {
                        mean += score;
                    }
                }
                mean /= entry.getValue().size();
                if (bestMean == null || bestMean < mean)
                    bestMean = mean;
            }
        }
        return bestMean;
    }
}
