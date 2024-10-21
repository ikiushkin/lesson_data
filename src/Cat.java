public class Cat extends Animal {

    public Cat(Double runDistance, Double jumpHeight, Double swimDistance) {
        super(runDistance, jumpHeight, swimDistance);
    }

    @Override
    void run(Double distance) {
        System.out.println("Кошка сможет пробежать дистанцию " + distance + ": " + (distance <= runDistance));
    }

    @Override
    void jump(Double height) {
        System.out.println();
    }

    @Override
    void swim(Double distance) {
        if (distance == null) {
            System.out.println("Кошка не умеет плавать!");
        }
        System.out.println();
    }
}