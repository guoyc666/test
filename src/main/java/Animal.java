public enum Animal {
    CAT("cat", 0),
    DOG("dog", 1),
    FISH("fish", 2),
    BIRD("bird", 3),
    RABBIT("rabbit", 4);
    private final String name;
    private int num;
    Animal(String name, int num) {
        this.name = name;
        this.num = num;
    }
    public String getName() {
        return name;
    }
    public int getNum() {
        return num;
    }
    public void addNum(int num) {
        this.num += num;
    }
    public void subtractNum(int num) {
        if(this.num - num < 0) {
            throw new IllegalArgumentException("Cannot subtract more than the current number");
        }
        this.num -= num;
    }
}
