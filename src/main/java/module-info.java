module com.example.bets_day7 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.bets_day7 to javafx.fxml;
    exports com.example.bets_day7;
}