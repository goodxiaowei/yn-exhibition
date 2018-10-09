package com.yn.module.entity;

import com.alibaba.fastjson.JSONObject;

/**
 * cms_article实体类
 *
 * @author
 */
public class CmsArticle {
    /**
     * 编号
     */
    private String id;
    /**
     * 栏目编号
     */
    private String categoryId;
    /**
     * 标题
     */
    private String title;
    /**
     * 文章链接
     */
    private String link;
    /**
     * 标题颜色
     */
    private String color;
    /**
     * 文章图片
     */
    private String image;
    /**
     * 关键字
     */
    private String keywords;
    /**
     * 描述、摘要
     */
    private String description;
    /**
     * 权重，越大越靠前
     */
    private Integer weight;
    /**
     * 权重期限
     */
    private String weightDate;
    /**
     * 点击数
     */
    private Integer hits;
    /**
     * 推荐位，多选
     */
    private String posid;
    /**
     * 自定义内容视图
     */
    private String customContentView;
    /**
     * 视图配置
     */
    private String viewConfig;
    /**
     * 创建者
     */
    private String createBy;
    /**
     * 创建时间
     */
    private String createDate;
    /**
     * 更新者
     */
    private String updateBy;
    /**
     * 更新时间
     */
    private String updateDate;
    /**
     * 备注信息
     */
    private String remarks;
    /**
     * 删除标记
     */
    private String delFlag;

    /**
     * 实例化
     */
    public CmsArticle() {
        super();
    }

    /**
     * 实例化
     *
     * @param obj
     */
    public CmsArticle(JSONObject obj) {
        this();
        if (obj.get("id") instanceof String) {
            this.setId((String) obj.get("id"));
        }
        if (obj.get("categoryId") instanceof String) {
            this.setCategoryId((String) obj.get("categoryId"));
        }
        if (obj.get("title") instanceof String) {
            this.setTitle((String) obj.get("title"));
        }
        if (obj.get("link") instanceof String) {
            this.setLink((String) obj.get("link"));
        }
        if (obj.get("color") instanceof String) {
            this.setColor((String) obj.get("color"));
        }
        if (obj.get("image") instanceof String) {
            this.setImage((String) obj.get("image"));
        }
        if (obj.get("keywords") instanceof String) {
            this.setKeywords((String) obj.get("keywords"));
        }
        if (obj.get("description") instanceof String) {
            this.setDescription((String) obj.get("description"));
        }
        if (obj.get("weight") instanceof Number) {
            this.setWeight(((Number) obj.get("weight")).intValue());
        }
        if (obj.get("weightDate") instanceof String) {
            this.setWeightDate((String) obj.get("weightDate"));
        }
        if (obj.get("hits") instanceof Number) {
            this.setHits(((Number) obj.get("hits")).intValue());
        }
        if (obj.get("posid") instanceof String) {
            this.setPosid((String) obj.get("posid"));
        }
        if (obj.get("customContentView") instanceof String) {
            this.setCustomContentView((String) obj.get("customContentView"));
        }
        if (obj.get("viewConfig") instanceof String) {
            this.setViewConfig((String) obj.get("viewConfig"));
        }
        if (obj.get("createBy") instanceof String) {
            this.setCreateBy((String) obj.get("createBy"));
        }
        if (obj.get("createDate") instanceof String) {
            this.setCreateDate((String) obj.get("createDate"));
        }
        if (obj.get("updateBy") instanceof String) {
            this.setUpdateBy((String) obj.get("updateBy"));
        }
        if (obj.get("updateDate") instanceof String) {
            this.setUpdateDate((String) obj.get("updateDate"));
        }
        if (obj.get("remarks") instanceof String) {
            this.setRemarks((String) obj.get("remarks"));
        }
        if (obj.get("delFlag") instanceof String) {
            this.setDelFlag((String) obj.get("delFlag"));
        }
    }

    /**
     * 将当前对象转换为JsonObject
     *
     * @return
     */
    public JSONObject toJson() {
        JSONObject result = new JSONObject();
        if (this.getId() != null) {
            result.put("id", this.getId());
        }
        if (this.getCategoryId() != null) {
            result.put("categoryId", this.getCategoryId());
        }
        if (this.getTitle() != null) {
            result.put("title", this.getTitle());
        }
        if (this.getLink() != null) {
            result.put("link", this.getLink());
        }
        if (this.getColor() != null) {
            result.put("color", this.getColor());
        }
        if (this.getImage() != null) {
            result.put("image", this.getImage());
        }
        if (this.getKeywords() != null) {
            result.put("keywords", this.getKeywords());
        }
        if (this.getDescription() != null) {
            result.put("description", this.getDescription());
        }
        if (this.getWeight() != null) {
            result.put("weight", this.getWeight());
        }
        if (this.getWeightDate() != null) {
            result.put("weightDate", this.getWeightDate());
        }
        if (this.getHits() != null) {
            result.put("hits", this.getHits());
        }
        if (this.getPosid() != null) {
            result.put("posid", this.getPosid());
        }
        if (this.getCustomContentView() != null) {
            result.put("customContentView", this.getCustomContentView());
        }
        if (this.getViewConfig() != null) {
            result.put("viewConfig", this.getViewConfig());
        }
        if (this.getCreateBy() != null) {
            result.put("createBy", this.getCreateBy());
        }
        if (this.getCreateDate() != null) {
            result.put("createDate", this.getCreateDate());
        }
        if (this.getUpdateBy() != null) {
            result.put("updateBy", this.getUpdateBy());
        }
        if (this.getUpdateDate() != null) {
            result.put("updateDate", this.getUpdateDate());
        }
        if (this.getRemarks() != null) {
            result.put("remarks", this.getRemarks());
        }
        if (this.getDelFlag() != null) {
            result.put("delFlag", this.getDelFlag());
        }
        return result;
    }


