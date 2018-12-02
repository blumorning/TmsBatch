package com.dmp.tms.tmsbatch.member;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class MemberVo {
    private String mId;
    private String mName;
    private String createdDatetime;
}
