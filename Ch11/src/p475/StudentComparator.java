package p475;

import java.util.Comparator;

import p475.CompareExample.Student;

class StudentComparator implements Comparator<Student> {

	@Override
	public int compare(Student a, Student b) {
		if(a.sno<b.sno) return -1;
		else if(a.sno == b.sno) return 0;
		else return 1;
	}

}
