package org.example;

import static java.lang.Integer.parseInt;

public class Main {

    /** Method 1
     * Method name: circleArea
     * Method return type: double
     * Method parameter: the radius of a circle
     * Method signature: circleArea(int)
     * Returns the area of a circle. */
    public static double circleArea(int radius) {
        double rad = (radius * radius) * Math.PI;
        rad = rad * 100;
        rad = Math.round(rad);
        rad = rad / 100;
        return rad;
    }

    /** Method 2
     * Method name: circleCircum
     * Method return type: double
     * Method parameter: the radius of a circle
     * Method signature: circleCircum(int)
     * Returns the circumference of a circle. */
    public static double circleCircum(int radius) {
        double cir = 2 * radius * Math.PI;
        cir = cir * 100;
        cir = Math.round(cir);
        cir = cir / 100;
        return cir;
    }

    /** Method 3
     * Method name: circleInfo
     * Method return type: String
     * Method parameter: the radius of a circle
     * Method signature: circleInfo(int)
     * Returns a String detailing the radius, circumference, and area of a circle.
     * Format of returned String: e.g.
     * Radius: 3
     * Circumference: 18.85
     * Area: 28.27 */
    public static String circleInfo(int radius) {
        return "Radius: " + radius + "\nCircumference: " + circleCircum(radius) + "\nArea: " + circleArea(radius);
    }

    /** Method 4
     * Method name: minutesToHoursMinutes
     * Method return type: String
     * Method parameter: total minutes (e.g. 226)
     * Method signature: minutesToHoursMinutes(int)
     * Returns a String detailing the number of hours and minutes.
     * Format of returned String: e.g. 3 hours and 46 minutes */
    public static String minutesToHoursMinutes(int minutes) {
        String min = String.valueOf(minutes % 60);
        String hr = String.valueOf(minutes / 60);
        return hr + " hours and " + min + " minutes";
    }

    /** Method 5
     * Method name: twentyFourToTwelve
     * Method return type: String
     * Method parameter: time in 24-hour format (e.g. 15:56). time >= 13:00 (always pm)
     * Method signature: twentyFourToTwelve(String)
     * Returns a String detailing the time in 12-hour format (e.g. 3:56 pm).
     * Format of returned String: e.g. 3:56 pm
     * */
    public static String twentyFourToTwelve(String time) {
        String hour =  time.substring(0, 2);
        String minute = time.substring(3);
        int hourInt = parseInt(hour);
        hourInt = hourInt - 12;
        return hourInt + ":" + minute + " pm";

    }

    /** Method 6
     * Method name: distanceBetweenTwoPoints
     * Method return type: double
     * Method parameter: x1, y1, x2, y2 (the two coordinates on a 2D plane)
     * Method signature: distanceBetweenTwoPoints(int,int,int,int)
     * Returns the distance between two points */
    public static double distanceBetweenTwoPoints(int x1, int y1, int x2, int y2) {
        double distance = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
        distance = distance * 100;
        distance = Math.round(distance);
        distance = distance/100;
        return distance;
    }

    /** Method 7
     * Method name: fahrenheitToCelsius
     * Method return type: double
     * Method parameter: degrees fahrenheit
     * Method signature: fahrenheitToCelsius(int)
     * Returns the degrees celsius equivalent of the degrees in fahrenheit */
    public static double fahrenheitToCelsius(int fahrenheit) {
        double celsius = (fahrenheit - 32) * (5.0 / 9);
        celsius = celsius * 100;
        celsius = Math.round(celsius);
        celsius = celsius / 100;
        return celsius;

    }

    /** Method 8
     * Method name: celsiusToFahrenheit
     * Method return type: double
     * Method parameter: degrees celsius
     * Method signature: celsiusToFahrenheit(int)
     * Returns the degrees fahrenheit equivalent of the degrees in celsius */
    public static double celsiusToFahrenheit(int celsius) {
        double fahrenheit = ((9 * celsius) + 160) / 5.0;
        return fahrenheit;

    }

}