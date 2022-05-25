module ru.geekbrains.chat {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires org.apache.commons.io;

    requires org.kordamp.bootstrapfx.core;

    opens ru.geekbrains.chat to javafx.fxml;
    exports ru.geekbrains.chat;
}