package edu.guilford;

import java.io.File;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;

//individualpane is a class that extends one of the Pane classes
public class IndividualPane extends GridPane {
    // could have GridPane, TilePane, StackPane, BorderPane, and others
    // these organize the components we want to display in different ways

    // three string attrivutes
    // private String name;
    // private String email;
    // private String phone;

    // individual attribute
    private Individual individual;

    // add a textfield attirbute for the name
    private TextField nameField;

    // add a textfield attribute for the email
    private TextField emailField;
    // add a textfield attribute for the phone
    private TextField phoneField;

    // add a submit button attribute
    private Button submitButton;

    // three label attributes for name, email, and phone
    private Label nameLabel;
    private Label emailLabel;
    private Label phoneLabel;

    // step 1: declare an imageview attribute
    private ImageView imageView;
    private ImageView imageView2;

    // constructor
    public IndividualPane(Individual individual) {
        // set the individual attribute to individual parameter
        this.individual = individual;

        // instantiate submit button
        submitButton = new Button("Submit");

        // step 2 : // instantiate imageview
        // get the path of the file that contains the image
        File avatar = new File(this.getClass().getResource("picachu.png").getPath());
        File avatar2 = new File(this.getClass().getResource("Eren.png").getPath());
        // print the path to the console
        System.out.println("PATH: " + avatar);

        // URI stands for Uniform Resource Identifier and it is similar to URL
        imageView = new ImageView(avatar.toURI().toString());
        imageView2 = new ImageView(avatar2.toURI().toString());

        // instantiate name field
        nameField = new TextField();
        // instantiate email field
        emailField = new TextField();
        // instantiate phone field
        phoneField = new TextField();

        // instantiate label attributes
        nameLabel = new Label("Name: " + individual.getName());
        emailLabel = new Label("Email: " + individual.getEmail());
        phoneLabel = new Label("Phone: " + individual.getPhone());

        // add a label to the pane
        this.add(nameLabel, 0, 0);
        this.add(emailLabel, 0, 1);
        this.add(phoneLabel, 0, 2);

        // add a name field to the pane nex to the name label
        this.add(nameField, 1, 0);
        // add an email field to the pane next to the email label
        this.add(emailField, 1, 1);
        // add a phone field to the pane next to the phone label
        this.add(phoneField, 1, 2);
        // add a submit button to the pane
        this.add(submitButton, 0, 3);

        // step 3: add the imageview to the pane
        this.add(imageView, 7, 1, 2, 4);
        this.add(imageView2, 1, 8, 5, 4);

        // we can change the image to be a different size
        imageView.setFitHeight(100);
        // and preserve the aspect ration (no distortion)
        imageView.setPreserveRatio(true);
        // rotate by 45 degrees
        imageView.setRotate(45);

        imageView2.setFitHeight(100);
        imageView2.setPreserveRatio(true);
        imageView2.setRotate(180);

        // give the pane a border
        this.setStyle("-fx-border-color: black");
        // make the border thicker
        this.setStyle("-fx-border-width: 2px");

        // add a background color
        this.setStyle("-fx-background-color: lightgrey");

        // steps 4 & 5: Write an event listener and connect it to the component that
        // triggers the event
        // add a listener for the button that changes the labels
        submitButton.setOnAction(e -> {
            // set the name label to the name field
            nameLabel.setText("Name: " + nameField.getText());
            // set the email label to the email field
            emailLabel.setText("Email: " + emailField.getText());
            // set the phone label to the phone field
            phoneLabel.setText("Phone: " + phoneField.getText());
            // update the individual attribute with the new data
            individual.setName(nameField.getText());
            individual.setEmail(emailField.getText());
            individual.setPhone(phoneField.getText());
            System.out.println(e.toString());
        });

        // steps 4 & 5: Write an event listener and connect it to the component that
        // triggers the event
        // rotate the image 180 degrees when it is clicked
        imageView.setOnMouseClicked(e -> {
            imageView.setRotate(180);
        });
        imageView2.setOnMouseClicked(e -> {
            imageView2.setRotate(0);
        });

    }

}
