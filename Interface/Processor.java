public class Processor {
 String type ="core i5";

 @Override
 public String toString() {
  return "Processor{" +
          "type='" + type + '\'' +
          ", numberOfCores=" + numberOfCores +
          '}';
 }

 int numberOfCores =2;
}
