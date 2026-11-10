class MyHashSet {
    private List<Integer>[] bucket;
    private int size = 15000;
    MyHashSet() {
        bucket = new LinkedList[size];
        for(int i=0; i<size; i++)
        {
            bucket[i] = new LinkedList<>();
        }
    }
    
    public void add(int key) {
        int bucketNo = key % size;
        List<Integer> chain = bucket[bucketNo];
        if(!chain.contains(key))
        {
            chain.add(key);
        }
    }
    
    public void remove(int key) {
        int bucketNo = key % size;
        List<Integer> chain = bucket[bucketNo];
        if(chain.contains(key))
        {
            chain.remove(Integer.valueOf(key));
        }       
    }
    
    public boolean contains(int key) {
        int bucketNo = key % size;
        List<Integer> chain = bucket[bucketNo];
        return chain.contains(key);
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */