public class App {
    public static void main(String[] args) throws Exception {
        Programming programming = new Programming("js", "vscode", 12.5);
        Physics physics = new Physics("albert", "black hole");

        System.out.println("\nHello world from " + programming.getLanguage());
        programming.setLanguage("javascript");
        programming.showLanguageInfo();

        System.out.println("\nHello to " + physics.getPhysicName());
        physics.setPhysicName("albert einstein");
        physics.showPhysicInfo();
    }
}
