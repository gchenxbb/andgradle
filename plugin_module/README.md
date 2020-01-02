模块：plugin_module，定义一个插件类

1，src目录，groovy文件

2，resource/META-INF.gradle-plugins/plugin.mod.properties文件

3，plugin.mod.properties文件，保存类的全限定名
文件名，.properties前面部分。代表引入的插件名，即apply plugin: 'plugin.mod'

4，定义group和version，
外部依赖：com.cx.plugin:plugin_module:，
组名+模块名+版本

5，生成的repo目录是：com/cx/plugin/plugin_module/xxx/。

6，uploadArchives，会触发编译插件类，生成build目录下，class和jar文件。

