package com.test.singleton.logger;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Test {

	public static void main(String[] args) {
		String arr[] = { "6676", "27", "83", "373", "9990", "706", "58", "84", "63", "5", "7", "3830", "87", "259",
				"7254", "789", "2337", "01", "00", "7", "1730", "8", "4532", "08", "65", "1588", "4914", "103", "77",
				"08", "55", "023", "297", "658", "6351", "6546", "778", "2650", "9", "96", "3828", "2946", "1285", "08",
				"986", "281", "8", "5", "0", "830", "697", "5", "49", "2679", "5619", "49", "011", "5", "20", "841",
				"8", "470", "742", "5", "86", "4120", "6", "208", "60", "133", "779", "97", "1", "559", "6484", "252",
				"933", "93", "1594", "84", "51", "8", "314", "871", "8", "76", "5", "88", "8113", "1", "7787", "698",
				"161", "8", "532", "658", "3424", "819", "0", "3605", "8954", "43", "41", "414", "519", "69", "837",
				"04", "7985", "1685", "74", "04", "730", "912", "66", "5", "3994", "0863", "8358", "59", "972", "281",
				"3", "992", "48", "0710", "11", "1", "1916", "1", "34", "0", "4428", "0", "0583", "022", "99", "44",
				"141", "648", "4658", "9090", "0828", "402", "25", "2621", "1636", "7266", "16", "2", "297", "374",
				"6344", "78", "0", "40", "816", "2170", "3", "872", "399", "82", "9966", "0251", "3109", "1", "26",
				"192", "22", "47", "4782", "99", "591", "668", "67", "40", "2", "7125", "2", "9914", "26", "1759",
				"0090", "4128", "8168", "43", "086", "8", "423", "038", "81", "1", "75", "008", "6766", "27", "9", "5",
				"0", "9", "782", "136", "7", "781", "58", "85", "6", "673", "841", "4", "316", "24", "68", "4995", "55",
				"101", "5032", "3053", "4", "185", "528", "4847", "8", "96", "2960", "97", "8974", "6632", "211",
				"4885", "9660", "7467", "569", "34", "7", "7568", "8342", "2", "252", "4497", "04", "2", "1967", "01",
				"3", "1922", "54", "4203", "1", "495", "141", "2885", "0547", "05", "21", "3284", "531", "881", "7",
				"570", "0", "34", "9", "3532", "950", "2327", "22", "48", "1022", "050", "1", "6", "4", "472", "4788",
				"81", "11", "97", "5", "75", "427", "80", "8", "28", "1", "8", "41", "2181", "19", "90", "58", "3",
				"288", "3503", "0176", "7566", "3733", "14", "529", "9324", "749", "12", "5", "3", "309", "92", "154",
				"97", "16", "6", "2", "43", "9", "9", "7", "5", "2", "42", "932", "0988", "2263", "9", "6", "280", "21",
				"00", "7460", "449", "89", "9923", "4335", "435", "41", "84", "4", "2", "4482", "43", "258", "71",
				"177", "480", "01", "7", "18", "753", "1625", "15", "0", "9561", "818", "795", "04", "4", "50", "6",
				"468", "893", "80", "190", "81", "264", "8719", "553", "5862", "264", "96", "9", "482", "8698", "1",
				"14", "2", "313", "66", "5537", "613", "94", "4", "918", "0", "5521", "0494", "4924", "4839", "4",
				"5522", "0", "6096", "7867", "49", "265", "343", "16", "8234", "7753", "9576", "4876", "8", "431",
				"637", "3181", "6368", "8", "1", "4277", "4124", "830", "1", "5", "7791", "64", "355" };
//		printLargest(arr.length, arr);
		search("aaabc", "aaaabcdf");
	}
	
	public static ArrayList<Integer> search(String pattern, String text)
	{
		// Compute pattern hashValue
		int patternHashValue = 0;
		for (int i = 0; i < pattern.length(); i++) {
			patternHashValue += (int) pattern.charAt(i);
		}
		int currentHashValue = 0;
		ArrayList<Integer> ans = new ArrayList<>();
		for (int i = 0; i < text.length(); i++) {
			if (i < pattern.length()) {
				currentHashValue += (int) text.charAt(i);
				if (i == pattern.length() - 1 && currentHashValue == patternHashValue) {
					Boolean match = Boolean.TRUE;
					for (int j = i - pattern.length() + 1, k = 0; k < pattern.length(); j++, k++) {
						if (pattern.charAt(k) != text.charAt(j)) {
							match = Boolean.FALSE;
							break;
						}
					}

					if (match) {
						ans.add(i + 1 - (pattern.length() - 1));
					}
				}
			} else {
				currentHashValue -= (int) text.charAt(i - pattern.length());
				currentHashValue += (int) text.charAt(i);
				if (currentHashValue == patternHashValue) {
					Boolean match = Boolean.TRUE;
					for (int j = i - pattern.length() + 1, k = 0; k < pattern.length(); j++, k++) {
						if (pattern.charAt(k) != text.charAt(j)) {
							match = Boolean.FALSE;
							break;
						}
					}

					if (match) {
						ans.add(i + 1 - (pattern.length() - 1));
					}
				}
			}
		}
		return ans;

	}

	
	public static String printLargest(int n, String[] arr) {
		// code here
		Arrays.sort(arr, new Comparator<String>() {
			@Override
			public int compare(String a, String b) {
				int aL = a.length();
				int bL = b.length();
				int aIndex = 0;
				int bIndex = 0;
				for (int i = 0; i < Math.max(aL, bL); i++) {

					if (i < aL) {
						aIndex = Character.getNumericValue(a.charAt(i));
					}

					if (i < bL) {
						bIndex = Character.getNumericValue(b.charAt(i));
					}
					if (aIndex < bIndex) {
						return 1;
					} else if (aIndex > bIndex) {
						return -1;
					}
				}
				return 0;
			}
		});
		return String.join("", arr);
	}
}
