package Stream_model.nio;

import java.nio.CharBuffer;

public class BufferTest {
    public static void main(String[] args) {
        CharBuffer buffer = CharBuffer.allocate(8);
        System.out.println(buffer.capacity());
        System.out.println(buffer.limit());
        System.out.println(buffer.position());
        buffer.put('a');
        buffer.put('b');
        buffer.put('c');
        System.out.println(buffer.position());
        buffer.flip();
        System.out.println(buffer.limit());
        System.out.println(buffer.get());
        System.out.println(buffer.position());
        buffer.clear();
        System.out.println(buffer.limit());
        System.out.println(buffer.get());
        System.out.println(buffer.position());
    }
}
