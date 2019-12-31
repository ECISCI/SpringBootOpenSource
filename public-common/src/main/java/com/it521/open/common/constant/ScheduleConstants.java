package com.it521.open.common.constant;

/**
 * @author X
 * @描述.任务调度通用常量
 */
public interface ScheduleConstants {
    String TASK_CLASS_NAME = "TASK_CLASS_NAME";

    String TASK_PROPERTIES = "TASK_PROPERTIES";

    /**
     * @描述.默认
     */
    String MISFIRE_DEFAULT = "0";

    /**
     * @描述.立即触发执行
     */
    String MISFIRE_IGNORE_MISFIRES = "1";

    /**
     * @描述.触发一次执行
     */
    String MISFIRE_FIRE_AND_PROCEED = "2";

    /**
     * @描述.不触发立即执行
     */
    String MISFIRE_DO_NOTHING = "3";

    enum Status {
        /**
         * @描述.正常
         */
        NORMAL("0"),
        /**
         * @描述.暂停
         */
        PAUSE("1");

        private String value;

        Status(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }
}
