package dashboard;

import component.*;

import java.util.*;

public abstract class AbstractDashboard implements Dashboard {

    protected List<DashboardComponent> components = new ArrayList<>();
    private int idDashboard;

    public void setIdDashboard(int idDashboard) {
        this.idDashboard = idDashboard;
    }

    public int getIdDashboard() {
        return idDashboard;
    }

    @Override
    public void redirect(String dashboardUrl) {
        System.out.println("redirect to " + dashboardUrl);
    }

    @Override
    public void search(String search) {
        System.out.println("search to" + search);
    }

    protected abstract void render();

    @Override
    public void start() {
        System.out.println("starting...");
        render();
    }

    @Override
    public void stop() {
        System.out.println("Stop");
    }

    @Override
    public void addComponent(DashboardComponent component) {
        components.add(component);
    }

    @Override
    public void removeComponent(DashboardComponent component) {
        components.remove(component);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public void sort() {
        Collections.sort(components);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AbstractDashboard that = (AbstractDashboard) o;
        return idDashboard == that.idDashboard && components.equals(that.components);
    }

    @Override
    public int hashCode() {
        return Objects.hash(components, idDashboard);
    }
}
