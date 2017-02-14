package org.apache.cayenne.testdo.relationships_set_to_many.auto;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;
import org.apache.cayenne.testdo.relationships_set_to_many.SetToMany;

/**
 * Class _SetToManyTarget was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _SetToManyTarget extends CayenneDataObject {

    private static final long serialVersionUID = 1L; 

    public static final String ID_PK_COLUMN = "ID";

    public static final Property<SetToMany> SET_TO_MANY = Property.create("setToMany", SetToMany.class);

    public void setSetToMany(SetToMany setToMany) {
        setToOneTarget("setToMany", setToMany, true);
    }

    public SetToMany getSetToMany() {
        return (SetToMany)readProperty("setToMany");
    }


}
