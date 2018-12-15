在执行单个project里的gradle命令时
例如执行gradle tasks命令，搜集该工程的任务，加上apply plugin: 'com.android.application'后，就会出现android构建任务
注意必须要有AndroidManifest文件以及local.properties提供的SDK目录

重点注意，需要在root的gradle文件中加入classpath 'com.android.tools.build:gradle:3.0.0'才能apply plugin..

classpath 'com.android.tools.build:gradle:3.0.0'会去下载一些jar包，例如，builder-3.0.0，gradle-core-3.0.0等
存储在目录D:\Users\CHENGUANG491\.gradle\caches\modules-2\files-2.1\中


