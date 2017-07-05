package org.apache.cayenne.testdo.inheritance_people.auto;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

import org.apache.cayenne.BaseDataObject;
import org.apache.cayenne.exp.Property;
import org.apache.cayenne.testdo.inheritance_people.Employee;
import org.apache.cayenne.testdo.inheritance_people.Manager;

/**
 * Class _Department was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _Department extends BaseDataObject {

    private static final long serialVersionUID = 1L; 

    public static final String DEPARTMENT_ID_PK_COLUMN = "DEPARTMENT_ID";

    public static final Property<String> NAME = Property.create("name", String.class);
    public static final Property<List<Employee>> EMPLOYEES = Property.create("employees", List.class);
    public static final Property<Manager> TO_MANAGER = Property.create("toManager", Manager.class);

    protected String name;

    protected Object employees;
    protected Object toManager;

    public void setName(String name) {
        beforePropertyWrite("name", this.name, name);
        this.name = name;
    }

    public String getName() {
        beforePropertyRead("name");
        return name;
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

    @Override
    public Object readPropertyDirectly(String propName) {
        if(propName == null) {
            throw new IllegalArgumentException();
        }

        switch(propName) {
            case "name":
                return this.name;
            case "employees":
                return this.employees;
            case "toManager":
                return this.toManager;
            default:
                return super.readPropertyDirectly(propName);
        }
    }

    @Override
    public void writePropertyDirectly(String propName, Object val) {
        if(propName == null) {
            throw new IllegalArgumentException();
        }

        switch (propName) {
            case "name":
                this.name = (String)val;
                break;
            case "employees":
                this.employees = val;
                break;
            case "toManager":
                this.toManager = val;
                break;
            default:
                super.writePropertyDirectly(propName, val);
        }
    }

    private void writeObject(ObjectOutputStream out) throws IOException {
        writeSerialized(out);
    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        readSerialized(in);
    }

    @Override
    protected void writeState(ObjectOutputStream out) throws IOException {
        super.writeState(out);
        out.writeObject(name);
        out.writeObject(employees);
        out.writeObject(toManager);
    }

    @Override
    protected void readState(ObjectInputStream in) throws IOException, ClassNotFoundException {
        super.readState(in);
        name = (String)in.readObject();
        employees = in.readObject();
        toManager = in.readObject();
    }

}
