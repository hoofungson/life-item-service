/**
 * @Project Name:life-item-service
 * @Package Name:cn.hoofungson.life.item.service.domain.item
 * @Since JDK 1.8
 */
package cn.hoofungson.life.item.service.domain.item;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @Description: 流水项VO
 * @Author 胡松 hoofungson@163.com
 * @Date 2019-07-22 16:38
 * @Version V1.0
 */
@Data
public class ItemVO implements Serializable {

    private Long id;
    private String name;
    private BigDecimal money;
    private Date createTime;
    private Date updateTime;

    public ItemVO() {
    }

    public ItemVO(Long id, String name, BigDecimal money, Date createTime, Date updateTime) {
        this.id = id;
        this.name = name;
        this.money = money;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }
}
