module sulthan_zahran.battery_ev_predictor {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;

    opens sulthan_zahran.battery_ev_predictor to javafx.fxml;
    exports sulthan_zahran.battery_ev_predictor;
}