package easyzhang;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

/**
 * @author EasyZhang
 * @date 2018/7/10 -  10:48
 */

public class Main {

    /**
     * 这是个测试类，执行一个查询过程
     * @param args
     */
    public static void main(String[] args){
        String resource = "easyzhang/mybatis-config.xml";
        try(InputStream inputStream = Resources.getResourceAsStream(resource)){
            //加载配置文件
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            System.out.println("初始化完毕,开始加载....");

            //DefaultSqlSession <-这个才是实现类
            SqlSession session = sqlSessionFactory.openSession();
            CityExample cityExample = new CityExample();
            CityExample.Criteria criteria = cityExample.createCriteria();
            criteria.andCityIdEqualTo(1);
            CityMapper cityMapper = session.getMapper(CityMapper.class);
            City cityL = cityMapper.selectByPrimaryKey(1);
            System.out.println(cityL.getCityName());
            session.close();

            System.out.println("第一次查询结束");

            SqlSession session1 = sqlSessionFactory.openSession();
            City cityI = session1.selectOne("selectByPrimaryKey", 2);
            System.out.println(cityI.getCityName());
            session1.close();

        }catch (Exception e) {
             e.printStackTrace();
        }
    }

}
