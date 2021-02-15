package component;

public class LabelComponent extends AbstractDashboardComponent {
    public LabelComponent(int x, int y, int id) {
        super(x, y, id);
    }

    @Override
    public String render() {
        return "label";
    }
}
