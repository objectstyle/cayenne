package org.apache.cayenne.testdo.oneway.auto;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.apache.cayenne.BaseDataObject;
import org.apache.cayenne.exp.Property;
import org.apache.cayenne.testdo.oneway.OnewayTable1;

/**
 * Class _OnewayTable2 was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _OnewayTable2 extends BaseDataObject {

    private static final long serialVersionUID = 1L; 

    public static final String ID_PK_COLUMN = "ID";

    public static final Property<Integer> ID = Property.create("id", Integer.class);
    public static final Property<OnewayTable1> TO_ONE_ONE_WAY_DB = Property.create("toOneOneWayDb", OnewayTable1.class);

    protected Integer id;

    protected Object toOneOneWayDb;

    public void setId(Integer id) {
        beforePropertyWrite("id", this.id, id);
        this.id = id;
    }

    public Integer getId() {
        beforePropertyRead("id");
        return id;
    }

    public void setToOneOneWayDb(OnewayTable1 toOneOneWayDb) {
        setToOneTarget("toOneOneWayDb", toOneOneWayDb, true);
    }

    public OnewayTable1 getToOneOneWayDb() {
        return (OnewayTable1)readProperty("toOneOneWayDb");
    }

    @Override
    public Object readPropertyDirectly(String propName) {
        if(propName == null) {
            throw new IllegalArgumentException();
        }

        switch(propName) {
            case "id":
                return this.id;
            case "toOneOneWayDb":
                return this.toOneOneWayDb;
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
            case "id":
                this.id = (Integer)val;
                break;
            case "toOneOneWayDb":
                this.toOneOneWayDb = val;
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
        out.writeObject(id);
        out.writeObject(toOneOneWayDb);
    }

    @Override
    protected void readState(ObjectInputStream in) throws IOException, ClassNotFoundException {
        super.readState(in);
        id = (Integer)in.readObject();
        toOneOneWayDb = in.readObject();
    }

}
