package com.momo.finance.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.momo.finance.entity.CuxAdvIncomeItfs;
import com.momo.finance.mapper.CuxAdvIncomeItfsMapper;
import com.momo.finance.service.ICuxAdvIncomeItfsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 收入接口表 服务实现类
 * </p>
 *
 * @author mrli
 * @since 2020-10-12
 */
@Service

public class CuxAdvIncomeItfsServiceImpl extends ServiceImpl<CuxAdvIncomeItfsMapper, CuxAdvIncomeItfs> implements ICuxAdvIncomeItfsService {
    @Resource
    CuxAdvIncomeItfsMapper cuxAdvIncomeItfsMapper;
    @Override
    public IPage<CuxAdvIncomeItfs> selectPage(Page<CuxAdvIncomeItfs> page, QueryWrapper<CuxAdvIncomeItfs> queryWrapper) {
        return cuxAdvIncomeItfsMapper.selectPage(page,queryWrapper);
    }
    @DS("slave")
    @Override
    public List<CuxAdvIncomeItfs> selectEntityName() {
        return cuxAdvIncomeItfsMapper.selectEntityName();
    }
}
