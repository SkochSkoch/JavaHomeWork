package com.pb.Skochikovskij.hw5;
/*Класс Library используется как демонстрация работы классов Book и Reader.
Имеет метод main() в котором создается массивы объектов Book и Reader, по 3 или более элементов в каждом.
Выполняются такие действия:
- печатаются все книги.
- печатаются все читатели.
- демонстрируется работа всех вариантов методов takeBook() и returnBook().*/
public class Library {

    public static void main(String[] args) {
        Book book1   = new Book("Лабиринт отражений","Сергей Лукьяненко",1997);
        Book book2  = new Book("Трудно быть богом","Аркадий и Борис Стругацкие",1963 );
        Book book3   = new Book("Алмазный меч деревянный меч","Ник Перумов",1998);
        Book book4  = new Book("Колыбельная","Чак Паланик",2002);
        Reader reader1 = new Reader("Скочиковский А.В ",  333,"Монгольское языковеденье","30.07.1988","0937228002");
        Reader reader2 = new Reader("Колодяжный А.В ",  451,"Ведический JS и прикладное постгресиирование ","Чутка раньше первого читателя",
                "0931515875");
        Reader reader3 = new Reader("Бессмертный К ",1,"Окупунктура паховой области ","После куриц",
                "0011111");
        Reader reader4 = new Reader("Владимир ",7,"Массовые обряды на воде, ","Около 988",
                "9379992");

        System.out.println(book1.getInfo());
        System.out.println(book2.getInfo());
        System.out.println(book3.getInfo());
        System.out.println(book4.getInfo());
        System.out.println(reader1.getReaderInfo());
        System.out.println(reader2.getReaderInfo());
        System.out.println(reader3.getReaderInfo());
        System.out.println(reader4.getReaderInfo());


        reader1.takeBook(book1.getBookName(), book3.getBookName());
        reader2.takeBook(3);
        reader3.takeBook(book1.getInfo(), book3.getInfo(), book4.getInfo());
        reader4.returnBook(book4.getBookName(), book2.getBookName());
        reader2.returnBook(2);
        reader1.returnBook(book1.getInfo(), book3.getInfo());


    }
}






