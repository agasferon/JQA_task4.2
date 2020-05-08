# Задача №2 - "Индекс Массы Тела"

## Исходный код BmiService.class
```java
public class BmiService {
    public float calculate(int weight, int height) {
        return (weight * 100000) / (height * height);
    }
}
```
## Исходный код Main.class
```java
public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weight = 75;
        int height = 175;
        float bim = (service.calculate(weight, height))/10;
        System.out.println(bim);
    }
}
```
Работа написана в следующем окружении:
* Windows 10 1903 18362.778
* openjdk version "11.0.7" 2020-04-14
* OpenJDK Runtime Environment AdoptOpenJDK (build 11.0.7+10)
* OpenJDK 64-Bit Server VM AdoptOpenJDK (build 11.0.7+10, mixed mode)