package assignmentone;

import java.util.Comparator;

public class SizeComparator implements Comparator<HDTV> {

	public int compare(HDTV arg0, HDTV arg1) {
		// TODO Auto-generated method stub
		return (int) (arg0.size - arg1.size);
	}

}
