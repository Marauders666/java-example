package dashboard;

import component.*;

import java.util.*;

public abstract class AbstractDashboard implements Dashboard{

    private List<DashboardComponent> components = new ArrayList<>();


    @Override
    public void redirect(String dashboardUrl) {

    }

    @Override
    public void search(String search) {

    }

    protected abstract void render();

    @Override
    public void start() {
        System.out.println("starting...");
        render();
    }

    @Override
    public void stop() {

    }

    @Override
    public void addComponent(DashboardComponent component) {
        components.add(component);
    }

    @Override
    public void removeComponent(DashboardComponent component) {
        components.remove(component);
    }
}
