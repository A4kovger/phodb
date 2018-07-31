package a4.kovger.phodb.db.search;

import a4.kovger.phodb.db.MetaEntity;

import java.util.Date;

public class DateFilter implements Filter {

    enum Type {
        BEFORE{
            public boolean apply(DateFilter f) {
                return f.date1.before(f.theDate);
            }
        }, AFTER {
            public boolean apply(DateFilter f) {
                return f.date1.after(f.theDate);
            }
        }, AT {
            public boolean apply(DateFilter f) {
                return f.date1.equals(f.theDate);
            }
        }, BETWEEN {
            public boolean apply(DateFilter f) {
                return f.date1.before(f.theDate) && f.date2.after(f.theDate);
            }
        }
    }

    private Date date1, date2, theDate;

    public static DateFilter before(Date date1) {
        DateFilter df = new DateFilter(Type.BEFORE);
        df.date1 = date1;
        return df;
    }

    public static DateFilter after(Date date1) {
        DateFilter df = new DateFilter(Type.AFTER);
        df.date1 = date1;
        return df;
    }

    private Type type;
    private DateFilter(Type type) {
        this.type = type;
    }

    public void setDate1(Date date1) {
        this.date1 = date1;
    }

    public void setDate2(Date date2) {
        this.date2 = date2;
    }

    @Override
    public boolean filter(MetaEntity me) {

        return false;
    }

}