    /**
     * 获取id
     *
     * @return
     */
    public String getId() {
        return id;
    }

    /**
     * 设置id
     *
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取categoryId
     *
     * @return
     */
    public String getCategoryId() {
        return categoryId;
    }

    /**
     * 设置categoryId
     *
     * @param categoryId
     */
    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    /**
     * 获取title
     *
     * @return
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置title
     *
     * @param title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 获取link
     *
     * @return
     */
    public String getLink() {
        return link;
    }

    /**
     * 设置link
     *
     * @param link
     */
    public void setLink(String link) {
        this.link = link;
    }

    /**
     * 获取color
     *
     * @return
     */
    public String getColor() {
        return color;
    }

    /**
     * 设置color
     *
     * @param color
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * 获取image
     *
     * @return
     */
    public String getImage() {
        return image;
    }

    /**
     * 设置image
     *
     * @param image
     */
    public void setImage(String image) {
        this.image = image;
    }

    /**
     * 获取keywords
     *
     * @return
     */
    public String getKeywords() {
        return keywords;
    }

    /**
     * 设置keywords
     *
     * @param keywords
     */
    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    /**
     * 获取description
     *
     * @return
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置description
     *
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 获取weight
     *
     * @return
     */
    public Integer getWeight() {
        return weight;
    }

    /**
     * 设置weight
     *
     * @param weight
     */
    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    /**
     * 获取weightDate
     *
     * @return
     */
    public String getWeightDate() {
        return weightDate;
    }

    /**
     * 设置weightDate
     *
     * @param weightDate
     */
    public void setWeightDate(String weightDate) {
        this.weightDate = weightDate;
    }

    /**
     * 获取hits
     *
     * @return
     */
    public Integer getHits() {
        return hits;
    }

    /**
     * 设置hits
     *
     * @param hits
     */
    public void setHits(Integer hits) {
        this.hits = hits;
    }

    /**
     * 获取posid
     *
     * @return
     */
    public String getPosid() {
        return posid;
    }

    /**
     * 设置posid
     *
     * @param posid
     */
    public void setPosid(String posid) {
        this.posid = posid;
    }

    /**
     * 获取customContentView
     *
     * @return
     */
    public String getCustomContentView() {
        return customContentView;
    }

    /**
     * 设置customContentView
     *
     * @param customContentView
     */
    public void setCustomContentView(String customContentView) {
        this.customContentView = customContentView;
    }

    /**
     * 获取viewConfig
     *
     * @return
     */
    public String getViewConfig() {
        return viewConfig;
    }

    /**
     * 设置viewConfig
     *
     * @param viewConfig
     */
    public void setViewConfig(String viewConfig) {
        this.viewConfig = viewConfig;
    }

    /**
     * 获取createBy
     *
     * @return
     */
    public String getCreateBy() {
        return createBy;
    }

    /**
     * 设置createBy
     *
     * @param createBy
     */
    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    /**
     * 获取createDate
     *
     * @return
     */
    public String getCreateDate() {
        return createDate;
    }

    /**
     * 设置createDate
     *
     * @param createDate
     */
    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    /**
     * 获取updateBy
     *
     * @return
     */
    public String getUpdateBy() {
        return updateBy;
    }

    /**
     * 设置updateBy
     *
     * @param updateBy
     */
    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    /**
     * 获取updateDate
     *
     * @return
     */
    public String getUpdateDate() {
        return updateDate;
    }

    /**
     * 设置updateDate
     *
     * @param updateDate
     */
    public void setUpdateDate(String updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * 获取remarks
     *
     * @return
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * 设置remarks
     *
     * @param remarks
     */
    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    /**
     * 获取delFlag
     *
     * @return
     */
    public String getDelFlag() {
        return delFlag;
    }

    /**
     * 设置delFlag
     *
     * @param delFlag
     */
    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag;
    }

    @Override
    public String toString() {
        return "CmsArticle [id=" + id + " , categoryId=" + categoryId + " , title=" + title + " , link=" + link + " , color=" + color + " , image=" + image + " , keywords=" + keywords + " , description=" + description + " , weight=" + weight + " , weightDate=" + weightDate + " , hits=" + hits + " , posid=" + posid + " , customContentView=" + customContentView + " , viewConfig=" + viewConfig + " , createBy=" + createBy + " , createDate=" + createDate + " , updateBy=" + updateBy + " , updateDate=" + updateDate + " , remarks=" + remarks + " , delFlag=" + delFlag + "  ]";

    }


}
