public class Physics {
    private String physicName;
    private String physicContribution;

    public Physics(String physicName, String physicContribution) {
        this.physicName = physicName;
        this.physicContribution = physicContribution;
    }

    String getPhysicName() {
        return this.physicName;
    }

    String getPhysicContribution() {
        return this.physicContribution;
    }

    void setPhysicName(String physicName) {
        this.physicName = physicName;
    }

    void setPhysicContribution(String physicContribution) {
        this.physicContribution = physicContribution;
    }

    void showPhysicInfo() {
        System.out.println("\nPhysicName: " + this.physicName + "\nPhysicContribution: " + this.physicContribution);
    }
}