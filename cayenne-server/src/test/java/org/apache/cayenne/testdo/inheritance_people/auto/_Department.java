package org.apache.cayenne.testdo.inheritance_people.auto;

import java.util.List;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;
import org.apache.cayenne.testdo.inheritance_people.Employee;
import org.apache.cayenne.testdo.inheritance_people.Manager;

/**
 * Class _Department was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _Department extends CayenneDataObject {

    private static final long serialVersionUID = 1L; 

    public static final String DEPARTMENT_ID_PK_COLUMN = "DEPARTMENT_ID";

    public static final Property<String> NAME = new Property<>("name");
    public static final Property<List<Employee>> EMPLOYEES = new Property<>("employees");
    public static final Property<Manager> TO_MANAGER = new Property<>("toManager");

    public void setName(String name) {
        writeProperty("name", name);
    }
    public String getName() {
        return (String)readProperty("name");
    }

    public void addToEmployees(Employee obj) {
        addToManyTarget("employees", obj, true);
    }
    public void removeFromEmployees(Employee obj) {
        removeToManyTarget("employees", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<Employee> getEmployees() {
        return (List<Employee>)readProperty("employees");
    }


    public void setToManager(Manager toManager) {
        setToOneTarget("toManager", toManager, true);
    }

    public Manager getToManager() {
        return (Manager)readProperty("toManager");
    }


}
