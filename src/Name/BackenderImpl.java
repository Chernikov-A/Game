package Name;

public class BackenderImpl implements Backender,Developer {
    private String name;
    private String backendTechnology;

    public BackenderImpl(String name, String backendTechnology) {
        this.name = name;
        this.backendTechnology = backendTechnology;
    }
    public String getBackendTechnology() {
        return backendTechnology;
    }

    @Override
    public void developBackend() {
        System.out.println("Developer " + name + " develops backend on " + backendTechnology);
    }

    @Override
    public String getName() {
        return name;
    }
}
