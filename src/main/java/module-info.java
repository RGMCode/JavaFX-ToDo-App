module de.rgmcode.javafx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens de.rgmcode.javafx to javafx.fxml;
    exports de.rgmcode.javafx;
}