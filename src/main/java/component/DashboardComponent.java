package component;

public interface DashboardComponent extends Comparable<DashboardComponent> {
    public int getX();

    public void setX(int x);

    public int getY();

    public void setY(int y);

    public abstract String render();

    public void show();

    public void hide();

    public boolean isVisible();

    public int getId();
}
