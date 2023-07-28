package Seminar3;

import java.util.Comparator;

public class EmployeComparator implements Comparator<Employe> {

    private SortDirect sortDirect;

    public EmployeComparator(SortDirect sortDirect) {
        this.sortDirect = sortDirect;
    }

    @Override
    public int compare(Employe o1, Employe o2){
        int res = sortDirect == SortDirect.Ascending ? o1.getName().compareTo(o2.getName()):
            o2.getName().compareTo(o1.getName());
        if (res == 0) {
            return sortDirect == SortDirect.Descending ? Integer.compare(o1.getAge(), o2.getAge()):
                Integer.compare(o2.getAge(), o1.getAge());
        }
        return res;
    }
}
