package org.apache.cayenne.testdo.relationships_delete_rules.auto;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

import org.apache.cayenne.BaseDataObject;
import org.apache.cayenne.exp.Property;
import org.apache.cayenne.testdo.relationships_delete_rules.DeleteRuleFlatB;

/**
 * Class _DeleteRuleFlatA was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _DeleteRuleFlatA extends BaseDataObject {

    private static final long serialVersionUID = 1L; 

    public static final String FLATA_ID_PK_COLUMN = "FLATA_ID";

    public static final Property<List<DeleteRuleFlatB>> FLAT_B = Property.create("flatB", List.class);


    protected Object flatB;

    public void addToFlatB(DeleteRuleFlatB obj) {
        addToManyTarget("flatB", obj, true);
    }

    public void removeFromFlatB(DeleteRuleFlatB obj) {
        removeToManyTarget("flatB", obj, true);
    }

    @SuppressWarnings("unchecked")
    public List<DeleteRuleFlatB> getFlatB() {
        return (List<DeleteRuleFlatB>)readProperty("flatB");
    }

    @Override
    public Object readPropertyDirectly(String propName) {
        if(propName == null) {
            throw new IllegalArgumentException();
        }

        switch(propName) {
            case "flatB":
                return this.flatB;
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
            case "flatB":
                this.flatB = val;
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
        out.writeObject(flatB);
    }

    @Override
    protected void readState(ObjectInputStream in) throws IOException, ClassNotFoundException {
        super.readState(in);
        flatB = in.readObject();
    }

}
