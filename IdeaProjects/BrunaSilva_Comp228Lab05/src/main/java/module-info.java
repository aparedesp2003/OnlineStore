module com.example.brunasilva_comp228lab05 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.example.brunasilva_comp228lab05 to javafx.fxml;
    exports com.example.brunasilva_comp228lab05;
}