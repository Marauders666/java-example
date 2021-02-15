package component;

public class ImageComponent extends AbstractDashboardComponent {
    public ImageComponent(int x, int y, int id) {
        super(x, y, id);
    }

    public ImageComponent(int x, int y, boolean vision, int id) {
        super(x, y, vision, id);
    }

    @Override
    public String render() {
        return "image";
    }
}
