public class Profile {
    private String name;

    public Profile(String name) {
        this.name = name;
    }

    public String GetName() {
        if (name == null) {
            throw new NullPointerException("Tên bị null");
        }
        return name;
    }
}
