package com.bing.gmall.user.service;

import com.bing.gmall.user.bean.UmsMember;
import com.bing.gmall.user.bean.UmsMemberReceiveAddress;

import java.util.List;

public interface UserService {
    List<UmsMember> getAllUser();

    List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId);
}
