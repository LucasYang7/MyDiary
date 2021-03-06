package com.kiminonawa.mydiary.main.topic;

import com.kiminonawa.mydiary.R;

/**
 * Created by daxia on 2016/10/17.
 */

public class Contacts implements ITopic {

    private String title;
    private long id;
    private int count;

    public Contacts(long id, String title, int count) {
        this.id = id;
        this.title = title;
        this.count = count;
    }

    @Override
    public long getId() {
        return id;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public int getType() {
        return TYPE_CONTACTS;
    }

    @Override
    public int getIcon() {
        return R.drawable.ic_topic_contacts;
    }

    @Override
    public int getCount() {
        return count;
    }
}
