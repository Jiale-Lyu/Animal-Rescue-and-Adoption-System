package model.Enterprise;
import model.Organization.OrganizationDirectory;
import model.WorkQueue.WorkQueue;

/**
 *
 * @author fanyesun
 */
public abstract class Enterprise {
    //create enterprise class
    private OrganizationDirectory organizationDirectory;
    private String name;
    private Type type;


    private WorkQueue workQueue;


    public enum Type {
        AnimalShelter("Animal Shelter"), 
        MedicalCare("Medical Care"), 
        Adoption("Adoption"), 
        Volunteer("Volunteer");

        private String value;

        private Type(String typevalue) {
            this.value = typevalue;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }

    public Enterprise(String entername, Type entertype) {
        //create entername and entertype in Enterprise
        this.name = entername;
        this.workQueue = new WorkQueue();
        this.type = entertype;
        //create new organizationDirectory
        organizationDirectory = new OrganizationDirectory();        
    }
    //getType
    public Type getType() {
        return type;
    }
    //getName
    public String getName() {
        return name;
    }
    //setName
    public void setName(String setName) {
        this.name = setName;
    }
    //getOrganizationDirectory
    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }
    //getWorkQueue
    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }
    public WorkQueue getWorkQueue() {
        return workQueue;
    }


    
    @Override
    public String toString() {
        return name;
    }
    

}
