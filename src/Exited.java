/**
 * TODO: write a brief summary fragment.
 * <p>
 * TODO: write a detailed description.
 * <p>
 * Created on 12/20/18.
 * <p>
 * @author Vlad Martinkov
 */
public class Exited extends Thread
{

    @Override
    public void run()
    {
        super.run();
        try
        {
            Runtime.getRuntime().exec("/home/vmartinkov/Programs/avocode-2.21.0-linux/avocode");
        } catch (Exception e) {
            System.out.println("Exception during open avocode");
        }
    }

    public static void main(String[] args)
    {
        System.out.println("ZDAROVA!!!");
    }
}
