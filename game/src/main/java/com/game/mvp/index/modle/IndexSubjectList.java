package com.game.mvp.index.modle;

import org.litepal.crud.DataSupport;

/**
 * Created by 74234 on 2017/5/18.
 */

public class IndexSubjectList extends DataSupport{
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private String desc;
    private String img;
    private String title;
    private int type;
    private IndexExt ext;

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public IndexExt getExt() {
        return ext;
    }

    public void setExt(IndexExt ext) {
        this.ext = ext;
    }

}