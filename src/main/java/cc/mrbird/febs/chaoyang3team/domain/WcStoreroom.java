package cc.mrbird.febs.chaoyang3team.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author CHExN
 */
@Data
@TableName("p_wc_storeroom")
public class WcStoreroom implements Serializable {

    private static final long serialVersionUID = -2203884755984912254L;

    /**
     * 公厕id
     */
    @TableField("WC_ID")
    private Long wcId;

    /**
     * 库房id（出库）
     */
    @TableField("STOREROOM_ID")
    private Long storeroomId;

    /**
     * 分配数量
     */
    @TableField("AMOUNT")
    private BigDecimal amount;

    /**
     * 年
     */
    @TableField("YEAR")
    private String year;

    /**
     * 月
     */
    @TableField("MONTH")
    private String month;

    /**
     * 日
     */
    @TableField("DAY")
    private String day;


    private transient String yearForm;
    private transient String yearTo;
    private transient String monthForm;
    private transient String monthTo;
    private transient String wcName;
    private transient String wcNum;
    private transient String WcOwn;
    private transient String name;
    private transient String typeApplication;
    private transient BigDecimal money;


}
