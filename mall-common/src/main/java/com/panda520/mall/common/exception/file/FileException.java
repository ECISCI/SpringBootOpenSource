package com.panda520.mall.common.exception.file;

import com.panda520.mall.common.exception.base.BaseException;

/**
 *  @描述.文件信息异常类
 *
 * @author X
 */
public class FileException extends BaseException {
    private static final long serialVersionUID = 1L;

    public FileException(String code, Object[] args) {
        super("file", code, args, null);
    }

}
