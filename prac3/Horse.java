class Horse extends Animal {

    private String breed;

    public Horse() {
        super();
        this.breed = "неизвестно";
    }

    public Horse(String name, int weight, Gender gender) {
        super(gender, name, weight);   
        this.breed = "неизвестно";
    }

    public Horse(String name, int weight, Gender gender, String breed) {
        super(gender, name, weight);
        this.breed = breed;
    }

    @Override
    public String voice() {
        return "И-го-го";
    }

    @Override
    public String eat() {
        return name + " ест овёс и сено";
    }

    public String voice(String mood) {
        if (mood.equals("весело")) {
            return "И-го-го-го-го!";
        }
        if (mood.equals("зло")) {
            return "Фрррр!";
        }
        return voice();
    }

    @Override
    public String toString() {
        return super.toString() +
               ", порода: " + breed +
               ", вес: " + weight + " кг";
    }
}