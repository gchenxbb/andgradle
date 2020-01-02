
先注释掉app模块以下引用

//classpath 'com.cx.plugin:plugin_module:1.0.3'//组名+库名+版本号
//apply plugin: 'plugin.mod'

在插件模块点击uploadArchives编译插件，生成repo文件夹，再打开上面引用。


1，任何一个 Gradle 构建都是由一个或多个 projects 组成，每个 project 包括许多可构建组成部分。例如每个project包含一个jar包。
在项目中，每一个build.gradle文件会转换成一个Project对象
Settings对象，每一个settings.gradle会转换成一个Settings对象

2，每个project有多个task组成，每个task代表一个构建原子操作，例如编译，打包。
构建脚本
运行gradle命令，从当前目录下寻找build.gradle文件来执行构建，android的as项目包含多个build.gradle文件,
如何执行
建立一个build.gradle文件，然后再该目录执行gradle –p build.gradle命令
执行入口都是build.gradle文件，可以apply引入其他的gradle后缀文件

3，项目构建时，有以下事情需要做
首先创建一个Settings类型实例，在settings.gradle文件中配置刚创建的Settings实例
通过Settings实例的配置创建项目层级结构的Project对象实例，
根据Project对象实例执行每一个Project对应的build.gradle脚本

4，gradle构建脚本三步
初始化，配置，执行，
初始化阶段决定哪些项目创建Project实例，本质是执行settings.gradle脚本,,settings.gradle脚本首先执行
配置阶段将project和task的关系确定，
执行阶段，执行一些task名的任务以及依赖的task

5，任务如果没有<<就是没有action的任务，这种在脚本初始化阶段
就会执被执行，无论执行什么任务，都会执行，否则要要命令gradle task才会执行

6，build.gradle文件中一直在写脚本，而不像maven一样，配置，配置，都是配置
每个build.gradle文件的内容，基本上是Groovy脚本，脚本使用了最简化的Groovy语法

7，Gradle是一个基于JVM的构建工具，Groovy代码可以和Java代码很好地结合，也能用于扩展现有代码。
