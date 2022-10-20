fun main() {
   var list = mutableListOf<Char>() //создаем коллекцию

    for (n in 'a'..'k') { // присваиваем значению n символы от а до к
       list.add(n) // создаем цикл возвращения на строку с условием
    }

    println(list) // выводим на экран
}