package it.lorenzobugiani.api.utils;

import java.io.IOException;
import java.nio.file.Path;

import org.apache.tika.Tika;
import org.apache.tika.mime.MimeTypes;

public class FileTypeDetector extends java.nio.file.spi.FileTypeDetector {

  private final Tika tika = new Tika();

  @Override
  public String probeContentType(Path path) throws IOException {
    String fileNameDetect = tika.detect(path.toString());
    if (!fileNameDetect.equals(MimeTypes.OCTET_STREAM)) {
      return fileNameDetect;
    }
    String fileContentDetect = tika.detect(path.toFile());
    if (!fileContentDetect.equals(MimeTypes.OCTET_STREAM)) {
      return fileContentDetect;
    }
    return null;
  }
}
