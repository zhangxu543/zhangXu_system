package com.csi.dao;

import com.csi.domain.AwarePunish;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * @author 张旭
 * @version 1.0
 * @date 2021/3/30 21:55
 */
@Repository
public interface AwarePunishDao {
    void insert(AwarePunish awarePunish);
    void update(AwarePunish awarePunish);
    List<AwarePunish> findByLike(Map<String, Object> map);
    AwarePunish findById(int id);
}