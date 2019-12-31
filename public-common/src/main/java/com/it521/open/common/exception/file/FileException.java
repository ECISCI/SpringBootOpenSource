package com.it521.open.common.exception.file;

import com.it521.open.common.exception.base.BaseException;

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
