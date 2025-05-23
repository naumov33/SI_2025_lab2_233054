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

###Тест случаи според критериумот Multiple Condition за условот
if (item.getPrice() > 300 || item.getDiscount() > 0 || item.getQuantity() > 10)
Test 1: A = T, B = X, C = X
Item test1 = new Item("item1", 5, 400, 0.0); 

Test Case 2: A = F, B = T, C = X
Item test2 = new Item("item2", 5, 200, 0.2);

Test Case 3: A = F, B = F, C = T
Item test3 = new Item("item3", 15, 200, 0.0);

Test Case 4: A = F, B = F, C = F
Item test4 = new Item("item4", 5, 200, 0.0);

###Unit тестовите ги напишав според следниве критериуми
1. Null листа фрла exception и ја покрива првата if
2. Празно име - фрла "Invalid item!" и ја покрива втората if
3. Valid item со попуст - ја покрива пресметката со discount
4. Valid item без попуст - ја покрива else гранката
5. Invalid card number - ја покрива проверката на картичка
6. Valid input
