##### 抽象工厂模式
* 工厂方法模式是，每一个对象都有一个专门的工厂去创建；抽象工厂模式是，把一些固定关联的对象放在
一个工厂中去创建，这样可以减少工厂类的数量，便于工程的维护。

* 代码中开发皮肤的实例。有两套皮肤：Spring春天的，显示绿色的button和绿色的text field；还有一套
夏天的皮肤，显示蓝色的button和蓝色的text field。绿色的button和绿色的text field由一个SpringSkinFactory
创建，蓝色的button和蓝色的text field由一个SummerSkipFactory创建。