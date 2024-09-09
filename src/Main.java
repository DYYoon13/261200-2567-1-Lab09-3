public class Main {
    public static void main(String[] args) {
        Flie file = null;
        Handler textHandler = new TextHandler("Text Handler");
        Handler imageHandler = new ImageHandler("Image Handler");
        Handler docHandler = new DocHandler("Document Handler");
        textHandler.setNextHandler(docHandler); // chain starts here!
        docHandler.setNextHandler(imageHandler);
        file = new Flie("OOP.txt", "text", "C:/OOP");
        textHandler.process(file);
        file = new Flie("keygen.doc", "doc", "C:/windows");
        textHandler.process(file);
        file = new Flie("HelloWorld.jpg", "image", "C:");
        textHandler.process(file);
    }
}