##### 简单工厂模式（静态工厂方法 Static Factory Method）  

* 在Impl和Client之间再添加Factory层，通过静态的creat方法来创建类，而不是 new Impl()，
隐藏Impl的实现细节

* 缺点  
（1）缺点只有一个工厂，所有类的创建都放在一个类中，增加新的产品，工厂类都要被修改