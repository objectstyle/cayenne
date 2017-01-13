package org.apache.cayenne.testdo.quotemap.auto;

import java.util.Date;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;
import org.apache.cayenne.testdo.quotemap.QuoteAdress;

/**
 * Class _Quote_Person was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _Quote_Person extends CayenneDataObject {

    private static final long serialVersionUID = 1L; 

    public static final String ID_PK_COLUMN = "id";

    public static final Property<Date> D_ATE = new Property<>("dAte");
    public static final Property<String> F_ULL_NAME = new Property<>("fULL_name");
    public static final Property<String> GROUP = new Property<>("group");
    public static final Property<String> NAME = new Property<>("name");
    public static final Property<Integer> SALARY = new Property<>("salary");
    public static final Property<QuoteAdress> ADDRESS_REL = new Property<>("address_Rel");

    public void setDAte(Date dAte) {
        writeProperty("dAte", dAte);
    }
    public Date getDAte() {
        return (Date)readProperty("dAte");
    }

    public void setFULL_name(String fULL_name) {
        writeProperty("fULL_name", fULL_name);
    }
    public String getFULL_name() {
        return (String)readProperty("fULL_name");
    }

    public void setGroup(String group) {
        writeProperty("group", group);
    }
    public String getGroup() {
        return (String)readProperty("group");
    }

    public void setName(String name) {
        writeProperty("name", name);
    }
    public String getName() {
        return (String)readProperty("name");
    }

    public void setSalary(Integer salary) {
        writeProperty("salary", salary);
    }
    public Integer getSalary() {
        return (Integer)readProperty("salary");
    }

    public void setAddress_Rel(QuoteAdress address_Rel) {
        setToOneTarget("address_Rel", address_Rel, true);
    }

    public QuoteAdress getAddress_Rel() {
        return (QuoteAdress)readProperty("address_Rel");
    }


}
