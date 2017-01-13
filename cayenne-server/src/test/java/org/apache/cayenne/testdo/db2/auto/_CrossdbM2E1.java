package org.apache.cayenne.testdo.db2.auto;

import java.util.List;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;
import org.apache.cayenne.testdo.db2.CrossdbM2E2;

/**
 * Class _CrossdbM2E1 was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _CrossdbM2E1 extends CayenneDataObject {

    private static final long serialVersionUID = 1L; 

    public static final String ID_PK_COLUMN = "ID";

    public static final Property<String> NAME = new Property<>("name");
    public static final Property<List<CrossdbM2E2>> LIST_OF_M2E2 = new Property<>("listOfM2E2");

    public void setName(String name) {
        writeProperty("name", name);
    }
    public String getName() {
        return (String)readProperty("name");
    }

    public void addToListOfM2E2(CrossdbM2E2 obj) {
        addToManyTarget("listOfM2E2", obj, true);
    }
    public void removeFromListOfM2E2(CrossdbM2E2 obj) {
        removeToManyTarget("listOfM2E2", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<CrossdbM2E2> getListOfM2E2() {
        return (List<CrossdbM2E2>)readProperty("listOfM2E2");
    }


}
