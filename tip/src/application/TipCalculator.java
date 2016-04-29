package application;

public class TipCalculator {
	@FXML
	private TextField amountTextField;

	@FXML
	private TextField totalTextField;
	
	@FXML
	private Slider tipSlider;

	@FXML
	private void calculateButtonPressed(ActionEvent event) {
		Float mealAmount = Float.parseFloat(amountTextField.getText());
// tip increase
		totalTextField.setText(String.valueOf(mealAmount * (1 + tipSlider))); 

}
}