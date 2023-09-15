package com.DSA;

public class TextPatternMatcher {
	public static void main(String[] args) {
		String text = "   This is a sample text with patterns! like ABC-123 and XYZ-456.   ";
        
		String stripLeadingText = text.stripLeading();
		String stripTrailingText = text.stripTrailing();
		String stripIndentText = text.stripIndent();

		System.out.println("Strip Leading:" + stripLeadingText);
		System.out.println("Strip Trailing:" + stripTrailingText);
		System.out.println("Strip Indent:" + stripIndentText);
		// Define a pattern to search for (e.g., "ABC-123")
		String pattern = "ABC-123";

		int index = text.indexOf(pattern);
		System.out.println("used of char At index:" + text.charAt(index));
		System.out.println("used of char At index + pattern length:" + text.charAt(1));
		System.out.println(pattern.length());
		System.out.println("index:" + index);
		if (index != -1) {
			// Pattern found, extract it
			String extractedPattern = text.substring(index, index + pattern.length());
			System.out.println("Found pattern: " + extractedPattern);
		} else {
			System.out.println("Pattern not found.");
		}
	}
}
