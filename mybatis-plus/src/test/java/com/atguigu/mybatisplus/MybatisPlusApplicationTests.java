package com.atguigu.mybatisplus;

import com.atguigu.mybatisplus.mapper.UserMapper;
import com.atguigu.mybatisplus.pojo.User;
import com.atguigu.mybatisplus.service.UserService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
class MybatisPlusApplicationTests {

    @Autowired
    private UserMapper userMapper;
    @Autowired
    private UserService userService;

    
    @Test
    public void testMybatisPlus(){
        Integer integer = userMapper.selectCount(null);
        System.out.println(integer);
    }

    @Test
    public void testInsert(){
        User user = new User(null,"赵六",23,"fklsdjf.com");
        int insert = userMapper.insert(user);
        System.out.println("影响行数:"+insert);
        System.out.println("自增长id:"+user.getId());
    }

    @Test
    public void testBatchInsert(){
        List<User> userList = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            userList.add(new User(null,"trump"+i,23+i,"fklsdjf.com") );
        }
        boolean saveBatch = userService.saveBatch(userList);

    }

    @Test
    public void testDelete(){
        int insert = userMapper.deleteById(3);
        System.out.println("影响行数:"+insert);
    }

    //测试合并
    @Test
    public void testDeleteByMap(){
        Map<String,Object> map = new HashMap();
        map.put("id",5);
        int insert = userMapper.deleteByMap(map);
        System.out.println("影响行数:"+insert);
    }

}
