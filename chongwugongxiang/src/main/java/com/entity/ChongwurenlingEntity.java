package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 寻宠启事
 *
 * @author 
 * @email
 */
@TableName("chongwurenling")
public class ChongwurenlingEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public ChongwurenlingEntity() {

	}

	public ChongwurenlingEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 标题
     */
    @TableField(value = "chongwurenling_name")

    private String chongwurenlingName;


    /**
     * 类型
     */
    @TableField(value = "chongwulingyang_types")

    private Integer chongwulingyangTypes;


    /**
     * 宠物图片
     */
    @TableField(value = "chongwurenling_photo")

    private String chongwurenlingPhoto;


    /**
     * 发布用户
     */
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


    /**
     * 是否找到主人
     */
    @TableField(value = "jieshu_types")

    private Integer jieshuTypes;


    /**
     * 宠物详情
     */
    @TableField(value = "chongwurenling_content")

    private String chongwurenlingContent;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：标题
	 */
    public String getChongwurenlingName() {
        return chongwurenlingName;
    }


    /**
	 * 获取：标题
	 */

    public void setChongwurenlingName(String chongwurenlingName) {
        this.chongwurenlingName = chongwurenlingName;
    }
    /**
	 * 设置：类型
	 */
    public Integer getChongwulingyangTypes() {
        return chongwulingyangTypes;
    }


    /**
	 * 获取：类型
	 */

    public void setChongwulingyangTypes(Integer chongwulingyangTypes) {
        this.chongwulingyangTypes = chongwulingyangTypes;
    }
    /**
	 * 设置：宠物图片
	 */
    public String getChongwurenlingPhoto() {
        return chongwurenlingPhoto;
    }


    /**
	 * 获取：宠物图片
	 */

    public void setChongwurenlingPhoto(String chongwurenlingPhoto) {
        this.chongwurenlingPhoto = chongwurenlingPhoto;
    }
    /**
	 * 设置：发布用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 获取：发布用户
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：是否找到主人
	 */
    public Integer getJieshuTypes() {
        return jieshuTypes;
    }


    /**
	 * 获取：是否找到主人
	 */

    public void setJieshuTypes(Integer jieshuTypes) {
        this.jieshuTypes = jieshuTypes;
    }
    /**
	 * 设置：宠物详情
	 */
    public String getChongwurenlingContent() {
        return chongwurenlingContent;
    }


    /**
	 * 获取：宠物详情
	 */

    public void setChongwurenlingContent(String chongwurenlingContent) {
        this.chongwurenlingContent = chongwurenlingContent;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Chongwurenling{" +
            "id=" + id +
            ", chongwurenlingName=" + chongwurenlingName +
            ", chongwulingyangTypes=" + chongwulingyangTypes +
            ", chongwurenlingPhoto=" + chongwurenlingPhoto +
            ", yonghuId=" + yonghuId +
            ", jieshuTypes=" + jieshuTypes +
            ", chongwurenlingContent=" + chongwurenlingContent +
            ", createTime=" + createTime +
        "}";
    }
}
