package com.momo.finance.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.momo.finance.Util.JsonResult;
import com.momo.finance.Util.ResultTool;
import com.momo.finance.entity.CuxAdvIncomeItfs;
import com.momo.finance.service.ICuxAdvIncomeItfsService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 收入接口表 前端控制器
 * </p>
 *
 * @author mrli
 * @since 2020-10-12
 */
@RestController
@Api(tags = "收入接口表")
public class CuxAdvIncomeItfsController {
    @Autowired
    ICuxAdvIncomeItfsService iCuxAdvIncomeItfsService;

    @GetMapping("ICuxAdvIncomeItfs")
    @ApiOperation(value = "收入接收页面",notes = "")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "current", value = "当前页", required = true,dataType = "int",example = "1"),
            @ApiImplicitParam(name = "size", value = "条数", required = true,dataType = "int",example = "10")
    })
    public JsonResult<IPage<CuxAdvIncomeItfs>> getICuxAdvIncomeItfs(@RequestParam("current") Integer current,@RequestParam("size") Integer size) {
        try {
            QueryWrapper<CuxAdvIncomeItfs> queryWrapper = new QueryWrapper<>();
            Page<CuxAdvIncomeItfs> page = new Page<>(current, size);
            IPage<CuxAdvIncomeItfs> pages;
            pages = iCuxAdvIncomeItfsService.selectPage(page,queryWrapper);
            System.out.println("总条数"+pages.getTotal());
            System.out.println("总页数"+pages.getPages());
            return ResultTool.success(pages);
        }catch (Exception e){
            return ResultTool.fail();
        }
    }
    @GetMapping("entityName")
    @ApiOperation(value = "获取主体名称",notes = "获取所有主体名称")
    public JsonResult entityName(){
        try{
            List<CuxAdvIncomeItfs> list;
            list=iCuxAdvIncomeItfsService.selectEntityName();
            return ResultTool.success(list);
        }
        catch (Exception e){
            return ResultTool.fail();
        }
    }
}
