package Builder;

import dashboard.EditableDashboard;

public class BuilderEditable {
    public static class Builder {

        private final EditableDashboard newDash;

        public Builder() {
            newDash = new EditableDashboard();
        }

        public Builder idDashboard(int idDashboard) {
            newDash.setIdDashboard(idDashboard);
            return this;
        }

        public EditableDashboard build() {
            return newDash;
        }
    }
}
