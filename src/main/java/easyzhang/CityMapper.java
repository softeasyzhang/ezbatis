package easyzhang;

import easyzhang.City;
import easyzhang.CityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CityMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_city
     *
     * @mbg.generated Tue Jul 10 13:02:25 CST 2018
     */
    long countByExample(CityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_city
     *
     * @mbg.generated Tue Jul 10 13:02:25 CST 2018
     */
    int deleteByExample(CityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_city
     *
     * @mbg.generated Tue Jul 10 13:02:25 CST 2018
     */
    int deleteByPrimaryKey(Integer cityId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_city
     *
     * @mbg.generated Tue Jul 10 13:02:25 CST 2018
     */
    int insert(City record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_city
     *
     * @mbg.generated Tue Jul 10 13:02:25 CST 2018
     */
    int insertSelective(City record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_city
     *
     * @mbg.generated Tue Jul 10 13:02:25 CST 2018
     */
    List<City> selectByExample(CityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_city
     *
     * @mbg.generated Tue Jul 10 13:02:25 CST 2018
     */
    City selectByPrimaryKey(Integer cityId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_city
     *
     * @mbg.generated Tue Jul 10 13:02:25 CST 2018
     */
    int updateByExampleSelective(@Param("record") City record, @Param("example") CityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_city
     *
     * @mbg.generated Tue Jul 10 13:02:25 CST 2018
     */
    int updateByExample(@Param("record") City record, @Param("example") CityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_city
     *
     * @mbg.generated Tue Jul 10 13:02:25 CST 2018
     */
    int updateByPrimaryKeySelective(City record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_city
     *
     * @mbg.generated Tue Jul 10 13:02:25 CST 2018
     */
    int updateByPrimaryKey(City record);
}