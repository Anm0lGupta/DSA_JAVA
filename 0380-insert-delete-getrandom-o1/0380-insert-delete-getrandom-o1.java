class RandomizedSet {
    private ArrayList<Integer> list;
    private Map<Integer, Integer> mp;
    private Random rand;
    public RandomizedSet() {
        list = new ArrayList<>();
        mp = new HashMap<>();
        rand = new Random();
    }
    
    public boolean insert(int val) {
        if(mp.containsKey(val))
        {
            return false;
        }
        list.add(val);
        mp.put(val, list.size()-1);
        return true;
    }
    
    public boolean remove(int val) {
        if(!mp.containsKey(val))
        {
            return false;
        }
        int idx = mp.get(val);
        int lastElement = list.get(list.size() - 1);
        list.set(idx, lastElement);
        mp.put(lastElement, idx);
        list.remove(list.size() - 1);
        mp.remove(val);
        return true;
    }
    
    public int getRandom() {
        int idx = rand.nextInt(list.size());
        return list.get(idx);
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */