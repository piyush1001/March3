package pack1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.regex.Pattern;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class T2 {


	public static void main(String[] args){
		
		String s1="welcome to india";
		
		Pattern pattern =Pattern.compile("\\s");
		String[] temp = pattern.split(s1);
		
		String result ="";
		
		for(int i=0;i<temp.length;i++){
			if(i==temp.length-1){
				result=temp[i]+result;
			}
			else{
				result=" "+temp[i]+result;
			}
		}
		System.out.println(result);
	}
}
