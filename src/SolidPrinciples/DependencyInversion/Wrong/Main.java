package SolidPrinciples.DependencyInversion.Wrong;

//Високите нива на модули (абстракциите) не трябва да зависят от
// ниските нива (конкретни реализации).
//И двете трябва да зависят от абстракции.
//
//Абстракциите не трябва да зависят от детайлите.
//Детайлите трябва да зависят от абстракциите.
//
//Тоест трявба да сме зависими от абстракции а не от конкретни класове.


// Използване
 class Main {
    public static void main(String[] args) {
        Notification notification = new Notification();
        notification.send("Hello!");
    }
}
