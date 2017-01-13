package org.apache.cayenne.testdo.qualified.auto;

import java.util.List;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;
import org.apache.cayenne.testdo.qualified.Qualified2;

/**
 * Class _Qualified1 was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _Qualified1 extends CayenneDataObject {

    private static final long serialVersionUID = 1L; 

    public static final String ID_PK_COLUMN = "ID";

    public static final Property<Boolean> DELETED = new Property<>("deleted");
    public static final Property<String> NAME = new Property<>("name");
    public static final Property<List<Qualified2>> QUALIFIED2S = new Property<>("qualified2s");

    public void setDeleted(Boolean deleted) {
        writeProperty("deleted", deleted);
    }
    public Boolean getDeleted() {
        return (Boolean)readProperty("deleted");
    }

    public void setName(String name) {
        writeProperty("name", name);
    }
    public String getName() {
        return (String)readProperty("name");
    }

    public void addToQualified2s(Qualified2 obj) {
        addToManyTarget("qualified2s", obj, true);
    }
    public void removeFromQualified2s(Qualified2 obj) {
        removeToManyTarget("qualified2s", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<Qualified2> getQualified2s() {
        return (List<Qualified2>)readProperty("qualified2s");
    }


}
