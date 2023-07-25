package com.EventHandling;


	import javax.swing.*;
	import java.awt.*;
	import java.awt.event.*;

	public class EventHandlingDemo extends JFrame {

	    private JLabel label;
	    private JButton defaultButton;
	    private JButton customButton;

	    public EventHandlingDemo() {
	        setTitle("Event Handling Demo");
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setLayout(new FlowLayout());

	        label = new JLabel("Click a button!");
	        add(label);

	        defaultButton = new JButton("Default Button");
	        defaultButton.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                label.setText("Default button clicked!");
	            }
	        });
	        add(defaultButton);

	        customButton = new JButton("Custom Button");
	        customButton.addActionListener(new CustomButtonListener());
	        add(customButton);

	        pack();
	        setLocationRelativeTo(null);
	    }

	    // Custom event listener class
	    private class CustomButtonListener implements ActionListener {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	            label.setText("Custom button clicked!");
	        }
	    }

	    public static void main(String[] args) {
	        SwingUtilities.invokeLater(new Runnable() {
	            public void run() {
	                new EventHandlingDemo().setVisible(true);
	            }
	        });
	    }
	}



