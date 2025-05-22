# SI_2025_lab2_233054
# Втора лабораториска вежба по Софтверско инженерство
## Данчо Наумов, 233054

###Control Flow Graph
![Screenshot 2025-05-22 221546](https://github.com/user-attachments/assets/4887b659-746a-4ee8-b787-8e1abc339417)

###Цикломатска комплексност
Цикломатската комплексност на кодот е 11. Ја добив со формулата P+1, каде што P е бројот на предикатни јазли, а во овој случај тој е 10. Така да цикломатската комплексност на овој код е 11.

###Тест случаи според критериумот Every statement
Test Case 1:
allItems = null
cardNumber = "1234567812345678"

Test Case 2: Item со празно име
allItems = [Item(null, 100, 0, 1)]
cardNumber = "1234567812345678"

Test Case 3:
allItems = [Item("Item1", 391, 0, 12)]
cardNumber = "1234567812345678"

Test Case 4:
allItems = [Item("Item2", 194, 0.15, 2)]
cardNumber = "1234567812345678"

Test Case 5: Невалиден cardNumber
allItems = [Item("Item3", 100, 0, 1)]
cardNumber = "1234apjs56tadsa"

Test Case 6: Краток cardNumber
allItems = [Item("Item4", 100, 0, 1)]
cardNumber = "123456"

