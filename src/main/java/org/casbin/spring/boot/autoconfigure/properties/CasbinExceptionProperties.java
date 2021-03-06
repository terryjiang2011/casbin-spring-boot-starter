package org.casbin.spring.boot.autoconfigure.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author fangzhengjin
 * @version V1.0
 * @title: CasbinExceptionProperties
 * @package org.casbin.spring.boot.autoconfigure.properties
 * @description: 异常设置
 * @date 2019/9/24 15:25
 */
@ConfigurationProperties("casbin.exception")
public class CasbinExceptionProperties {

    /**
     * 删除策略失败时是否抛出异常
     */
    private boolean removePolicyFailed = false;

    public boolean isRemovePolicyFailed() {
        return removePolicyFailed;
    }

    public void setRemovePolicyFailed(boolean removePolicyFailed) {
        this.removePolicyFailed = removePolicyFailed;
    }
}

