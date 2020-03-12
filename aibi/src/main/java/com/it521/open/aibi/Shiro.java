package com.it521.open.aibi;

/**
 * @author 玛丽莲梦明
 */
public class Shiro {

    /**
     * @1.什么是Shiro
     */
    /*
     * Shiro是一个Java安全框架,执行身份验证,授权,密码,会话管理Shiro是Apache的一个开源项目
     */

    /**
     * @2.Shiro的核心概念有三个
     */
    /*
     * 1.Subject  2.SecurityManager 3.Realms
     */
    /**
     * @2.1Subject
     */
    /*
     * Subject被Shiro描述为一个主体,对于Web应用来说,可以简单的理解为用户
     *
     * #### Shiro设计的重要理念,既以主体为展开的安全体系构建
     *
     * 在当前应用程序中,我们可以在任何地方获取当前操作的用户主体:
     *
     * Subject currentUser = SecurityUtils.getSubject();
     *
     * 获得Subject,通过这个对象,我们可以对其进行绝大多数安全操作:登录 登出 访问回话 执行授权检查
     *
     * Shiro的 api非常直观,它反映了开发者以每个用户思考安全控制的自然趋势
     */
    /**
     * @2.2SecurutyManager
     */
    /*
     * Subject的幕后推手是SecurityManager Subject代表了当前用户的安全操作
     *
     * SecurityManager则管理所有用户的安全操作
     *
     * SecurityManager是Shiro框架的核心,充当保护伞,引用了多个内部嵌套安全组件,它们形成了对象图
     *
     * 但是一旦SecurityManager及其内部对象配置好,它就会退居幕后
     *
     * 开发人员几乎把他们的所有时间都花在 Subject api 调用上
     */
    /**
     * @2.3Realm
     */
    /*
     * Realm充当了Shiro与应用安全数据间的"桥梁"或"连接器"
     *
     * 当切实与像用户账户这类安全相关的数据进行交互,执行认证(登录)和授权访问(访问控住)
     *
     * Shiro会从应用配置的Realm中查找到很多内容
     *
     * 从某种意义上讲 Realm实际上就是一个安全相关的dao,它封装了数据源的连接细节,
     *
     * 并在需要的时候将相关数据提供给Shiro
     *
     * ##### 在配置Shiro时,必须指定至少一个Realm可以配置多个
     *
     * Shiro内置类一些Realm,支持多种数据源的连接,如Jdbc ldap ini文件连接
     *
     * 可以自定义Realm适应各种应用场景
     */

    /**
     * @3.典型的安全场景概述
     */
    /*
     * 应用安全的四要素 1.认证 2.授权 3.会话管理 4.加密
     */

    /**
     * @3.1认证
     */
    /*
     * 三步骤
     *
     * 1.收集用户身份信息 成为当事人,以及身份的支持证明成为证书
     *
     * 2.将当事人和证书提交给系统
     *
     * 3.如果提交的证书与系统期望的该用户身份(当事人)匹配,该用户被认为是经过,反之未经过认证
     */
    /**
     * @3.2授权
     */
    /*
     * 授权实质上就是访问控制,控制已认证的用户能够访问应用的哪些内容,如资源,页面等
     *
     * 多数用户执行访问时通过角色+权限的概念来完成的
     */

    /**
     * @3.3会话管理
     */
    /*
     * 在以往的Servlet应用中,我们最常用的会话对象就是 HttpSession对象
     *
     * 在Shiro中也有属于自己的会话管理机制和用户会话对象
     *
     * Shiro允许开发者在任何应用或框架层一致地使用Session api
     *
     * ##### Shiro会话最重要的一个好处或许就是它们是独立于容器的
     *
     * 这个特性的作用非常巨大,设想一下会话集群,对集群会话来讲,支持容错和故障转移有多少种
     *
     * 容器特定的方式？ tomcat的方式与Jetty的不同,而Jetty又和Websphere不一样等等
     *
     * 但通过Shiro会话,你可以获得一个容器无关的集群解决方案
     *
     * ##### Shiro的架构允许可插拔的会话数据存储,如企业缓存,关系数据库,NoSql系统等
     *
     * 这意味着 只要配置会话集群一次,它会以相同的方式工作,跟部署环境无关 Tomcat Jetty Jee
     *
     * 服务器或独立应用,不管如何部署应用,无需重新配置应用
     *
     * 获取当前Session对象
     *
     * Session session =subject.getSession();
     *
     * Session session = subject.getSession(boolean create);
     */


}
