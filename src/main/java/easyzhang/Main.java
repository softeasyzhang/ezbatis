package easyzhang;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;
import java.util.List;

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
            List<City> cities = cityMapper.selectByExample(cityExample);
            System.out.println(cities.get(0).getCityName());
            session.close();

        }catch (Exception e) {
             e.printStackTrace();
        }
    }

}
