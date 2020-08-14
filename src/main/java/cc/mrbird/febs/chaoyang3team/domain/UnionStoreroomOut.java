package cc.mrbird.febs.chaoyang3team.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

/**
 * @author CHExN
 */
@Data
@AllArgsConstructor
@TableName("p_union_storeroom_out")
public class UnionStoreroomOut implements Serializable {

    private static final long serialVersionUID = 5187991452492779468L;

    /**
     * 出库记录ID
     */
    @TableField("OUT_ID")
    private Long outId;

    /**
     * 库房物品ID
     */
    @TableField("STOREROOM_ID")
    private Long storeroomId;

    public UnionStoreroomOut() {
    }

}
