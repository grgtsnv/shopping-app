# 🛒 Мини система за онлайн магазин

## 🎯 Цел на проекта

Симулиране на опростена онлайн търговска система, която позволява:
- Добавяне на продукти (физически и дигитални)
- Управление на количка (`Cart`)
- Създаване на поръчки (`Order`)
- Работа с клиенти (`Customer`)

Целта е упражняване на **класове**, **наследяване**, **полиморфизъм**, **инкапсулация** и **взаимодействие между обекти**.

---

## 🧱 Основни компоненти (класове)

### 1. `Product` *(абстрактен или базов клас)*

**Полета:**
- `int id`
- `String name`
- `double price`
- `String description`

**Методи:**
- `double getPrice()`
- `String getInfo()`
- `double calculateShipping()` *(по подразбиране: 0)*

---

### 2. Подкласове на `Product`

#### 📦 `PhysicalProduct`
**Допълнителни полета:**
- `double weight`
- `double shippingCost`

**Override методи:**
- `calculateShipping()` — базира се на тегло

#### 📥 `DigitalProduct`
**Допълнителни полета:**
- `double fileSize`
- `String downloadLink`

**Override методи:**
- `calculateShipping()` — винаги 0

---

### 3. `Customer`

**Полета:**
- `String name`
- `String email`
- `String address`
- `int id`
- `List<Order> orders`

**Методи:**
- `makeOrder(Cart cart)`
- `viewOrders()`

---

### 4. `Cart`

**Полета:**
- `List<Product> products`

**Методи:**
- `addProduct(Product product)`
- `removeProduct(Product product)`
- `getTotalPrice()`
- `clearCart()`

---

### 5. `Order`

**Полета:**
- `int id`
- `List<Product> products`
- `double totalPrice`
- `Date date`
- `Customer customer`

**Методи:**
- `printReceipt()`

---

## 🔁 Примерен поток в `Main`

1. Създаване на продукти (физически и дигитални)
2. Създаване на клиент
3. Добавяне на продукти в количка
4. Преглед и финализиране на поръчка
5. Преглед на всички поръчки от клиента

---

## 🎓 Концепции за упражнение

- **Наследяване:** `DigitalProduct` и `PhysicalProduct` наследяват `Product`
- **Полиморфизъм:** чрез override на методи като `getInfo()` и `calculateShipping()`
- **Инкапсулация:** чрез `private` полета и `getters/setters`
- **Работа с колекции:** `ArrayList<Product>`, `List<Order>`
- **Създаване и взаимодействие между обекти**

---

## 🧩 Допълнителни идеи (по избор)

- Отстъпки или купони
- Статус на поръчка: “Pending”, “Shipped”, “Delivered”
- Генериране на PDF фактура
- Запазване и зареждане на данни от файл