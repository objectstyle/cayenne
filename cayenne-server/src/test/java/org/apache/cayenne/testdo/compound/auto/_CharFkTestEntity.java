package org.apache.cayenne.testdo.compound.auto;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.apache.cayenne.BaseDataObject;
import org.apache.cayenne.exp.Property;
import org.apache.cayenne.testdo.compound.CharPkTestEntity;

/**
 * Class _CharFkTestEntity was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _CharFkTestEntity extends BaseDataObject {

    private static final long serialVersionUID = 1L; 

    public static final String PK_PK_COLUMN = "PK";

    public static final Property<String> NAME = Property.create("name", String.class);
    public static final Property<CharPkTestEntity> TO_CHAR_PK = Property.create("toCharPK", CharPkTestEntity.class);

    protected String name;

    protected Object toCharPK;

    public void setName(String name) {
        beforePropertyWrite("name", this.name, name);
        this.name = name;
    }

    public String getName() {
        beforePropertyRead("name");
        return name;
    }

    public void setToCharPK(CharPkTestEntity toCharPK) {
        setToOneTarget("toCharPK", toCharPK, true);
    }

    public CharPkTestEntity getToCharPK() {
        return (CharPkTestEntity)readProperty("toCharPK");
    }

    @Override
    public Object readPropertyDirectly(String propName) {
        if(propName == null) {
            throw new IllegalArgumentException();
        }

        switch(propName) {
            case "name":
                return this.name;
            case "toCharPK":
                return this.toCharPK;
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
            case "toCharPK":
                this.toCharPK = val;
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
        out.writeObject(toCharPK);
    }

    @Override
    protected void readState(ObjectInputStream in) throws IOException, ClassNotFoundException {
        super.readState(in);
        name = (String)in.readObject();
        toCharPK = in.readObject();
    }

}
