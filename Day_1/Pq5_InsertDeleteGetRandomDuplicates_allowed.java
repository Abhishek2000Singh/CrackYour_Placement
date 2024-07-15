import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class Pq5_InsertDeleteGetRandomDuplicates_allowed {
    // With comments
static class RandomizedCollection {
    private Map<Integer, Set<Integer>> map; // Map to store values and their indices in the list
    private List<Integer> list; // List to store the values in the order they were inserted

    public RandomizedCollection() {
        this.map = new HashMap<>();
        this.list = new ArrayList<>();
    }

    // Inserts a value into the collection, returns true if the value was not present before
    public boolean insert(int val) {
        boolean ans = map.containsKey(val); // Check if the value is already present
        map.computeIfAbsent(val, key -> new HashSet<>()).add(list.size()); // Add the index to the set in the map
        list.add(val); // Add the value to the list
        return !ans; // Return true if the value was not present before
    }

    // Removes a value from the collection, returns true if the value was present
    public boolean remove(int val) {
        if (!map.containsKey(val)) return false; // If the value is not present, return false

        int indexVal = map.get(val).iterator().next(); // Get one of the indices of the value

        map.get(val).remove(indexVal); // Remove the index from the set in the map
        if (map.get(val).isEmpty()) map.remove(val); // If the set is empty, remove the value from the map

        if (indexVal != list.size() - 1) {
            // If the index to be removed is not the last index in the list

            // Update the map for the last value in the list
            map.get(list.get(list.size() - 1)).remove(list.size() - 1);
            map.get(list.get(list.size() - 1)).add(indexVal);

            list.set(indexVal, list.get(list.size() - 1)); // Replace the value at indexVal with the last value
        }

        list.remove(list.size() - 1); // Remove the last element from the list
        return true; // Return true since the value was present and removed
    }

    // Returns a random element from the collection
    public int getRandom() {
        Random random = new Random();
        int ind = random.nextInt(list.size()); // Generate a random index
        return list.get(ind); // Return the value at the random index
    }
}
public static void main(String[] args) {
    
}
}
