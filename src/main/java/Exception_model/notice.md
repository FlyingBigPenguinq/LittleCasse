非正常情况分为两种Error 和 Exception
异常分为两类： Checked异常和Runtime异常
Checked异常是可以在编程阶段处理的异常
Runtime异常包括IndexOutOfBoundsException、 NullPointerException、ClassCastException

异常变量不能赋值因为有final修饰
捕捉异常使用
try{
    //业务
}catch（Exception e1| Exception e2）{
    catch可以有多个，写的时候小的异常在前，大异常在后，因为catch不会依次执行，执行一个就停了
}finally{
    finally里面不要写return 或者 throw等导致方法终止的语句，会出现奇怪的现象
}

自定义Exception的时候需要重写三个自定义的构造函数

注意不能使用try catch 代替控制语句; 发布的代码中尽量不适用printStackTrace()，调试的时候可以使用