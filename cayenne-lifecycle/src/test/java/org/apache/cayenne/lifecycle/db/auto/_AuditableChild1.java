package org.apache.cayenne.lifecycle.db.auto;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;
import org.apache.cayenne.lifecycle.db.Auditable1;

/**
 * Class _AuditableChild1 was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _AuditableChild1 extends CayenneDataObject {

    private static final long serialVersionUID = 1L; 

    public static final String ID_PK_COLUMN = "ID";

    public static final Property<String> CHAR_PROPERTY1 = new Property<String>("charProperty1");
    public static final Property<Auditable1> PARENT = new Property<Auditable1>("parent");

    public void setCharProperty1(String charProperty1) {
        writeProperty("charProperty1", charProperty1);
    }
    public String getCharProperty1() {
        return (String)readProperty("charProperty1");
    }

    public void setParent(Auditable1 parent) {
        setToOneTarget("parent", parent, true);
    }

    public Auditable1 getParent() {
        return (Auditable1)readProperty("parent");
    }


}
