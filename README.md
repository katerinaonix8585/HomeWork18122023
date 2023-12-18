# Java CustomStringList README

## Описание проекта

Проект представляет собой класс `CustomStringList`, который предоставляет набор методов для работы со списком строк. В классе реализованы функции проверки наличия строки в списке, поиска самого длинного слова, добавления новой строки, и добавления строки, если её нет в списке.

## Использование

### 1. Конструктор

#### `public CustomStringList(String[] initialArray)`

Конструктор класса принимает массив строк в качестве аргумента и инициализирует список строк.

```java
String[] initialArray = {"apple", "banana", "orange"};
CustomStringList customStringList = new CustomStringList(initialArray);
```

### 2. Метод `check`

#### `public boolean check(String str)`

Метод проверяет наличие строки в списке. Возвращает `true`, если строка присутствует, и `false` в противном случае.

```java
boolean isPresent = customStringList.check("banana");
System.out.println(isPresent); // Вывод: true
```

### 3. Метод `check`

#### `public boolean check(String[] strArray)`

Метод проверяет наличие всех строк из массива в списке. Возвращает `true`, если все строки присутствуют, и `false` в противном случае.

```java
String[] arrayToCheck = {"apple", "orange"};
boolean allPresent = customStringList.check(arrayToCheck);
System.out.println(allPresent); // Вывод: true
```

### 4. Метод `longestWord`

#### `public String longestWord()`

Метод возвращает самое длинное слово из списка.

```java
String longest = customStringList.longestWord();
System.out.println(longest); // Вывод: banana
```

### 5. Метод `add`

#### `public void add(String str)`

Метод добавляет новую строку в список.

```java
customStringList.add("grape");
```

### 6. Метод `addIfNotExists`

#### `public void addIfNotExists(String str)`

Метод добавляет новую строку в список, если её нет. В противном случае выводит сообщение в терминал.

```java
customStringList.addIfNotExists("apple"); // Вывод: Строка "apple" в массиве уже есть
customStringList.addIfNotExists("kiwi");
```

## Пример использования

```java
public class Main {
    public static void main(String[] args) {
        String[] initialArray = {"apple", "banana", "orange"};
        CustomStringList customStringList = new CustomStringList(initialArray);

        // Проверка наличия строки
        boolean isPresent = customStringList.check("banana");
        System.out.println(isPresent); // Вывод: true

        // Проверка наличия массива строк
        String[] arrayToCheck = {"apple", "orange"};
        boolean allPresent = customStringList.check(arrayToCheck);
        System.out.println(allPresent); // Вывод: true

        // Поиск самого длинного слова
        String longest = customStringList.longestWord();
        System.out.println(longest); // Вывод: banana

        // Добавление новой строки
        customStringList.add("grape");

        // Добавление строки, если её нет
        customStringList.addIfNotExists("apple"); // Вывод: Строка "apple" в массиве уже есть
        customStringList.addIfNotExists("kiwi");
    }
}
```

Для более подробной информации о классе и его методах, обратитесь к комментариям в исходном коде.