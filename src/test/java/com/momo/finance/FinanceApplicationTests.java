package com.momo.finance;

import com.momo.finance.entity.CuxAdvIncomeItfs;
import com.momo.finance.service.ICuxAdvIncomeItfsService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class FinanceApplicationTests {
    @Autowired
    ICuxAdvIncomeItfsService iCuxAdvIncomeItfsService;
    @Test
    void entityName(){
        List<CuxAdvIncomeItfs> list;
        list=iCuxAdvIncomeItfsService.selectEntityName();
        list.forEach(System.out::println);
    }
    @Test
    void contextLoads() {
/*        System.out.println(("----- selectAll method test ------"));
        String fullname="测试课";
        QueryWrapper<Student> queryWrapper = new QueryWrapper<>();
        //queryWrapper.ge("SId", 2);
        //queryWrapper.eq("SId", 2);
        queryWrapper.groupBy("Sname");
        queryWrapper.having("SId>{0}","5");
        Page<Student> page = new Page<>(1, 2);
        Page<Map<String,Object>> paget = new Page<>(1, 2);
        List<Course> userList = courseMapper.selectList(null);
        IPage<Student> pages=studentMapper.selectPage(page,queryWrapper);
        System.out.println("总条数"+pages.getTotal());
        System.out.println("总页数"+pages.getPages());
        IPage<Map<String,Object>> userIPage = studentMapper.selectMapsPage(paget, queryWrapper);
        System.out.println("总条数"+userIPage.getTotal());
        System.out.println("总页数"+userIPage.getPages());
        //Assert.assertEquals(5, userList.size());
        userList.forEach(System.out::println);*/
    }

}
