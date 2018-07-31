package a4.kovger.phodb.db;

import a4.kovger.phodb.db.search.Criteria;

import java.util.List;

public interface PhoDB {

    void add(MetaEntity me);

    List<MetaEntity> search(Criteria c);

}
