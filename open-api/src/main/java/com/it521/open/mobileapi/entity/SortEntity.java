package com.it521.open.mobileapi.entity;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortEntity {

    private long create_date;
    private int top_flag;

    public long getCreate_date() {
        return create_date;
    }

    public void setCreate_date(long create_date) {
        this.create_date = create_date;
    }

    public int getTop_flag() {
        return top_flag;
    }

    public void setTop_flag(int top_flag) {
        this.top_flag = top_flag;
    }


    // 对集合按照置顶标识进行排序
    public static void sortListByTopFlag(List<? extends SortEntity> list) {

        Collections.sort(list, new Comparator<SortEntity>() {

            public int compare(SortEntity x1, SortEntity x2) {
                if (x1.getTop_flag() < x2.getTop_flag()) {
                    return 1;
                }
                if (x1.getTop_flag() == x2.getTop_flag()) {
                    return 0;
                }
                return -1;
            }
        });
    }

    // 对集合按照时间进行排序
    public static void sortListByTime(List<? extends SortEntity> list) {

        Collections.sort(list, new Comparator<SortEntity>() {

            public int compare(SortEntity x1, SortEntity x2) {
                if (x1.getCreate_date() < x2.getCreate_date()) {
                    return 1;
                }
                if (x1.getCreate_date() == x2.getCreate_date()) {
                    return 0;
                }
                return -1;
            }
        });
    }
}
