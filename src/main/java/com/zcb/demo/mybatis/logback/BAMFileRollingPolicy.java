package com.zcb.demo.mybatis.logback;

import ch.qos.logback.core.rolling.SizeAndTimeBasedRollingPolicy;

/**
 * 符合日志规范的日志策略
 *
 * @author geng_pool
 * @create 2018-08-10-10:53
 **/
public class BAMFileRollingPolicy extends SizeAndTimeBasedRollingPolicy {
    @Override
    public String getActiveFileName() {
        if (this.getParentsRawFileProperty() != null) {
            return this.getParentsRawFileProperty();
        } else {
            String temp_filename = this.getTimeBasedFileNamingAndTriggeringPolicy()
                    .getCurrentPeriodsFileNameWithoutCompressionSuffix();
            return temp_filename.replaceAll("\\.0", "");
        }
    }
}
