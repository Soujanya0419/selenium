package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {
        System.out.println("This is my first test");
        System.out.println("Hello world!");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com");
        System.out.println("Driver launched...");
        driver.close();
        System.out.println("Test completed");
        System.out.println("I will do more commits");
        System.out.println("logout completed commit 1");
    }
}