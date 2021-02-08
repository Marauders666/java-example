package component;

public class LabelComponent extends DashboardComponent{
    public LabelComponent(int x, int y) {
        super(x, y);
    }

    @Override
    public String render() {
        return "label";
    }

}
