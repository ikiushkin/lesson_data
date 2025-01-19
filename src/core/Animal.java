package core;

abstract class Animal {
    Double runDistance;
    Double jumpHeight;
    Double swimDistance;

    public Animal(Double runDistance, Double jumpHeight, Double swimDistance) {
        this.runDistance = runDistance;
        this.jumpHeight = jumpHeight;
        this.swimDistance = swimDistance;
    }

    abstract void run(Double distance);
    abstract void jump(Double height);
    abstract void swim(Double distance);
}
