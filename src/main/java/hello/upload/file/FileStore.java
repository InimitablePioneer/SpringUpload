package hello.upload.file;

import org.springframework.beans.factory.annotation.Value;

public class FileStore {

    @Value("${file.dir}")
    private String fileDir;

    public String getFullPath(String filename) {
        return fileDir + filename;
    }

    public List
}
