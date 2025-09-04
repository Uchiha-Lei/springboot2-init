package com.xulei.yuntobackend.common;

import lombok.Data;

import java.io.Serializable;

/**
 * 用于通用的删除请求
 */
@Data
public class DeleteRequest implements Serializable {

    /**
     * id
     */
    private Long id;

    private static final long serialVersionUID = 1L;
}
