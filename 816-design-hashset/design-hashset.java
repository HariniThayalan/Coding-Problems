class MyHashSet {

    private boolean[] m; 
    public MyHashSet() {
        m = new boolean[1000001];
    }
    
    public void add(int key) {
        m[key] = true;
    }
    
    public void remove(int key) {
        m[key] = false;
    }
    
    public boolean contains(int key) {
        return m[key];
    }
}