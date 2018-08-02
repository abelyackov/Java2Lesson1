package Marathon;

public class Human implements Competitor {
    static String name;

    int maxRunDistance;
    int maxJumpHeight;
    int maxSwimDistance;

    boolean active;

    public Human(String name, int maxRunDistance, int maxJumpHeight, int maxSwimDistance) {
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
        this.maxSwimDistance = maxSwimDistance;
        this.active = true;
    }

    @Override
    public void run(int dist) {
        if (dist <= maxRunDistance) {
            //System.out.println(name + " успех");
        } else {
            //System.out.println("провал");
            active = false;
        }
    }

    @Override
    public void swim(int dist) {
        if (dist <= maxJumpHeight) {
            //System.out.println(name + " успех");
        } else {
            //System.out.println("провал");
            active = false;
        }
    }

    @Override
    public void jump(int height) {
        if (height <= maxSwimDistance) {
            //System.out.println(name + " успех");
        } else {
            //System.out.println("провал");
            active = false;
        }
    }

    @Override
    public boolean isOnDistance() {
        return active;
    }

    @Override
    public void info() {
        System.out.println(name + ": макс. дистанция бега: " + maxRunDistance + ". Макс. высота прыжка: " + maxJumpHeight + ". Макс. длина заплыва: " + maxSwimDistance + ". Статус: " + active);
    }
}

