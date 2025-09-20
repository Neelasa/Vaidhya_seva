package com.currency.converter;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

public class CurrencyConverter {

    private static final Map<String, Double> exchangeRates = new HashMap<>();

    static {
        // Hardcoded exchange rates for demonstration
        exchangeRates.put("USD", 1.0);     // Base currency
        exchangeRates.put("EUR", 0.85);
        exchangeRates.put("JPY", 110.0);
        exchangeRates.put("GBP", 0.75);
    }

    public static double convert(String fromCurrency, String toCurrency, double amount) {
        if (!exchangeRates.containsKey(fromCurrency) || !exchangeRates.containsKey(toCurrency)) {
            throw new IllegalArgumentException("Invalid currency type");
        }
        double baseAmount = amount / exchangeRates.get(fromCurrency);
        return baseAmount * exchangeRates.get(toCurrency);
    }

    public static void main(String[] args) {
        // Create the main frame
        JFrame frame = new JFrame("Currency Converter");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setLayout(new GridLayout(4, 2));

        // Create components
        JLabel amountLabel = new JLabel("Amount:");
        JTextField amountField = new JTextField();
        JLabel fromLabel = new JLabel("From:");
        String[] currencies = {"USD", "EUR", "JPY", "GBP"};
        JComboBox<String> fromCurrencyCombo = new JComboBox<>(currencies);
        JLabel toLabel = new JLabel("To:");
        JComboBox<String> toCurrencyCombo = new JComboBox<>(currencies);
        JButton convertButton = new JButton("Convert");
        JLabel resultLabel = new JLabel("Converted Amount:");

        // Add action listener to the button
        convertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double amount = Double.parseDouble(amountField.getText());
                    String fromCurrency = (String) fromCurrencyCombo.getSelectedItem();
                    String toCurrency = (String) toCurrencyCombo.getSelectedItem();
                    double convertedAmount = convert(fromCurrency, toCurrency, amount);
                    resultLabel.setText(String.format("Converted Amount: %.2f %s", convertedAmount, toCurrency));
                } catch (NumberFormatException ex) {
                    resultLabel.setText("Please enter a valid amount!");
                } catch (IllegalArgumentException ex) {
                    resultLabel.setText(ex.getMessage());
                }
            }
        });

        // Add components to the frame
        frame.add(amountLabel);
        frame.add(amountField);
        frame.add(fromLabel);
        frame.add(fromCurrencyCombo);
        frame.add(toLabel);
        frame.add(toCurrencyCombo);
        frame.add(convertButton);
        frame.add(resultLabel);

        // Set frame properties
        frame.setVisible(true);
    }
}