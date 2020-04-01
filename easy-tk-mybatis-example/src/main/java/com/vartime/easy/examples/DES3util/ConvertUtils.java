package com.vartime.easy.examples.DES3util;

/**
 *
 * @ClassName: ConvertUtils
 * @Description: 格式转化工具类
 *
 */
public abstract class ConvertUtils {

	public static String toHex(byte input[]) {
		if (input == null)
			return null;
		StringBuffer output = new StringBuffer(input.length * 2);
		for (int i = 0; i < input.length; i++) {
			int current = input[i] & 0xff;
			if (current < 16)
				output.append("0");
			output.append(Integer.toString(current, 16));
		}

		return output.toString();
	}
}
