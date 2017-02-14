package org.apache.cayenne.testdo.inheritance_vertical.auto;

import org.apache.cayenne.exp.Property;
import org.apache.cayenne.testdo.inheritance_vertical.IvBase;
import org.apache.cayenne.testdo.inheritance_vertical.IvOther;

/**
 * Class _IvImpl was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _IvImpl extends IvBase {

    private static final long serialVersionUID = 1L; 

    public static final String ID_PK_COLUMN = "ID";

    public static final Property<String> ATTR1 = Property.create("attr1", String.class);
    public static final Property<IvOther> OTHER = Property.create("other", IvOther.class);

    public void setAttr1(String attr1) {
        writeProperty("attr1", attr1);
    }
    public String getAttr1() {
        return (String)readProperty("attr1");
    }

    public void setOther(IvOther other) {
        setToOneTarget("other", other, true);
    }

    public IvOther getOther() {
        return (IvOther)readProperty("other");
    }


}
