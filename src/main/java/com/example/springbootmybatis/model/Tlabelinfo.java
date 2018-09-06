package com.example.springbootmybatis.model;

/**
 * AUTHOR: Wanggc
 * Date : 2018/9/3 9:51
 */
public class Tlabelinfo {
   //标签树 no
    private String label_no;

    //标签id
    private Integer id;

    //标签名字
    private String label_name;

    //是否显示
    private String display;

    //是否是叶子节点
    private String leaf;

    //业务口径
    private String busi_rule;

    //技术口径
    private String tech_rule;

    //数据源
    private String data_src;

    //字段中中文名
    private String field_cn;

    //字段名
    private String fiels_en;

    //数据类型
    private String data_type;

    //是否为空
    private String is_empty;

    //列说明
    private String desc_label;

    //默认值
    private String default_label;

    //创建者
    private String create_user;

    //修改者
    private String modify_user;

    public void setLabel_no(String label_no) {
        this.label_no = label_no;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setLabel_name(String label_name) {
        this.label_name = label_name;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    public void setLeaf(String leaf) {
        this.leaf = leaf;
    }

    public void setBusi_rule(String busi_rule) {
        this.busi_rule = busi_rule;
    }

    public void setTech_rule(String tech_rule) {
        this.tech_rule = tech_rule;
    }

    public void setData_src(String data_src) {
        this.data_src = data_src;
    }

    public void setField_cn(String field_cn) {
        this.field_cn = field_cn;
    }

    public void setFiels_en(String fiels_en) {
        this.fiels_en = fiels_en;
    }

    public void setData_type(String data_type) {
        this.data_type = data_type;
    }

    public void setIs_empty(String is_empty) {
        this.is_empty = is_empty;
    }

    public void setDesc_label(String desc_label) {
        this.desc_label = desc_label;
    }

    public void setDefault_label(String default_label) {
        this.default_label = default_label;
    }

    public void setCreate_user(String create_user) {
        this.create_user = create_user;
    }

    public void setModify_user(String modify_user) {
        this.modify_user = modify_user;
    }

    public String getLabel_no() {
        return label_no;
    }

    public Integer getId() {
        return id;
    }

    public String getLabel_name() {
        return label_name;
    }

    public String getDisplay() {
        return display;
    }

    public String getLeaf() {
        return leaf;
    }

    public String getBusi_rule() {
        return busi_rule;
    }

    public String getTech_rule() {
        return tech_rule;
    }

    public String getData_src() {
        return data_src;
    }

    public String getField_cn() {
        return field_cn;
    }

    public String getFiels_en() {
        return fiels_en;
    }

    public String getData_type() {
        return data_type;
    }

    public String getIs_empty() {
        return is_empty;
    }

    public String getDesc_label() {
        return desc_label;
    }

    public String getDefault_label() {
        return default_label;
    }

    public String getCreate_user() {
        return create_user;
    }

    public String getModify_user() {
        return modify_user;
    }

    @Override
    public String toString() {
        return "Tlabelinfo{" +
                "label_no='" + label_no + '\'' +
                ", id=" + id +
                ", label_name='" + label_name + '\'' +
                ", display='" + display + '\'' +
                ", leaf='" + leaf + '\'' +
                ", busi_rule='" + busi_rule + '\'' +
                ", tech_rule='" + tech_rule + '\'' +
                ", data_src='" + data_src + '\'' +
                ", field_cn='" + field_cn + '\'' +
                ", fiels_en='" + fiels_en + '\'' +
                ", data_type='" + data_type + '\'' +
                ", is_empty='" + is_empty + '\'' +
                ", desc_label='" + desc_label + '\'' +
                ", default_label='" + default_label + '\'' +
                ", create_user='" + create_user + '\'' +
                ", modify_user='" + modify_user + '\'' +
                '}';
    }
}
