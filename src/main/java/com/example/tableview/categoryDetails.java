package com.example.tableview;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class categoryDetails {

    private final StringProperty cate_name;
    private final IntegerProperty cate_id;

    public categoryDetails(int cate_id, String cate_name) {
        this.cate_name = new SimpleStringProperty(cate_name);
        this.cate_id = new SimpleIntegerProperty(cate_id);
    }

    public String getCate_name() {
        return cate_name.get();
    }

    public StringProperty cate_nameProperty() {
        return cate_name;
    }

    public void setCate_name(String cate_name) {
        this.cate_name.set(cate_name);
    }

    public int getCate_id() {
        return cate_id.get();
    }

    public IntegerProperty cate_idProperty() {
        return cate_id;
    }

    public void setCate_id(int cate_id) {
        this.cate_id.set(cate_id);
    }
}
