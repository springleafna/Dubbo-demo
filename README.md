这是一个dubbo的快速使用
使用了Nacos注册中心

dubbo的服务接口有多个实现时，如何注册和调用？
配置不同的group或version即可
@DubboService(version = "1.0", group = "A")
@DubboService(version = "1.0", group = "B")

@DubboReference(version = "1.0", group = "A")
