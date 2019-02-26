package com.scott.zookeeper.registry.zookeeper;

/**
 * Created by Huo on 2019/2/27.
 */
public interface ServiceRegistry {
    /**
     * 注册服务信息
     *
     * @param serviceName    服务名称
     * @param serviceAddress 服务地址
     */
    void register(String serviceName, String serviceAddress);

}
