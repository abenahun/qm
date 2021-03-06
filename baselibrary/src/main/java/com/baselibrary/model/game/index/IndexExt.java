package com.baselibrary.model.game.index;

import com.baselibrary.model.game.Game;

import org.litepal.crud.DataSupport;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 74234 on 2017/6/11.
 */

public class IndexExt extends DataSupport{
    private long id;
    private String pic_url_3_2;
    private String url;
    private List<Game> list=new ArrayList<>();


    private IndexAdList indexAdList;
    public IndexAdList getIndexAdList() {
        return indexAdList;
    }

    public void setIndexAdList(IndexAdList indexAdList) {
        this.indexAdList = indexAdList;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPic_url_3_2() {
        return pic_url_3_2;
    }

    public void setPic_url_3_2(String pic_url_3_2) {
        this.pic_url_3_2 = pic_url_3_2;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public List<Game> getList() {
        return list;
    }

    public void setList(List<Game> list) {
        this.list = list;
    }
}
