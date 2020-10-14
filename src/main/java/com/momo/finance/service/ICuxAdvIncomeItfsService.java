package com.momo.finance.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.momo.finance.entity.CuxAdvIncomeItfs;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 收入接口表 服务类
 * </p>
 *
 * @author mrli
 * @since 2020-10-12
 */
public interface ICuxAdvIncomeItfsService extends IService<CuxAdvIncomeItfs> {

    IPage<CuxAdvIncomeItfs> selectPage(Page<CuxAdvIncomeItfs> page, QueryWrapper<CuxAdvIncomeItfs> queryWrapper);

    List<CuxAdvIncomeItfs> selectEntityName();
}
