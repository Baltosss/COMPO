package compo;

/**
 * Created by Ferrand on 02/02/2015.
 */
public class ChattyPointer<T extends IChatty> {
    private T m_data;

    public T data() {
        return this.m_data;
    }

    public void define(T data) {
        this.m_data = data;
    }
}
