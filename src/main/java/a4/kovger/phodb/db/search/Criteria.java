package a4.kovger.phodb.db.search;

import a4.kovger.phodb.db.MetaEntity;

import java.util.ArrayList;
import java.util.List;

public class Criteria {

    private List<Filter> cs = new ArrayList<>();

    public boolean filter(MetaEntity me) {
        for (Filter c : cs) if (!c.filter(me)) return false;
        return true;
    }

}
