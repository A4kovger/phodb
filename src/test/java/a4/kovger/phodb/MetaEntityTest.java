package a4.kovger.phodb;

import a4.kovger.phodb.db.MetaEntity;
import com.drew.imaging.ImageProcessingException;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class MetaEntityTest {

    @Test
    public void test() {
        try {
            Path p = Paths.get(ClassLoader.getSystemResource("DSC_7938_600.jpg").toURI());
            MetaEntity me = MetaEntity.buildMetaInfo(p);
            me.getExif().getDirectories().
                    forEach(d -> d.getTags().
                            stream().filter(t ->
                                t.getDescription() != null && t.getDescription().contains("Date/Time Original")).
                            forEach(System.out::println));
        } catch (URISyntaxException | IOException | ImageProcessingException e) {
            e.printStackTrace();
        }
    }

}
