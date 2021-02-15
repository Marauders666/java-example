package component;

import java.util.Objects;

public abstract class AbstractDashboardComponent implements DashboardComponent {
    private int x;
    private int y;
    private boolean vision = true;
    private final int id;

    public AbstractDashboardComponent(int x, int y, int id) {
        this.x = x;
        this.y = y;
        this.id = id;
    }

    public AbstractDashboardComponent(int x, int y, boolean vision, int id) {
        this.x = x;
        this.y = y;
        this.vision = vision;
        this.id = id;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public abstract String render();

    @Override
    public void show() {
        vision = true;
    }

    @Override
    public void hide() {
        vision = false;
    }

    @Override
    public boolean isVisible() {
        return vision;
    }

    @Override
    public int compareTo(DashboardComponent o) {
        return Integer.compare(this.id, o.getId());
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AbstractDashboardComponent that = (AbstractDashboardComponent) o;
        return x == that.x && y == that.y && vision == that.vision && id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, vision, id);
    }
}
