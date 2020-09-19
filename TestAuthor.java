package ru.mirea.laba2;

public class TestAuthor {
    public static void main(String[] args) {
        Author a1= new Author("Ivan Popov","ivPopov@somewhere.com",'M');
        System.out.println(a1);
        Author a2= new Author("Anna Ivanova","anIvanova@somewhere.com",'F');
        System.out.println(a2);
        a2.setEmail("annaIv@somewhere.com");
        System.out.println(a2);
    }
}
