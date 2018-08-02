package Marathon;

public class Team {
    private String name;
    Competitor[] competitors;

    public Team(String name) {
        this.name = name;
        Competitor[] competitors =
                {
                        new Human("Bob",500,2,100),
                        new Cat("Vaska", 80, 3, 10),
                        new Dog("Bobik", 100, 5, 30),
                        new Cat("Barsik", 50, 4, 8)
                };
        this.competitors = competitors;
    }

    public void showTeam() {
        System.out.println("Команда: " + name);
        for (Competitor c : competitors) {
            c.info();
        }
    }

    public void showOnDistance(){
        System.out.println("Дистанцию прошли следующие участники команды " + name + ": ");
        for (Competitor c : competitors) {
            if(c.isOnDistance())
                c.info();
        }
    }
}
