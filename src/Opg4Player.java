import java.util.ArrayList;

public class Opg4Player {

}
    // Player.java
    public class Opg4Player {
        String name;
        int skillLevel;

        public Opg4Player(String name, int skillLevel) {
            this.name = name;
            this.skillLevel = skillLevel;
        }

        public String toString() {
            return name + " (skill: " + skillLevel + ")";
        }
}
