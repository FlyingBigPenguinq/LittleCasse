package Stream_model.nio;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;

public class FileChannelTest {
    public static void main(String[] args) {
        File file = new File("test.txt");
        try(
                var inChannel = new FileInputStream(file).getChannel();

                var outChannel = new FileOutputStream("out.txt").getChannel();
                ){
            //把数据映射成MappedByteBuffer
            MappedByteBuffer buffer = inChannel.map(FileChannel.MapMode.READ_ONLY, 0, file.length());
            //使用GBK当字符集
            Charset charset = Charset.forName("GBK");
            outChannel.write(buffer);
            buffer.clear();
            CharsetDecoder decoder = charset.newDecoder();
            //bytebuffer 换成 CharBuffer
            CharBuffer charBuffer = decoder.decode(buffer);
            System.out.println(charBuffer);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readFile(){
        try (
                var fis = new FileInputStream("test.txt");

                FileChannel fcn = fis.getChannel();
                ){
            ByteBuffer byteBuffer = ByteBuffer.allocate(256);
            while (fcn.read(byteBuffer) != -1){
                byteBuffer.flip();
                Charset charset = Charset.forName("GBK");
                CharsetDecoder decoder = charset.newDecoder();
                CharBuffer charBuffer = decoder.decode(byteBuffer);
                System.out.println(charBuffer);
                byteBuffer.clear();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
