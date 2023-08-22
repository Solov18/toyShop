# toyShop
В данной программе определены два класса: ToyShop и Toy. 
Класс ToyShop представляет магазин игрушек и содержит методы для добавления новых игрушек, изменения веса игрушек и организации розыгрыша. 
Класс Toy представляет отдельную игрушку.

Пример использования программы представлен в методе main. 
Создается экземпляр ToyShop, затем добавляются новые игрушки с помощью метода addToy. 
Затем с помощью метода updateToyFrequency указывается новый вес (частота выпадения) для игрушки с определенным id. 
Наконец, с помощью метода play организуется розыгрыш игрушек, а призовые игрушки сохраняются в текстовый файл "prize_toys.txt".