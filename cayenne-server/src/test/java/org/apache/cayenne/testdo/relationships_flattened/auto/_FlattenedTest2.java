package org.apache.cayenne.testdo.relationships_flattened.auto;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

import org.apache.cayenne.BaseDataObject;
import org.apache.cayenne.exp.Property;
import org.apache.cayenne.testdo.relationships_flattened.FlattenedTest1;
import org.apache.cayenne.testdo.relationships_flattened.FlattenedTest3;

/**
 * Class _FlattenedTest2 was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _FlattenedTest2 extends BaseDataObject {

    private static final long serialVersionUID = 1L; 

    public static final String FT2_ID_PK_COLUMN = "FT2_ID";

    public static final Property<String> NAME = Property.create("name", String.class);
    public static final Property<List<FlattenedTest3>> FT3ARRAY = Property.create("ft3Array", List.class);
    public static final Property<FlattenedTest1> TO_FT1 = Property.create("toFT1", FlattenedTest1.class);

    protected String name;

    protected Object ft3Array;
    protected Object toFT1;

    public void setName(String name) {
        beforePropertyWrite("name", this.name, name);
        this.name = name;
    }

    public String getName() {
        beforePropertyRead("name");
        return name;
    }

    public void addToFt3Array(FlattenedTest3 obj) {
        addToManyTarget("ft3Array", obj, true);
    }

    public void removeFromFt3Array(FlattenedTest3 obj) {
        removeToManyTarget("ft3Array", obj, true);
    }

    @SuppressWarnings("unchecked")
    public List<FlattenedTest3> getFt3Array() {
        return (List<FlattenedTest3>)readProperty("ft3Array");
    }

    public void setToFT1(FlattenedTest1 toFT1) {
        setToOneTarget("toFT1", toFT1, true);
    }

    public FlattenedTest1 getToFT1() {
        return (FlattenedTest1)readProperty("toFT1");
    }

    @Override
    public Object readPropertyDirectly(String propName) {
        if(propName == null) {
            throw new IllegalArgumentException();
        }

        switch(propName) {
            case "name":
                return this.name;
            case "ft3Array":
                return this.ft3Array;
            case "toFT1":
                return this.toFT1;
            default:
                return super.readPropertyDirectly(propName);
        }
    }

    @Override
    public void writePropertyDirectly(String propName, Object val) {
        if(propName == null) {
            throw new IllegalArgumentException();
        }

        switch (propName) {
            case "name":
                this.name = (String)val;
                break;
            case "ft3Array":
                this.ft3Array = val;
                break;
            case "toFT1":
                this.toFT1 = val;
                break;
            default:
                super.writePropertyDirectly(propName, val);
        }
    }

    private void writeObject(ObjectOutputStream out) throws IOException {
        writeSerialized(out);
    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        readSerialized(in);
    }

    @Override
    protected void writeState(ObjectOutputStream out) throws IOException {
        super.writeState(out);
        out.writeObject(name);
        out.writeObject(ft3Array);
        out.writeObject(toFT1);
    }

    @Override
    protected void readState(ObjectInputStream in) throws IOException, ClassNotFoundException {
        super.readState(in);
        name = (String)in.readObject();
        ft3Array = in.readObject();
        toFT1 = in.readObject();
    }

}
