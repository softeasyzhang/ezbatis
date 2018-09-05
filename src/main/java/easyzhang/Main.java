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

    public static void main(String[] args){
        String resource = "easyzhang/mybatis-config.xml";
        try(InputStream inputStream = Resources.getResourceAsStream(resource)){
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            SqlSession session = sqlSessionFactory.openSession();
            City city = session.selectOne("selectByPrimaryKey", 1);
            System.out.println(city.getCityName());
            session.close();
        }catch (Exception e) {
             e.printStackTrace();
        }
    }

}
