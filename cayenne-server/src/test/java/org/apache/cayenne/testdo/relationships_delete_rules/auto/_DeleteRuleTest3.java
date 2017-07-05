package org.apache.cayenne.testdo.relationships_delete_rules.auto;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.apache.cayenne.BaseDataObject;
import org.apache.cayenne.exp.Property;
import org.apache.cayenne.testdo.relationships_delete_rules.DeleteRuleTest2;

/**
 * Class _DeleteRuleTest3 was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _DeleteRuleTest3 extends BaseDataObject {

    private static final long serialVersionUID = 1L; 

    public static final String DELETE_RULE_TEST_3_ID_PK_COLUMN = "DELETE_RULE_TEST_3_ID";

    public static final Property<DeleteRuleTest2> TO_DELETE_RULE_TEST2 = Property.create("toDeleteRuleTest2", DeleteRuleTest2.class);


    protected Object toDeleteRuleTest2;

    public void setToDeleteRuleTest2(DeleteRuleTest2 toDeleteRuleTest2) {
        setToOneTarget("toDeleteRuleTest2", toDeleteRuleTest2, true);
    }

    public DeleteRuleTest2 getToDeleteRuleTest2() {
        return (DeleteRuleTest2)readProperty("toDeleteRuleTest2");
    }

    @Override
    public Object readPropertyDirectly(String propName) {
        if(propName == null) {
            throw new IllegalArgumentException();
        }

        switch(propName) {
            case "toDeleteRuleTest2":
                return this.toDeleteRuleTest2;
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
            case "toDeleteRuleTest2":
                this.toDeleteRuleTest2 = val;
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
        out.writeObject(toDeleteRuleTest2);
    }

    @Override
    protected void readState(ObjectInputStream in) throws IOException, ClassNotFoundException {
        super.readState(in);
        toDeleteRuleTest2 = in.readObject();
    }

}
