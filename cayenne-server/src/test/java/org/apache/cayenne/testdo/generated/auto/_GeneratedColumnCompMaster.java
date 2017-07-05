package org.apache.cayenne.testdo.generated.auto;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

import org.apache.cayenne.BaseDataObject;
import org.apache.cayenne.exp.Property;
import org.apache.cayenne.testdo.generated.GeneratedColumnCompKey;

/**
 * Class _GeneratedColumnCompMaster was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _GeneratedColumnCompMaster extends BaseDataObject {

    private static final long serialVersionUID = 1L; 

    public static final String ID_PK_COLUMN = "ID";

    public static final Property<String> NAME = Property.create("name", String.class);
    public static final Property<List<GeneratedColumnCompKey>> TO_DETAIL = Property.create("toDetail", List.class);

    protected String name;

    protected Object toDetail;

    public void setName(String name) {
        beforePropertyWrite("name", this.name, name);
        this.name = name;
    }

    public String getName() {
        beforePropertyRead("name");
        return name;
    }

    public void addToToDetail(GeneratedColumnCompKey obj) {
        addToManyTarget("toDetail", obj, true);
    }

    public void removeFromToDetail(GeneratedColumnCompKey obj) {
        removeToManyTarget("toDetail", obj, true);
    }

    @SuppressWarnings("unchecked")
    public List<GeneratedColumnCompKey> getToDetail() {
        return (List<GeneratedColumnCompKey>)readProperty("toDetail");
    }

    @Override
    public Object readPropertyDirectly(String propName) {
        if(propName == null) {
            throw new IllegalArgumentException();
        }

        switch(propName) {
            case "name":
                return this.name;
            case "toDetail":
                return this.toDetail;
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
            case "toDetail":
                this.toDetail = val;
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
        out.writeObject(toDetail);
    }

    @Override
    protected void readState(ObjectInputStream in) throws IOException, ClassNotFoundException {
        super.readState(in);
        name = (String)in.readObject();
        toDetail = in.readObject();
    }

}
