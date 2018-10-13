package com.yn.module.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by xiaow on 2018/10/13.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CmsArticleData {

    private String id;
    private String content;
    private String copyfrom;
    private String relation;
    private String allowComment;
}
