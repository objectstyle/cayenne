package org.apache.cayenne.testdo.relationships_delete_rules.auto;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.apache.cayenne.BaseDataObject;
import org.apache.cayenne.exp.Property;
import org.apache.cayenne.testdo.relationships_delete_rules.DeleteRuleTest2;

/**
 * Class _DeleteRuleTest1 was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _DeleteRuleTest1 extends BaseDataObject {

    private static final long serialVersionUID = 1L; 

    public static final String DEL_RULE_TEST1_ID_PK_COLUMN = "DEL_RULE_TEST1_ID";

    public static final Property<DeleteRuleTest2> TEST2 = Property.create("test2", DeleteRuleTest2.class);


    protected Object test2;

    public void setTest2(DeleteRuleTest2 test2) {
        setToOneTarget("test2", test2, true);
    }

    public DeleteRuleTest2 getTest2() {
        return (DeleteRuleTest2)readProperty("test2");
    }

    @Override
    public Object readPropertyDirectly(String propName) {
        if(propName == null) {
            throw new IllegalArgumentException();
        }

        switch(propName) {
            case "test2":
                return this.test2;
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
            case "test2":
                this.test2 = val;
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
        out.writeObject(test2);
    }

    @Override
    protected void readState(ObjectInputStream in) throws IOException, ClassNotFoundException {
        super.readState(in);
        test2 = in.readObject();
    }

}
