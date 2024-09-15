import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;
/*
 SliderDemo is a Java Swing application that demonstrates the use of a JSlider component.
The slider allows the user to select a value between 0 and 100, and the corresponding
 temperature in degrees Celsius is displayed in a JLabel.
 
 Example:
  To run the application, create an instance of the SliderDemo class and call its
  default constructor. This will create a JFrame with a JSlider and a JLabel that
  displays the current temperature.
*/


public class SliderDemo implements ChangeListener{



    JFrame frame;
    JPanel panel; // panel is a container which can holds button, texts , labels etc.

    // The JLabel that displays the current temperature.
    JLabel label; //A Label object is a component for placing text in a container. A label displays a single line of read-only text. The text can be changed by the application, but a user cannot edit it directly.

    // The JSlider(a component) that allows the user to select a value.
    JSlider slider;

    SliderDemo(){

        frame = new JFrame("Slider Demo");
        panel = new JPanel();
        label = new JLabel();
        slider = new JSlider(0,100,50);

        slider.setPreferredSize(new Dimension(400,200));
        
        slider.setPaintTicks(true);
        slider.setMinorTickSpacing(10);
        
        
        
        slider.setPaintTrack(true);
        slider.setMajorTickSpacing(25);

        slider.setPaintLabels(true);
        slider.setFont(new Font("MV Boli",Font.PLAIN,15));
        label.setFont(new Font("MV Boli",Font.PLAIN,25));

        slider.setOrientation(SwingConstants.VERTICAL);
        // slider.setOrientation(SwingConstants.HORIZONTAL);

        label.setText("°C = "+ slider.getValue());

        slider.addChangeListener(this);


        panel.add(slider);
        panel.add(label);
        frame.add(panel);


        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setVisible(true);
    }

        @Override
        public void stateChanged(ChangeEvent e) {
            label.setText("°C = "+ slider.getValue());

        }

    
}

    
