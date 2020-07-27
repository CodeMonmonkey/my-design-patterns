##### 命令模式
* 命令模式就是通过一个Invoker去执行各种命令，命令1，命令2，然后命令里边制定了具体谁去执行这个任务，即receiver
* receiver是执行方，有一个doJob函数用来执行具体的任务的
* command是命令，在构造函数中引入receiver，command execute函数封装了receiver的doJob函数
* Invoker是最外层的相当于执行命令的按钮，可以在构造方法或者set函数中引入command

* 命令模式的优点  
（1）降低系统耦合度  
（2）容易加新命令
（3）可以比较容易地设计命令队列和宏命令（组合命令）  
（4）可以方便地实现对请求的Undo和Redo