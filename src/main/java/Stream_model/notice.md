java中的流可以分为 字节流、字符流
字节流主要使用InputStream\OutputStream 字符流主要使用Reader\Writer
按照流的角色来分主要分为节点流（低级流）、处理流（高级流）   注意：java提供字节流向字符流的转换，但是没有字符流向字节流的转换
Java流有四十多个类，都是从上面四个抽象类派生出来的

处理流的用法:处理流就是把节点流封装起来
PrintStream就是典型的处理流，PrintStream超级好用

推回输入流：PushbackInputStream，PushbackReader
这两个类实现了unread()方法 可以将一定的内容退回到 类内的缓冲区，顺便说一句使用使用这个方法的时候需要指定缓冲区大小

重定向输入输出流
在System里通过Sys特码。setErr() setIn setOut 可以把错误和输入输出重定向

java虚拟机读取其他进程的数据
Process p = Runtime.getRuntime().exec("javac");
var b = new BufferedReader(new InputStreamReader(p.getInputStream()))
var ps = new PrintStream(p.getOutputStream())

RandomAccessFile是java输入/输出中功能最丰富的类，它可以直接定位指针位置。是访问文件局部不二之选

序列化：实现Serialize 或者 Externalizable
实现Serialize的时候别忘了添加id，
Externalizable主要是自定义的序列化操作

NIO：
channel：对传统输入输出系统的模拟，channel提供了一个map()方法，map可以将一块数据映射到内存里
buffer：这是一个容器，本质上是一个数组，发送到channel里的数据都要先经过buffer
charset：字符集
Selector：支持非阻塞输入输出
nio 是先通过Channel读取文件到内存，但是程序不能直接对接channel，必须通过buffer来对channel操作

文件锁 FileLock   可以通过channel.tryLock()获得锁 而且是排他锁