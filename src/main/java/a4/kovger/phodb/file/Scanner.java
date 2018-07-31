package a4.kovger.phodb.file;

import a4.kovger.phodb.db.PhoDB;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Scanner {

    private List<Path> roots = new ArrayList<>();

    private PhoDB db;

    public void addRoot(Path r) {
        if (!roots.contains(r)) roots.add(r);
    }

    public void scan() {

    }

    private void scanRoot() {

    }

}
