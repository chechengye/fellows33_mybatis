package com.weichuang.test;

import com.weichuang.dao.OrderMapper;
import com.weichuang.dao.UserMapper;
import com.weichuang.pojo.Order;
import com.weichuang.pojo.OrderUser;
import com.weichuang.pojo.User;
import com.weichuang.vo.QueryVo;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class MyBatisTest {

    @Test
    public void testFn() throws IOException {
        //配置文件路径
        String resource = "SqlMapConfig.xml";
        //根据路径获取输入流
        InputStream inputStream = Resources.getResourceAsStream(resource);
        //根据输入流获取sql会话工厂对象
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //通过工厂对象打开一个sql会话，true : 代表开启事务 ，可操作数据库的改 。false:只能查询
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        //从会话中取得一个mapper映射文件
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        User user = mapper.getUserById(1);
        System.out.println(user);
    }


    @Test
    public void testFn2() throws IOException {
        //配置文件路径
        String resource = "SqlMapConfig.xml";
        //根据路径获取输入流
        InputStream inputStream = Resources.getResourceAsStream(resource);
        //根据输入流获取sql会话工厂对象
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //通过工厂对象打开一个sql会话，true : 代表开启事务 ，可操作数据库的改 。false:只能查询
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        //从会话中取得一个mapper映射文件
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = new User();
        user.setName("lisi");
        user.setEmail("lisi@126.com");
        user.setSex("2");
        mapper.insertUser(user);
    }


    @Test
    public void testFn3() throws IOException {
        //配置文件路径
        String resource = "SqlMapConfig.xml";
        //根据路径获取输入流
        InputStream inputStream = Resources.getResourceAsStream(resource);
        //根据输入流获取sql会话工厂对象
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //通过工厂对象打开一个sql会话，true : 代表开启事务 ，可操作数据库的改 。false:只能查询
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        //从会话中取得一个mapper映射文件
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        QueryVo vo = new QueryVo();
        User user = new User();
        user.setName("三");
        vo.setUser(user);
        User u = mapper.getUserByQueryVo(vo);
        System.out.println(u);
    }

    @Test
    public void testFn4() throws IOException {
        //配置文件路径
        String resource = "SqlMapConfig.xml";
        //根据路径获取输入流
        InputStream inputStream = Resources.getResourceAsStream(resource);
        //根据输入流获取sql会话工厂对象
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //通过工厂对象打开一个sql会话，true : 代表开启事务 ，可操作数据库的改 。false:只能查询
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        //从会话中取得一个mapper映射文件
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        int count = mapper.getCountForUser();
        System.out.println(count);
    }

    @Test
    public void testFn5() throws IOException {
        //配置文件路径
        String resource = "SqlMapConfig.xml";
        //根据路径获取输入流
        InputStream inputStream = Resources.getResourceAsStream(resource);
        //根据输入流获取sql会话工厂对象
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //通过工厂对象打开一个sql会话，true : 代表开启事务 ，可操作数据库的改 。false:只能查询
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        //从会话中取得一个mapper映射文件
        OrderMapper mapper = sqlSession.getMapper(OrderMapper.class);
        List<Order> orderList = mapper.getAllOrders();
        for (Order o : orderList){
            System.out.println(o);
        }

    }

    @Test
    public void testFn6() throws IOException {
        //配置文件路径
        String resource = "SqlMapConfig.xml";
        //根据路径获取输入流
        InputStream inputStream = Resources.getResourceAsStream(resource);
        //根据输入流获取sql会话工厂对象
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //通过工厂对象打开一个sql会话，true : 代表开启事务 ，可操作数据库的改 。false:只能查询
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        //从会话中取得一个mapper映射文件
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = new User();
        //user.setName("张三");
        user.setSex("1");
        List<User> userList = mapper.getUsersByNameAndSex(user);
        for (User u : userList){
            System.out.println(u);
        }
    }

    @Test
    public void testFn7() throws IOException {
        //配置文件路径
        String resource = "SqlMapConfig.xml";
        //根据路径获取输入流
        InputStream inputStream = Resources.getResourceAsStream(resource);
        //根据输入流获取sql会话工厂对象
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //通过工厂对象打开一个sql会话，true : 代表开启事务 ，可操作数据库的改 。false:只能查询
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        //从会话中取得一个mapper映射文件
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        /*List<Integer> ids = new ArrayList<>();
        ids.add(4);
        ids.add(5);*/
        Integer[] ids = {1 , 5};
        List<User> userList = mapper.getUsersByIds(ids);
        for (User u : userList){
            System.out.println(u);
        }
    }

    @Test
    public void testFn8() throws IOException {
        //配置文件路径
        String resource = "SqlMapConfig.xml";
        //根据路径获取输入流
        InputStream inputStream = Resources.getResourceAsStream(resource);
        //根据输入流获取sql会话工厂对象
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //通过工厂对象打开一个sql会话，true : 代表开启事务 ，可操作数据库的改 。false:只能查询
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        //从会话中取得一个mapper映射文件
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<Integer> ids = new ArrayList<>();
        ids.add(4);
        ids.add(5);
        QueryVo vo = new QueryVo();
        vo.setIds(ids);
        List<User> userList = mapper.getUsersByQueryVo(vo);
        for (User u : userList){
            System.out.println(u);
        }
    }

    @Test
    public void testFn9() throws IOException {
        //配置文件路径
        String resource = "SqlMapConfig.xml";
        //根据路径获取输入流
        InputStream inputStream = Resources.getResourceAsStream(resource);
        //根据输入流获取sql会话工厂对象
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //通过工厂对象打开一个sql会话，true : 代表开启事务 ，可操作数据库的改 。false:只能查询
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        //从会话中取得一个mapper映射文件
        OrderMapper mapper = sqlSession.getMapper(OrderMapper.class);
        List<OrderUser> orderUserList = mapper.getOrderAndUser();
        System.out.println(orderUserList);
    }

    @Test
    public void testFn10() throws IOException {
        //配置文件路径
        String resource = "SqlMapConfig.xml";
        //根据路径获取输入流
        InputStream inputStream = Resources.getResourceAsStream(resource);
        //根据输入流获取sql会话工厂对象
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //通过工厂对象打开一个sql会话，true : 代表开启事务 ，可操作数据库的改 。false:只能查询
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        //从会话中取得一个mapper映射文件
        OrderMapper mapper = sqlSession.getMapper(OrderMapper.class);
        List<Order> orders = mapper.getOrdersByOBO();
        System.out.println(orders);
    }

    @Test
    public void testFn11() throws IOException {
        //配置文件路径
        String resource = "SqlMapConfig.xml";
        //根据路径获取输入流
        InputStream inputStream = Resources.getResourceAsStream(resource);
        //根据输入流获取sql会话工厂对象
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //通过工厂对象打开一个sql会话，true : 代表开启事务 ，可操作数据库的改 。false:只能查询
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        //从会话中取得一个mapper映射文件
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> userList = mapper.getUsersByOBM();
        System.out.println(userList);
    }
}
