/**
 * Created by Şeyma Yılmaz on 5.6.2017.
 */
public class A {

    public enum MessageType{
        ERROR,

        SUCCESS
    }

    public interface Click {

        void click();

        void doubleClick();
    }

    private class B{

    }
    
    public void sayHello(){
        B b1 = new B();
    }
}
