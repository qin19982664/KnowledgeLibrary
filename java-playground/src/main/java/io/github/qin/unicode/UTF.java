package io.github.qin.unicode;

import java.nio.charset.StandardCharsets;

/**
 * 展示 BMP字符 U+0000 ~ U+FFFF 与 辅助平面字符 U+10000 ~ U+10FFFF 的声明与存储细节
 */
public class UTF {

    /**
     * 
     * 此函数用于显示单个Unicode字符在UTF-16BE模式下的底层字节存储
     * 
     * 注意:
     * 1.x86平台存储模式一般为 UTF-16BE(Big Endian)
     * 2.Java的 byte类型 为 signed byte, 即有符号整型
     * 3.Integer.toBinaryString(int i) 会将 byte 提升为 signed int
     */
    private static void showBinary(String str) {
        // 按大端序，获取字符的底层字节数组
        byte[] bytes = str.getBytes(StandardCharsets.UTF_16BE);

        for (byte b : bytes) {
            // Interger.toBinaryString(int i) 会将 byte 提升为 signed int
            // 通过 &0xFF 位运算, 将 int 截断为8位,
            String binary = Integer.toBinaryString(b & 0xFF);
            // 将二进制补全到8位
            binary = String.format("%8s", binary).replace(' ', '0');
            // 输出处理好的二进制字符串
            System.out.print(binary + " ");
        }
        // 换行
        System.out.println();
    }

    public static void main(String[] args) {
        // BMP字符 U+0000 ~ U+FFFF
        char ASCII = 'A'; // U+0041 65D
        char chinese = '汉'; // U+6C49
        char greek = '\u03A9'; // Ω

        // 辅助平面字符 U+10000 ~ U+10FFFF
        String emoji = "😀"; // U+1F600
        String musicalSymbol = "\uD834\uDD1E"; // U+1D11E

        // 输出字符
        System.out.println("BMP字符 U+0000 ~ U+FFFF:");
        System.out.println("ASCII: " + ASCII);
        System.out.println("chinese: " + chinese);
        System.out.println("greek: " + greek);

        System.out.println("辅助平面字符 U+10000 ~ U+10FFFF:");
        System.out.println("emoji: " + emoji);
        System.out.println("musicalSymbol: " + musicalSymbol);

        // 获取码点
        int codePointOfASCII = (int) ASCII;
        int codePointOfChinese = (int) chinese;
        int codePointOfGreek = (int) greek;
        int codePointOfEmoji = (int) emoji.codePointAt(0);
        int codePointOfMusicalSymbol = (int) musicalSymbol.codePointAt(0);

        // 输出十进制码点
        System.out.println("对应十进制码点：");
        System.out.println("decimal code point of 'A':\t\t" + codePointOfASCII);
        System.out.println("decimal code point of '汉':\t\t" + codePointOfChinese);
        System.out.println("decimal code point of '\\u03A9'\t\t" + codePointOfGreek);
        System.out.println("decimal code point of '😀':\t\t" + codePointOfEmoji);
        System.out.println("decimal code point of '\\uD834\\uDD1E':\t" + codePointOfMusicalSymbol);

        // 输出对应十六进制字符串
        System.out.println("对应十六进制：");
        System.out.println("hexadecimal code point of 'A':\t\t U+" + Integer.toHexString(codePointOfASCII));
        System.out.println("hexadecimal point of '汉':\t\t U+" + Integer.toHexString(codePointOfChinese));
        System.out.println("hexadecimal point of '\\u03A9':\t\t U+" + Integer.toHexString(codePointOfGreek));
        System.out.println("hexadecimal point of '😀':\t\t U+" + Integer.toHexString(codePointOfEmoji));
        System.out
                .println("hexadecimal point of '\\uD834\\uDD1E':\t U+" + Integer.toHexString(codePointOfMusicalSymbol));

        // 输出二进制字节
        System.out.println("底层存储字节(UTF-16): ");
        System.out.print("ASCII: \t\t");
        showBinary(Character.toString(ASCII));

        System.out.print("chinese: \t");
        showBinary(Character.toString(chinese));

        System.out.print("greek: \t\t");
        showBinary(Character.toString(greek));

        System.out.print("emoji: \t\t");
        showBinary(emoji);

        System.out.print("musicalSymbol: \t");
        showBinary(musicalSymbol);
    }
}
