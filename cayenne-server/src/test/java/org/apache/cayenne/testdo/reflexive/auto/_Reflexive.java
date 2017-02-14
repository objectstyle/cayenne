package org.apache.cayenne.testdo.reflexive.auto;

import java.util.List;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;
import org.apache.cayenne.testdo.reflexive.Reflexive;

/**
 * Class _Reflexive was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _Reflexive extends CayenneDataObject {

    private static final long serialVersionUID = 1L; 

    public static final String ID_PK_COLUMN = "ID";

    public static final Property<String> NAME = Property.create("name", String.class);
    public static final Property<List<Reflexive>> CHILDREN = Property.create("children", List.class);
    public static final Property<Reflexive> TO_PARENT = Property.create("toParent", Reflexive.class);

    public void setName(String name) {
        writeProperty("name", name);
    }
    public String getName() {
        return (String)readProperty("name");
    }

    public void addToChildren(Reflexive obj) {
        addToManyTarget("children", obj, true);
    }
    public void removeFromChildren(Reflexive obj) {
        removeToManyTarget("children", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<Reflexive> getChildren() {
        return (List<Reflexive>)readProperty("children");
    }


    public void setToParent(Reflexive toParent) {
        setToOneTarget("toParent", toParent, true);
    }

    public Reflexive getToParent() {
        return (Reflexive)readProperty("toParent");
    }


}
