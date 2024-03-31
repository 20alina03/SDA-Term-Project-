/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI;

/**
 *
 * @author alien
 */
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.json.JSONException;
import org.json.JSONObject;
import weatherapp.WeatherService;



public class CurrentWeather extends javax.swing.JFrame {

    private final WeatherService weatherService;
    /**
     * Creates new form CurrentWeather
     * @throws java.io.IOException
     */
    public CurrentWeather() throws IOException {
        initComponents();
         weatherService = new WeatherService(CityHolder.latitude, CityHolder.longitude); // Initialize WeatherService
        initializeWeatherData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        city = new javax.swing.JLabel();
        feelslike = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        currenttemperature = new javax.swing.JLabel();
        Maximumtemperature = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Minimumtemperature = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        pressure = new javax.swing.JLabel();
        Humidity = new javax.swing.JLabel();
        cloudiness = new javax.swing.JLabel();
        Windspeed = new javax.swing.JLabel();
        Timestamp = new javax.swing.JLabel();
        Back = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 500));
        setSize(new java.awt.Dimension(800, 500));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 30)); // NOI18N
        jLabel1.setText("Current Weather in:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(230, 60, 290, 40);

        city.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jPanel1.add(city);
        city.setBounds(520, 60, 200, 50);
        jPanel1.add(feelslike);
        feelslike.setBounds(410, 220, 360, 60);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel4.setText("Feels Like :");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(330, 240, 69, 20);

        currenttemperature.setFont(new java.awt.Font("Segoe UI", 2, 80)); // NOI18N
        jPanel1.add(currenttemperature);
        currenttemperature.setBounds(260, 100, 420, 120);

        Maximumtemperature.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jPanel1.add(Maximumtemperature);
        Maximumtemperature.setBounds(200, 330, 240, 40);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Maximum Today:");
        jLabel2.setToolTipText("");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(70, 340, 120, 20);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Minimum Today:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(70, 380, 120, 20);

        Minimumtemperature.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jPanel1.add(Minimumtemperature);
        Minimumtemperature.setBounds(200, 370, 210, 30);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel5.setText("Pressure:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(520, 310, 80, 16);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel6.setText("Humidity:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(500, 340, 90, 20);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel7.setText("Cloudiness:");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(490, 370, 100, 16);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel8.setText("Windspeed:");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(500, 400, 110, 20);

        pressure.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        jPanel1.add(pressure);
        pressure.setBounds(600, 310, 190, 16);

        Humidity.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        jPanel1.add(Humidity);
        Humidity.setBounds(600, 340, 220, 16);

        cloudiness.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        jPanel1.add(cloudiness);
        cloudiness.setBounds(600, 370, 220, 16);

        Windspeed.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        jPanel1.add(Windspeed);
        Windspeed.setBounds(600, 400, 210, 16);

        Timestamp.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPanel1.add(Timestamp);
        Timestamp.setBounds(280, 10, 340, 50);

        Back.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Back.setText("Back");
        Back.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 153, 255), new java.awt.Color(0, 204, 255)));
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });
        jPanel1.add(Back);
        Back.setBounds(90, 410, 50, 24);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/backcw.png"))); // NOI18N
        jLabel9.setText("jLabel9");
        jLabel9.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 153, 255), new java.awt.Color(0, 204, 255)));
        jPanel1.add(jLabel9);
        jLabel9.setBounds(0, 0, 800, 510);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(5, 5, 820, 500);
        jPanel1.getAccessibleContext().setAccessibleName("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        // TODO add your handling code here:
        dispose();
    
    // Reopen the previous form (options form)
    options optionsForm = new options();
    optionsForm.setVisible(true);
    }//GEN-LAST:event_BackActionPerformed

    private void initializeWeatherData() throws IOException {
        fetchAndDisplayCurrentWeather();
    }

    void fetchAndDisplayCurrentWeather() {
    try {
        // Get the latitude and longitude from CityHolder
        double latitude = CityHolder.latitude;
        double longitude = CityHolder.longitude;

        // Fetch current weather using WeatherService
        String currentWeatherJson = weatherService.getCurrentWeather(latitude, longitude);
        JSONObject currentWeather = new JSONObject(currentWeatherJson);

        // Update UI elements with current weather data
        updateUIWithWeatherData(currentWeather);
    } catch (JSONException | IOException ex) {
        JOptionPane.showMessageDialog(this, "Error fetching current weather: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
}

    
   private void updateUIWithWeatherData(JSONObject currentWeather) throws JSONException {
    double temperature = currentWeather.getJSONObject("main").getDouble("temp") - 273.15;
    double feelsLike = currentWeather.getJSONObject("main").getDouble("feels_like") - 273.15;
    double minTemp = currentWeather.getJSONObject("main").getDouble("temp_min") - 273.15;
    double maxTemp = currentWeather.getJSONObject("main").getDouble("temp_max") - 273.15;
    int humidity = currentWeather.getJSONObject("main").getInt("humidity");
    double pressureVal = currentWeather.getJSONObject("main").getDouble("pressure");
    double windSpeed = currentWeather.getJSONObject("wind").getDouble("speed");
    int clouds = currentWeather.getJSONObject("clouds").getInt("all");
    long timestamp = currentWeather.getLong("dt"); // Parse dt as long integer
     String weatherDescription = currentWeather.getJSONArray("weather").getJSONObject(0).getString("description");

    // Convert the Unix timestamp to a human-readable date/time format
    Date date = new Date(timestamp * 1000); // Convert seconds to milliseconds
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd\nEEEE HH:mm:ss");
    String formattedDate = sdf.format(date);
    // Update UI labels with current weather data
    city.setText(CityHolder.cityName);
    currenttemperature.setText(String.format("%.2f", temperature) + "°C");
    feelslike.setText("<html><b>Feels Like:</b> " + String.format("%.2f", feelsLike) + "°C<br>" + weatherDescription + "</html>");
    Minimumtemperature.setText(String.format("%.2f", minTemp) + "°C");
    Maximumtemperature.setText(String.format("%.2f", maxTemp) + "°C");
    Humidity.setText(humidity + "%");
    pressure.setText(pressureVal + "hPa");
    Windspeed.setText(windSpeed + "m/s");
    cloudiness.setText(clouds + "%");
    Timestamp.setText("<html><div style='text-align: center;'><b>" + formattedDate + "</b></div></html>");
}


    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
/* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see
         */
        // Set the Nimbus look and feel...
                java.awt.EventQueue.invokeLater(() -> {
            try {
                new CurrentWeather().setVisible(true);
            } catch (IOException ex) {
                Logger.getLogger(CurrentWeather.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
        //</editor-fold>

        /* Create and display the form */
        

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JLabel Humidity;
    private javax.swing.JLabel Maximumtemperature;
    private javax.swing.JLabel Minimumtemperature;
    private javax.swing.JLabel Timestamp;
    private javax.swing.JLabel Windspeed;
    private javax.swing.JLabel city;
    private javax.swing.JLabel cloudiness;
    private javax.swing.JLabel currenttemperature;
    private javax.swing.JLabel feelslike;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel pressure;
    // End of variables declaration//GEN-END:variables
}