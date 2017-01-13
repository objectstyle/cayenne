package org.apache.cayenne.testdo.no_pk.auto;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _NoPkTestEntity was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _NoPkTestEntity extends CayenneDataObject {

    private static final long serialVersionUID = 1L; 


    public static final Property<Integer> ATTRIBUTE1 = new Property<>("attribute1");

    public void setAttribute1(Integer attribute1) {
        writeProperty("attribute1", attribute1);
    }
    public Integer getAttribute1() {
        return (Integer)readProperty("attribute1");
    }

}
