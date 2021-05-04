package pattern.buider;

public class User {

    private User() {
    }

    private long id;
    private String name;
    private int years;

    public static class BuilderUser {

        private final User newUser;

        public BuilderUser() {
            this.newUser = new User();
        }

        public BuilderUser withId(long id) {
            newUser.id = id;
            return this;
        }

        public BuilderUser withName(String name) {
            newUser.name = name;
            return this;
        }

        public BuilderUser withYears(int years) {
            newUser.years = years;
            return this;
        }

        public User build() {
            return newUser;
        }
    }

    @Override
    public String toString() {
        return "User{" +
                       "id=" + id +
                       ", name='" + name + '\'' +
                       ", years=" + years +
                       '}';
    }
}
