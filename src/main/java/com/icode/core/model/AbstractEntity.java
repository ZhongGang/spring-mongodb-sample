package com.icode.core.model;

import com.icode.core.shared.GuidGenerator;
import com.icode.core.shared.JodaTimeUtils;
import org.joda.time.DateTime;

/**
 * Created with IntelliJ IDEA.
 * User: ZhongGang
 * Date: 13-6-22
 * Time: 下午4:09
 */
public abstract class AbstractEntity {
    //    private Integer id;
//    private Integer version;
    private Boolean active = Boolean.TRUE;
    private String guid = GuidGenerator.generate();
    private DateTime createTime = JodaTimeUtils.now();
    private DateTime lastModifyTime = JodaTimeUtils.now();
}
