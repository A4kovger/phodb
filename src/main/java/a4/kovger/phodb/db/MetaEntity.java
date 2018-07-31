package a4.kovger.phodb.db;

import a4.kovger.commons.file.FileUtils;
import com.drew.imaging.ImageMetadataReader;
import com.drew.imaging.ImageProcessingException;
import com.drew.metadata.Metadata;

import java.io.IOException;
import java.nio.file.Path;

public class MetaEntity {

    public static MetaEntity buildMetaInfo(Path file) throws ImageProcessingException, IOException {
        MetaEntity me = new MetaEntity();
        me.exif = ImageMetadataReader.readMetadata(file.toFile());
        me.name = FileUtils.getFileName(file);
        me.path = file;
        return me;
    }

    private MetaEntity() {}

    private String name;
    private Path path;

    private Metadata exif;

    public String getName() {
        return name;
    }

    public Path getPath() {
        return path;
    }

    public Metadata getExif() {
        return exif;
    }
}
