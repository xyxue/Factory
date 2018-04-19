package DesignPattern.PrototypePattern;

import com.sun.corba.se.impl.ior.OldJIDLObjectKeyTemplate;

/**
 * Created by wy_xue on 2017/12/11.
 * 原型模式
 */
public abstract class Shape implements  Cloneable {

    private  String id;
    protected  String type;

    abstract  void draw();

    public String getType()
    {
        return type;
    }

    public String getId()
    {
        return id;
    }


    public void setId(String id) {
        this.id = id;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Object Copyclone()
    {
        Object clone = null;

        try {
            clone = super.clone();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return clone;
    }
}
