package cc.mrbird.febs.chaoyang3team.dao;

import cc.mrbird.febs.chaoyang3team.domain.Storeroom;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author CHExN
 */
public interface StoreroomMapper extends BaseMapper<Storeroom> {

    IPage<Storeroom> findStoreroomsDetail(Page page, @Param("storeroom") Storeroom storeroom);

    IPage<Storeroom> findStoreroomsItemDetails(Page page, @Param("storeroom") Storeroom storeroom);

    /**
     * 物资分配的查询
     * @param page 分页信息
     * @param storeroom 查询条件
     * @return 查询数据
     */
    IPage<Storeroom> getStoreroomsDist(Page page, @Param("storeroom") Storeroom storeroom);

    List<String> getParentIdByIds(@Param("storeroomIds") String storeroomIds);

    List<Storeroom> findStoreroomByIdAndParentId(String ids);

    /**
     * 根据年月查询已出库的办公用品
     *
     * @param date 年月
     * @return 办公用品
     */
    List<Storeroom> getOfficeSuppliesByDate(String date);

    /**
     * 根据年月查询已出库的食堂用品
     *
     * @param date 年月
     * @return 食堂用品
     */
    List<Storeroom> getCanteenByDate(String date);

    /**
     * 根据库房id(ParentId) 与入库物品id(Id) 查询出库的物品信息
     * @param storeroom 查询条件
     * @return 出库物品信息
     */
    List<Storeroom> getStoreroomOutItemByParentIdAndId(Storeroom storeroom);

}
