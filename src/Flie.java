public class Flie {
    private final String fileName;
    private final String fileType;
    private final String filePath;

    public Flie(String fileName, String fileType, String filePath) {
        this.fileName = fileName;
        this.fileType = fileType;
        this.filePath = filePath;
    }

    String getFileName(){
        return fileName;
    }
    String getFileType(){
        return fileType;
    }
    String getFilePath(){
        return filePath;
    }
}
