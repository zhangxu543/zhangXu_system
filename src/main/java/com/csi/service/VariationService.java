package com.csi.service;

import com.csi.domain.Variation;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author 张旭
 * @version 1.0
 * @date 2021/3/28 17:23
 */

public interface VariationService {
    void insert(Variation change);
    List<Variation> selectByStu(@Param("stuId") String stuId);
}