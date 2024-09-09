import java.io.File;

public interface Handler {

    public void process(Flie file);
    public void setNextHandler(Handler nextHandler);
    public String getName();

}
