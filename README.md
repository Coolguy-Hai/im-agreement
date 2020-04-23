# im-agreement
这是即时通讯系统中客户端和服务端用于通信的协议包
## 1. 部分目录结构（尚未完成）
```
├─src
│  ├─main
│  │  └─java
│  │      └─org
│  │          └─im
│  │              └─agreement
│  │                  ├─codec
│  │                  ├─protocol
│  │                  │  ├─login
│  │                  │  │  └─infoObject
│  │                  │  └─register
│  │                  └─util
└─target
    ├─**.jar
```
## 2. 使用方法
1. 创建maven项目，在pom文件中添加依赖项。
```
    <dependency>
      <groupId>org.im</groupId>
      <artifactId>agreement</artifactId>
      <version>1.0-SNAPSHOT</version>
    </dependency>
```
2. 在自己的maven项目中的src同级目录下创建lib文件夹，同时将本项目target目录中的jar包导入。
3. 通过pipeline.addLast(new Decoder())、pipeline.addLast(new Encoder())方法添加编码解码器，其中Decoder()放在第一位、Encoder()放在最后。
## 3. 第一次提交——完成序列化工具、登录部分
### 3.1 Decoder()/Encoder()
编码解码器，可根据字节码中的command数值将字节码转化为特定的对象，供后面的handler使用。
### 3.2 Login部分协议
登录部分通信的数据分为两类，LoginRequest和LoginResponse。
1. LoginRequest包括userId、userPassword，用于向服务器发送登录请求。
1. LoginResponse包括userInfos(List<userInfo>)、groupInfos(List<groupInfo>)、success(boolean)，分别用来向用户发送用户的好友列表、用户的群组列表、登录状态-即是否登录成功。
