package com.lgf.demo;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lgf.demo.mapper.UserMapper;
import com.lgf.demo.pojo.User;
import org.apache.ibatis.jdbc.Null;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
import java.util.List;

@SpringBootTest
class Boot01MybatisplusApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Test
    void contextLoads() {
        User u = new User();
        u.setName("李晨");

        Integer result = userMapper.insert(u);
        System.out.println(result);
        System.out.println(u);
    }

    @Test//测试分页查询
    public void testPage(){
        //参数一current：当前页   参数二size：页面大小
        //使用了分页插件之后，所有的分页操作都变得简单了
        Page<User> page = new Page<>(2,5);
        userMapper.selectPage(page,null);
        page.getRecords().forEach(System.out::println);
        System.out.println(page.getTotal());
    }

    @Test
    public void testDelete(){
        userMapper.deleteById(610L);
    }

    @Test
    public void testWarpper() {
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper
                .like("name","李")
                .orderByDesc("id");

        List<User> userList = userMapper.selectList(queryWrapper);
        userList.forEach(System.out::println);
    }

    @Test
    public void gettimetest(){
        LocalDateTime l = LocalDateTime.now();
        System.out.println(l);
    }
}
