package org.freeone.apidoc.entity;

import java.util.Date;
import java.util.List;

public class TbResponseClassEntity {
    private Integer id;

    private String className;

    private String packagePath;

    private String description;

    private Date createTime;

    private Date updateTime;

    private Integer requestClassId;

    private String platform;

    private List<TbResponseFieldEntity> responseFieldList;

    public List<TbResponseFieldEntity> getResponseFieldList() {
        return responseFieldList;
    }

    public void setResponseFieldList(List<TbResponseFieldEntity> responseFieldList) {
        this.responseFieldList = responseFieldList;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getClassName() {
        return className;
    }

    public TbResponseClassEntity setClassName(String className) {
        this.className = className;
        return this;
    }

    public String getPackagePath() {
        return packagePath;
    }

    public TbResponseClassEntity setPackagePath(String packagePath) {
        this.packagePath = packagePath;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public TbResponseClassEntity setDescription(String description) {
        this.description = description;
        return this;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public TbResponseClassEntity setCreateTime(Date createTime) {
        this.createTime = createTime;
        return this;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public TbResponseClassEntity setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    public Integer getRequestClassId() {
        return requestClassId;
    }

    public TbResponseClassEntity setRequestClassId(Integer requestClassId) {
        this.requestClassId = requestClassId;
        return this;
    }

    @Override
    public String toString() {
        return "TbResponseClassEntity{" +
                "id=" + id +
                ", className='" + className + '\'' +
                ", packagePath='" + packagePath + '\'' +
                ", description='" + description + '\'' +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                ", requestClassId=" + requestClassId +
                ", platform='" + platform + '\'' +
                '}';
    }
}
