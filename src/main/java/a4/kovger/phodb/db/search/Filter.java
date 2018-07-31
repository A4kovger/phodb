package a4.kovger.phodb.db.search;

import a4.kovger.phodb.db.MetaEntity;

public interface Filter {

    boolean filter(MetaEntity me);

}
