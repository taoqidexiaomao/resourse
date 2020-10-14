package com.momo.finance.mapper;

import com.momo.finance.entity.CuxAdvIncomeItfs;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 * 收入接口表 Mapper 接口
 * </p>
 *
 * @author mrli
 * @since 2020-10-12
 */
public interface CuxAdvIncomeItfsMapper extends BaseMapper<CuxAdvIncomeItfs> {

    List<CuxAdvIncomeItfs> selectEntityName();
}
