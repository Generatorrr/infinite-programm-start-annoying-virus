/**
 * TODO: write a brief summary fragment.
 * <p>
 * TODO: write a detailed description.
 * <p>
 * Created on 12/20/18.
 * <p>
 * @author Vlad Martinkov
 */
public class Opened
{

    public static void main(String[] args)
    {
        
        Exited exited = new Exited();
        
        Runtime runtime = Runtime.getRuntime();
        Process process = null;
        
        try
        {
            while (true) {
                process = runtime.exec("/home/vmartinkov/Programs/avocode-2.21.0-linux/avocode");
                process.waitFor();
            }
        } catch (Exception e) {
            System.out.println("Exception during open avocode");
        }
    }
}
