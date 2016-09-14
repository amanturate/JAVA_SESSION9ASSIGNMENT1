package assignmentone;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class HDTVMain {

	public static void main(String[] args) {

		HDTV hd1 = new HDTV("onida", 52);
		HDTV hd2 = new HDTV("samsung", 55);
		HDTV hd3 = new HDTV("sony", 32);

		SizeComparator sc = new SizeComparator();
		ArrayList<HDTV> information = new ArrayList<HDTV>();

		information.add(hd1);
		information.add(hd2);
		information.add(hd3);
		Collections.sort(information, sc);

		Iterator iter = information.iterator();
		while (iter.hasNext()) {
			HDTV str = (HDTV) iter.next();
			System.out.println(str);
		}

	}

}
