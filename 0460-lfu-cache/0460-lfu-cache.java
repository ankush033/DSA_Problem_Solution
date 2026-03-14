class LFUCache {

    int capacity;
    int minFreq;

    HashMap<Integer,Integer> valueMap;
    HashMap<Integer,Integer> freqMap;
    HashMap<Integer,LinkedHashSet<Integer>> freqList;

    public LFUCache(int capacity) {

        this.capacity = capacity;

        valueMap = new HashMap<>();
        freqMap = new HashMap<>();
        freqList = new HashMap<>();

        minFreq = 0;
    }

    public int get(int key) {

        if(!valueMap.containsKey(key))
            return -1;

        int freq = freqMap.get(key);

        freqList.get(freq).remove(key);

        if(freq == minFreq && freqList.get(freq).size() == 0)
            minFreq++;

        freq++;

        freqMap.put(key,freq);

        freqList.putIfAbsent(freq,new LinkedHashSet<>());
        freqList.get(freq).add(key);

        return valueMap.get(key);
    }

    public void put(int key,int value) {

        if(capacity == 0)
            return;

        if(valueMap.containsKey(key)){

            valueMap.put(key,value);
            get(key);
            return;
        }

        if(valueMap.size() == capacity){

            int evict = freqList.get(minFreq).iterator().next();

            freqList.get(minFreq).remove(evict);

            valueMap.remove(evict);
            freqMap.remove(evict);
        }

        valueMap.put(key,value);
        freqMap.put(key,1);

        freqList.putIfAbsent(1,new LinkedHashSet<>());
        freqList.get(1).add(key);

        minFreq = 1;
    }
}