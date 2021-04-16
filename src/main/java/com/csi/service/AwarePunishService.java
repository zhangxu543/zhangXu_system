package com.csi.service;
import com.csi.domain.AwarePunish;


import java.util.List;
import java.util.Map;

/**
 * @author 张旭
 * @version 1.0
 * @date 2021/3/30 21:55
 */

public interface AwarePunishService {
    void insert(AwarePunish awarePunish);
    void update(AwarePunish awarePunish);
    List<AwarePunish> findByLike(AwarePunish awarePunish);
    AwarePunish findById(int id);
}