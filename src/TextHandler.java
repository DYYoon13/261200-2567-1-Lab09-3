public class TextHandler implements Handler{

    private Handler nextHandler;
    private String name;

    public TextHandler(String name){
        this.name = name;
    }

    @Override
    public void process(Flie file) {
        if (file.getFileType().equals("text")) {
            System.out.println("Process image file by " + getName());
        } else if (nextHandler != null) {
            System.out.println(name + " forwards request to " + nextHandler.getName());
            nextHandler.process(file);
        } else
            System.out.println("File not supported");
    }

    @Override
    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public String getName() {
        return this.name;
    }

}
