public class Storage {
    String type ="SSD";
    String Manufacturer ="Samsung";

    @Override
    public String toString() {
        return "Storage{" +
                "type='" + type + '\'' +
                ", Manufacturer='" + Manufacturer + '\'' +
                ", Capacity=" + Capacity +
                '}';
    }

    int Capacity = 512;
}
