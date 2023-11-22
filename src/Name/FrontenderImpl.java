package Name;

public class FrontenderImpl implements Frontender, Developer {
    private String name;
    private String frontTechnology;

    public FrontenderImpl(String name, String frontTechnology) {
        this.name = name;
        this.frontTechnology = frontTechnology;
    }
    public String getFrontTechnology() {
        return frontTechnology;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void developGUI() {
        System.out.println("Developer " + name + " develops frontend on " + frontTechnology);
    }
}
