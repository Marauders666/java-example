package component;

public class ImageComponent extends DashboardComponent {
    public ImageComponent(int x, int y) {
        super(x, y);
    }

    @Override
    public String render() {
        return "image";
    }
}
