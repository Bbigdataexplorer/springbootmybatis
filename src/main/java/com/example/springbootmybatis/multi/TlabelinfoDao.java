package com.example.springbootmybatis.multi;


import com.example.springbootmybatis.model.Tlabelinfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;


import java.util.List;



@Mapper
public interface TlabelinfoDao {

    @Select("Select *from tlabelinfo where label_no=#{labelNo}")
    Tlabelinfo get(String labelNo);

//    Tlabelinfo gett(String labelNo);

    List<Tlabelinfo> selectAllByLabelNo(String labelNo);

    List<Tlabelinfo> selectPartByLabelNo(String labelNo);

    List<Tlabelinfo> selectByLabelName(String labelName);

    List<Tlabelinfo> getTlabelList(@Param("labelName") String labelName, @Param("fieldEn") String fieldEn);

    List<Tlabelinfo> getTlabelListLimit(List<String> displayValues);

    List<Tlabelinfo> getByLabelNo(String labelName);

    List<Tlabelinfo> getHotLabel(@Param("size") Integer size);
}