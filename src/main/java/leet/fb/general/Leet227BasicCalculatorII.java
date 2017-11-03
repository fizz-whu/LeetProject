package leet.fb.general;
import java.util.*;
import java.lang.*;

public class Leet227BasicCalculatorII {

	public int calculate(String s) {
		int ret = 0, pre = 0, sgn = 1;
		char[] carr = s.toCharArray();

		for(int i = 0; i <= carr.length; ++i) {
			if(i != carr.length && carr[i] == ' ') {
				continue;
			}
			if(Character.isDigit(carr[i])) {
			} else {
			}
		}
	}

}
