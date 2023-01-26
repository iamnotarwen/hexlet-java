package io.hexlet;
import org.apache.commons.lang3.StringUtils;
public class One {
    public static void main(String[] args) {
	String str = "Hexlet";
        String invert = StringUtils.reverse(str);
	System.out.println(invert);
    }
}
