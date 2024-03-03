# SPIDemo（个人总结）

### 使用方式

新建一个接口类

![image-20240303214041628](D:\androidproject\git\SPIDemo\assets\image-20240303214041628.png)

再定义几个类继承这个接口![image-20240303215351339](D:\androidproject\git\SPIDemo\assets\image-20240303215351339.png)

如果你用@AutoService就不需要自己写MATE-INF文件，如果不用就在main目录下写好配置文件

![image-20240303215535273](D:\androidproject\git\SPIDemo\assets\image-20240303215535273.png)

![image-20240303215542093](D:\androidproject\git\SPIDemo\assets\image-20240303215542093.png)

之后使用ServiceLoader加载

![image-20240303215956197](D:\androidproject\git\SPIDemo\assets\image-20240303215956197.png)
