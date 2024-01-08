package ru.coldsun;
import com.google.gson.Gson;

public class App
{
    public static void main( String[] args )
    {

        Person person = new Person("Иван", "Иванов", 20);

        Gson gson = new Gson();

        // Сериализация объекта — преобразование объекта `Person` в строку JSON
        String jsonString = gson.toJson(person);

        System.out.println("Converting Person object to JSON string:\n" + jsonString);

        // Десериализовать объект — преобразовать строку JSON обратно в объект `Person`
        Person p = gson.fromJson(jsonString, Person.class);

        System.out.println("\nConverting JSON string to Person object:\n"
                + p.toString());
    }
}
