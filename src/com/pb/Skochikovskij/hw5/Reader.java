package com.pb.Skochikovskij.hw5;

import java.util.Arrays;

/*Класс Reader хранит такую информацию о пользователе библиотеки:
- ФИО
- номер читательского билета
- факультет
- дата рождения
- телефон
Типы полей выбирать на свое усмотрение.

Имеет перегруженные методы takeBook(), returnBook():

- takeBook, который будет принимать количество взятых книг.
Выводит на консоль сообщение
"Петров В. В. взял 3 книги".


- takeBook, который будет принимать переменное количество названий книг.
Выводит на консоль сообщение
"Петров В. В. взял книги: Приключения, Словарь, Энциклопедия".

- takeBook, который будет принимать переменное количество объектов класса Book.
Выводит на консоль сообщение
"Петров В. В. взял книги: Приключения (Иванов И. И. 2000 г.), Словарь (Сидоров А. В 1980 г.), Энциклопедия (Гусев К. В. 2010 г.)".

Аналогичным образом перегрузить метод returnBook().
Должно быть 3 метода returnBook() которые выводит на консоль сообщения:
- "Петров В. В. вернул 3 книги"
- "Петров В. В. вернул книги: Приключения, Словарь, Энциклопедия".
- "Петров В. В. вернул книги: Приключения (Иванов И. И. 2000 г.), Словарь (Сидоров А. В 1980 г.), Энциклопедия (Гусев К. В. 2010 г.)".*/
public class Reader {
    private String readerFIO;
    private int readerID;
    private String readerFaculty;
    private  String readerBirthdate;
    private String  readerPhone;

public Reader (String readerFIO,int readerID,String readerFaculty,String readerBirthdate,String  readerPhone) {
    this.readerFIO = readerFIO;
    this.readerID = readerID;
    this.readerFaculty = readerFaculty;
    this.readerBirthdate = readerBirthdate;
    this.readerPhone = readerPhone;
}

    /**
     *
     * @return Получаем полную информацию о пользователе
     */
    public String getReaderInfo () {
        return "[Читатель: " + readerFIO + " ID читателя: " + readerID + " факультет: " +readerFaculty +  " дата рождения: " + readerBirthdate + " Телефон для связи: " +  readerPhone + "]";
    }

    /**
     *
     * @param bookCount принимаем число и пишем, что вот столько книг взял наш юзер
     */
    public void takeBook(int bookCount) {
                System.out.println("Читатель: " + readerFIO + " взял следующее количество книг : " + bookCount );
    }

    /**
     *
     * @param bookName здесь через условный for each берём имя юзера + названия книг, которые он брал
     */
    public void takeBook(String... bookName) {
        System.out.println("Читатель: " + readerFIO + " взял cледующие книги: ");
                for (String book :  bookName) {
                    System.out.println(book);
                }
    }

    /**
     *
     * @param books я не уверен как это работает, нужно передать объект но ..массив строк ?? вроде работает
     */
    public  void takeBook(String[]... books) {
        System.out.println("Читатель: " + readerFIO + " взял cледующие книги: ");
        for (String[] bookInfo : books) {
            System.out.println(Arrays.toString(bookInfo));
        }
    }

    public  void takeBook(Book... books) {
        System.out.println("Читатель: " + readerFIO + " взял cледующие книги: ");
        for (Book bookInfo : books) {
            System.out.println(bookInfo.getInfo());
        }
    }


    public void returnBook(int bookCount) {
        System.out.println("Читатель: " + readerFIO + " сдал следующее количество книг : " + bookCount ); // Пробуем выводить клиента + количество книг
    }

    public void returnBook(String... bookName) {
        System.out.println("Читатель: " + readerFIO + " сдал cледующие книги: "); // Пробуем выводить клиента + количество книг
        for (String book :  bookName) {
            System.out.println(book);
        }
    }

    public  void returnBook(String[]... books) {
        System.out.println("Читатель: " + readerFIO + " сдал cледующие книги: "); // Пробуем выводить клиента + количество книг
        for (String[] bookInfo : books) {
            System.out.println(Arrays.toString(bookInfo));
        }
    }

    public  void returnBook(Book... books) {
        System.out.println("Читатель: " + readerFIO + " сдал cледующие книги: "); // Пробуем выводить клиента + количество книг
        for (Book bookInfo : books) {
            System.out.println(bookInfo.getInfo());
        }
    }

    public String getReaderFIO() {
        return readerFIO;
    }

    public void setReaderFIO(String readerFIO) {
        this.readerFIO = readerFIO;
    }

    public int getReaderID() {
        return readerID;
    }

    public void setReaderID(int readerID) {
        this.readerID = readerID;
    }

    public String getReaderFaculty() {
        return readerFaculty;
    }

    public void setReaderFaculty(String readerFaculty) {
        this.readerFaculty = readerFaculty;
    }

    public String getReaderBirthdate() {
        return readerBirthdate;
    }

    public void setReaderBirthdate(String readerBirthdate) {
        this.readerBirthdate = readerBirthdate;
    }

    public String getReaderPhone() {
        return readerPhone;
    }

    public void setReaderPhone(String readerPhone) {
        this.readerPhone = readerPhone;
    }


}


