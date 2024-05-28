public class Ram {
    String name= "DDR4";
    int readSpeed = 3;

    @Override
    public String toString() {
        return "Ram{" +
                "name='" + name + '\'' +
                ", readSpeed=" + readSpeed +
                ", writeSpeed=" + writeSpeed +
                '}';
    }

    float writeSpeed =1.5f;
}
