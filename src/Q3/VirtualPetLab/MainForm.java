package Q3.VirtualPetLab;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Base64;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Locale;
import java.util.Scanner;

public class MainForm extends JFrame {
    private JPanel mainPanel;
    private JButton feedButton;
    private JButton playButton;
    private JButton sleepButton;
    private JLabel statusLabel;
    private JLabel imageLabel;
    private JComboBox<String> petSelectorComboBox;
    private JButton adoptButton;
    // TODO: add adoption buttons
    // Pet list
    private ArrayList<Pet> petList;
    private PetManager petManager = new PetManager();

    public MainForm() {
        super("Virtual Pet Simulator");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.setPreferredSize(new Dimension(800, 600));
        this.setMinimumSize(new Dimension(800, 600));
        this.setMaximumSize(new Dimension(800, 600));
        this.setResizable(false);
        this.pack();

        // Initialize starting pets
        petManager.addPet(new Dog("Buddy"));
        petManager.addPet(new Cat("Whiskers"));
        this.updatePetList();
        petSelectorComboBox.setSelectedItem(null);  // Clear selection after populating


        adoptButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name;
                String type;
                waitButtons(1);
                Scanner input = new Scanner(System.in);
                System.out.println("What type of pet do you want: Cat/Dog");
                type = input.next().trim().toLowerCase();
                System.out.println("Type the name of your new pet: ");
                name = input.next();
                for (int i = 0; i < petManager.getPetsNames().size(); i++) {
                    if (petManager.getPetsNames().get(i).trim().toLowerCase().equals(name)) {
                        name = null;
                    }
                }
                while (name.trim().equals(null) || name.trim().equals("")) {
                    name = input.next();
                }

                switch (type){
                    case ("cat") :
                    {
                        petManager.addPet(new Cat(name));
                    }
                    case ("dog") :
                    {
                        petManager.addPet(new Dog(name));
                    }

                    updatePetList();
                }
            }
        });


        // Feed button action
        feedButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                waitButtons(1);
                // TODO: Implement feeding the selected pet
                petList.get(petSelectorComboBox.getSelectedIndex()).feed();
                updateStatusLabel(petList.get(petSelectorComboBox.getSelectedIndex()).status());
            }
        });

        // Play button action
        playButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                waitButtons(1);
                // TODO: Implement playing with the selected pet
                petList.get(petSelectorComboBox.getSelectedIndex()).play();
                updateStatusLabel(petList.get(petSelectorComboBox.getSelectedIndex()).status());
            }
        });

        // Sleep button action
        sleepButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                waitButtons(1);
                // TODO: Implement putting the selected pet to sleep
                petList.get(petSelectorComboBox.getSelectedIndex()).sleep();
                updateStatusLabel(petList.get(petSelectorComboBox.getSelectedIndex()).status());
            }
        });

        // Pet selector action
        petSelectorComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Make sure the action event isn't triggered by the removeAllItems() call
                if (petSelectorComboBox.getSelectedIndex() == -1) return;

                // TODO: Implement pet selection change
                petList = petManager.getPets();
                petList.get(petSelectorComboBox.getSelectedIndex());
                // 1. Grab the current pet from the petManager using petSelectorComboBox.getSelectedIndex()
                updateStatusLabel(petList.get(petSelectorComboBox.getSelectedIndex()).status());
                // 2. Update statusLabel with the selected pet's status
                setPetImage(petList.get(petSelectorComboBox.getSelectedIndex()).getImage());
                // 3. Update imageLabel with the selected pet's image using setPetImage()
            }
        });

        // TODO: Implement adoption button actions
    }

    public void updateStatusLabel(String status) {
        // TODO: Update statusLabel with the provided status
        statusLabel.setText(status);
    }

    public void updatePetList() {
        petList = petManager.getPets();
        petSelectorComboBox.removeAllItems();  // Clear existing items
        // TODO: Update petSelectorComboBox with pet names from petManager
        for (int i = 0; i < petManager.getPetsNames().size(); i++)
        petSelectorComboBox.addItem(petManager.getPetsNames().get(i));
        petSelectorComboBox.setSelectedItem(petManager.getPets().size() - 1);
    }

    /* ========== DO NOT MODIFY BELOW ========== */
    public void waitButtons(int seconds) {
        // Disable buttons
        feedButton.setEnabled(false);
        playButton.setEnabled(false);
        sleepButton.setEnabled(false);
        adoptButton.setEnabled(false);

        // Set a timer to re-enable the buttons after N seconds (1000 ms = 1 second)
        Timer timer = new Timer(seconds * 1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                feedButton.setEnabled(true);
                playButton.setEnabled(true);
                sleepButton.setEnabled(true);
                adoptButton.setEnabled(true);
            }
        });
        timer.setRepeats(false); // Ensure the timer only runs once
        timer.start();
    }

    public void setPetImage(String base64Image) {
        try {
            byte[] imageBytes = Base64.getDecoder().decode(base64Image);
            ImageIcon icon = new ImageIcon(imageBytes);
            Image image = icon.getImage().getScaledInstance(300, 300, Image.SCALE_SMOOTH);
            icon = new ImageIcon(image);

            imageLabel.setIcon(icon);
            imageLabel.setText("");
        } catch (Exception e) {
            e.printStackTrace();
            imageLabel.setIcon(null);
            imageLabel.setText('❌' + e.getMessage());
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MainForm().setVisible(true);
            }
        });
    }
}
