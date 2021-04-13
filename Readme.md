#### 使用pom依赖控制是dubbo远程调用还是本地调用（非injvm调用，不走dubbo），方便系统弹性伸缩
* 使用@WjkReference衍生@DubboRefrence和@Autowire，并代替
    * 由于Dubbo的ReferenceAnnotationBeanPostProcessor会在spring的AutowiredAnnotationBeanPostProcessor之前工作，所以在启用dubbo的时候
    ，@Autowire不会覆盖@DubboReference注入，也不会由于IOC中没有实现而报错
* 使用@WjkService衍生@DubboService和@Service，并代替
* 将provider的具体实现和springboot启动类分离，使consumer只依赖provider实现，同时要可以扫描到provider路径
* 本地调用——————在consumer中引入provider具体实现的依赖，排除dubbo的autoConfiguration依赖
* dubbo远程调用——————在consumer中引入autoConfiguration依赖，排除provider具体实现的依赖
