package Stream_model.nio;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileLock;

public class FileLockTest {
    public static void main(String[] args) {
        try (
                var channel = new FileOutputStream("a.txt").getChannel();
                ){
            FileLock fileLock = channel.tryLock();
            Thread.sleep(1000);
            fileLock.release();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
