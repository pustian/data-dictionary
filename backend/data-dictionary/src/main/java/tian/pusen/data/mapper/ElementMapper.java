package tian.pusen.data.mapper;

import com.baomidou.mybatisplus.plugins.Page;
import org.apache.ibatis.annotations.Param;
import tian.pusen.data.entity.Element;
import com.baomidou.mybatisplus.mapper.BaseMapper;

/**
 * <p>
 * 数据项 Mapper 接口
 * </p>
 *
 * @author pustian
 * @since 2020-04-21
 */
public interface ElementMapper extends BaseMapper<Element> {
//    IPage<Element> queryByPage(Page<Element> elementPageClause, @Param("key") String )
}
