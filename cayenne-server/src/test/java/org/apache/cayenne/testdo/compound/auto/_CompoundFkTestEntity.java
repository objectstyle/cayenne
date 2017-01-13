package org.apache.cayenne.testdo.compound.auto;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;
import org.apache.cayenne.testdo.compound.CompoundPkTestEntity;

/**
 * Class _CompoundFkTestEntity was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _CompoundFkTestEntity extends CayenneDataObject {

    private static final long serialVersionUID = 1L; 

    public static final String PKEY_PK_COLUMN = "PKEY";

    public static final Property<String> NAME = new Property<>("name");
    public static final Property<CompoundPkTestEntity> TO_COMPOUND_PK = new Property<>("toCompoundPk");

    public void setName(String name) {
        writeProperty("name", name);
    }
    public String getName() {
        return (String)readProperty("name");
    }

    public void setToCompoundPk(CompoundPkTestEntity toCompoundPk) {
        setToOneTarget("toCompoundPk", toCompoundPk, true);
    }

    public CompoundPkTestEntity getToCompoundPk() {
        return (CompoundPkTestEntity)readProperty("toCompoundPk");
    }


}
