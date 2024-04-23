package component;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.util.ArrayList;
import java.util.List;

public class CustomSpinner extends JSpinner {

    private JComboBox<String> comboBox;
    private SpinnerListModel spinnerModel;

    public CustomSpinner(List<String> items) {
        super();

        // Buat objek JComboBox dan tambahkan item
        comboBox = new JComboBox<>();
        for (String item : items) {
            System.out.println(item);
             comboBox.addItem(item);
        }

       // Inisialisasi SpinnerListModel dengan ArrayList kosong
        spinnerModel = new SpinnerListModel(new ArrayList<>());

        // Tambahkan ChangeListener ke JComboBox
        comboBox.addActionListener(e -> {
            spinnerModel.setList(getComboBoxItems());
            setValue(comboBox.getSelectedItem());
        });

        // Tambahkan ChangeListener ke JSpinner
        addChangeListener(e -> comboBox.setSelectedItem(getValue()));

        // Tetapkan model ke JSpinner
        setModel(spinnerModel);
    }

    public JComboBox<String> getComboBox() {
        return comboBox;
    }

    private List<String> getComboBoxItems() {
        List<String> comboBoxItems = new ArrayList<>();
        for (int i = 0; i < comboBox.getItemCount(); i++) {
            comboBoxItems.add((String) comboBox.getItemAt(i));
        }
        return comboBoxItems;
    }
}
