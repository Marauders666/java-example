package Builder;

import dashboard.RunnableDashboard;

public class BuilderRunnable {
    public static class Builder {

        private final RunnableDashboard newDash;

        public Builder() {
            newDash = new RunnableDashboard();
        }

        public Builder idDashboard(int idDashboard) {
            newDash.setIdDashboard(idDashboard);
            return this;
        }

        public RunnableDashboard build() {
            return newDash;
        }
    }
}
