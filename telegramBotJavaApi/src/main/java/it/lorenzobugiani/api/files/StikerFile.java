package it.lorenzobugiani.api.files;

import java.io.File;
import java.io.IOException;

import it.lorenzobugiani.api.exceptions.InvalidFileException;

public class StikerFile extends TelegramFile {

  private static final String WEBP_MIME_TYPE = "image/webp";

  public StikerFile(File file) throws InvalidFileException, IOException {
    super(file);
  }

  @Override
  protected boolean isValid() throws IOException {
    // String mimeType = new FileTypeDetector().probeContentType(this.file.toPath());
    // if (!WEBP_MIME_TYPE.equals(mimeType)) {
    // return false;
    // }
    return true;
  }

}


