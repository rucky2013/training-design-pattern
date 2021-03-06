/**
 * 设计模式<br>
 * 学好设计模式，做一个优秀的软件工程师。<br>
 * 相关文档出自：http://zz563143188.iteye.com/blog/1847029 <br>
 * 具体resources文件夹中也有说明文件，可以参考。以后可能也会参考其他文档来补充说明<br>
 * 
 * <pre>
 * 一、设计模式分类
 * 总体来说设计模式分为三大类：
 * 创建型模式，共5种：工厂方法模式、抽象工厂模式、单例模式、建造者模式、原型模式
 * 结构型模式，共7种：适配器模式、装饰模式、代理模式、外观模式、桥接模式、组合模式、享元模式
 * 行为型模式，共11种：策略模式、模板方法模式、观察者模式、迭代子模式、责任链模式
 * 						命令模式、备忘录模式、状态模式、访问者模式、中介者模式、解释器模式。
 * </pre>
 * 
 * <pre>
 * 二、设计模式六大原则
 * 1、开闭原则（Open Close Principle）
 * 	开闭原则就是说对扩展开放，对修改关闭。在程序需要进行拓展的时候，不能去修改原有的代码，
 * 	实现一个热插拔的效果。所以一句话概括就是：为了程序的扩展性好，易于维护和升级。
 * 	想要达到这样的效果，我们需要使用接口和抽象类，后面的具体设计中我们会提到这点。
 * 
 * 2、里氏代换原则（Liskov Substitution Principle）
 * 	里氏代换原则面向对象设计的基本原则之一。里氏代换原则中说，任何基类可以出现的地方，子类一定可以出现。
 * 	LSP是继承复用的基石，只有当衍生类可以替换掉基类，软件单位的功能不受到影响时，基类才能真正的被复用，
 * 	而衍生类也能够在基类的基础上增加新的行为。里氏代换原则是对“开-闭”原则的补充。实现“开-闭”原则的关键步骤
 * 	就是抽象化。而基类与子类的继承关系基石抽象化的具体实现，所以里氏代换原则是对实现抽象化的具体步骤的规范。
 * 
 * 3、依赖倒转原则（Dependence Inversion Principle）
 * 	这个是开闭原则的基础，具体内容：针对接口编程，依赖于抽象而不是依赖具体。
 * 
 * 4、接口隔离原则（Interface Segregation Principle）
 * 	这个原则的意思是：使用多个隔离的接口，比使用单个接口要好。还是一个降低类之间的耦合度的意思。
 * 	从这里我们看出，其实设计模式就是一个软件的设计思想，从大型软件架构出发，为了升级和维护方便。所以上文中
 * 	多次出现：降低依赖，降低耦合。
 * 
 * 5、迪米特法则（最少知道原则）（Demeter Principle）
 * 	为什么叫最少知道原则，就是说：一个实体应当尽量少的与其他实体之间发生相互作用，使得系统功能
 * 	功能模块相对独立。
 * 
 * 6、合成复用原则（Composite Reuse Principle）
 * 	原则是尽量使用合成/耦合的方式，而不是使用继承。
 * </pre>
 * 
 * resources文件夹中有整体架构图，下述我们用代码和文档方式介绍Java中23种设计模式的概念，应用场景的情况，<br>
 * 并接合它们的特点及设计模式的原则进行分析。<br>
 * 
 * 原文地址：http://zz563143188.iteye.com/blog/1847029<br>
 * 感谢作者的总结这么好的文章。
 * 
 * 
 * 
 * @author percy
 *
 */
package com.shangpin.pattern;