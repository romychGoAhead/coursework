public class Main {
    public static void print() {

        System.out.println("------------------------------------");
    }

    static Employee[] employees = new Employee[10];

    public static void main(String[] args) {

        employees[0] = new Employee("Мухин Станислав Андреевич ", 1, 15_000.50);
        employees[1] = new Employee("Иванов Иван Иванович", 1, 18_500.45);
        employees[2] = new Employee("Петров Андрей Иванович", 2, 16_000.21);
        employees[3] = new Employee("Сидоров Иван Петрович", 2, 17_500);
        employees[4] = new Employee("Костарев Иван Иванович", 3, 22_000);
        employees[5] = new Employee("Жуков Иван Петрович", 3, 25_000);
        employees[6] = new Employee("Котов Иван Павлович", 4, 35_000);
        employees[7] = new Employee("Зюзин Денис Иванович", 4, 42_000.01);
        employees[8] = new Employee("Ложкина Сара Петровна", 5, 54_000);
        employees[9] = new Employee("Мухина Светлана Андреевна", 5, 51_000.27);

        System.out.println();
        System.out.println("Задание 1(а): Получить список всех сотрудников:");
        System.out.println();

        allEmployees();

        print();
        System.out.println("Задание 1(b): Посчитать сумму затрат на зарплаты в месяц.");
        System.out.println();

        System.out.println("Общая сума затрат на зарплаты работникам в месяц, составляет: " + payrollСosts() + " руб.");
        print();
        System.out.println("Задание 1(с): Сотрудник с минимальной зарплатой.");
        System.out.println();
        System.out.println(minWage());
        print();
        System.out.println("Задание 1(d): Сотрудник с максимальной зарплатой.");
        System.out.println();
        System.out.println(maxWage());
        print();

        System.out.println("Задание 1(e): Расчет среднего значения зарплат.");
        System.out.println();

        System.out.println("Сумма средней зарплаты в месяц, составляет: " + averageSalary() + " руб.");
        print();
        System.out.println("Задание 1(f):Получить Ф. И. О. всех сотрудников.");
        System.out.println();

        allName();
        print();

        System.out.println("Задание 2(1): Проиндексировать зарплату.");
        System.out.println();
        salaryIndexation(20);
        allEmployees();
        print();
        System.out.println("Задание 2(2): Cписок сотрудников по определенному отделу.");
        System.out.println();
        allEmployees2(4);
        print();
        System.out.println("Задание 2(a): Сотрудник с минимальной зарплатой.");
        System.out.println();
        System.out.println(minWage2(3));
        print();
        System.out.println("Задание 2(b): Сотрудник с максимальной зарплатой.");
        System.out.println();

        System.out.println(maxWage2(5));
        print();
        System.out.println("Задание 2(c): Суммa затрат на зарплату по отделу.");
        System.out.println();
        payrollСosts2(2);
        System.out.println("Общая сума затрат на зарплаты работникам в месяц, составляет: " + payrollСosts2(2) + " руб.");
        print();


        System.out.println("Задание 2(d): Средняя зарплата сотрудников отдела.");
        System.out.println();

        System.out.println("Сумма средней зарплаты в отделе, составляет: " + averageSalary2(4) + " руб.");
        print();

        System.out.println("Задание 2(e): Проиндексировать зарплату любого отдела.");
        System.out.println();
        salaryIndexation2(10, 3);
        allEmployees2(3);
        print();
        System.out.println("Задание 3(a): сотрудники с зарплатой меньше числа.");
        System.out.println();
        employeesWithSalaryless(30000);
        print();
        System.out.println("Задание 3(b): сотрудники с зарплатой ,больше числа.");
        System.out.println();
        employeesWithSalaryhigher(60000);
        print();

    }

    //
    public static void allEmployees() {
        for (Employee employee : employees) {
            System.out.println((employee));
        }
    }

    public static void allEmployees2(int department) {
        for (Employee employee : employees) {
            if (employee.getDepartment() == department) {
                System.out.println(employee);
            }
        }
    }

    public static double payrollСosts() {
        double salary = 0.00;

        for (Employee employee : employees) {
            salary += employee.getSalary();
        }
        return salary;
    }

    public static double payrollСosts2(int department) {
        double salary = 0.00;

        for (Employee employee : employees) {
            if (employee.getDepartment() == department) {

                salary += employee.getSalary();
            }
        }
        return salary;
    }

    public static Employee minWage() {

        Employee minEmployee = employees[0];

        for (Employee employee : employees) {
            if (employee.getSalary() < minEmployee.getSalary()) {
                minEmployee = employee;
            }

        }
        return minEmployee;
    }

    public static Employee minWage2(int department) {

        Employee minEmployee = employees[0];

        for (Employee employee : employees) {
            if (employee.getDepartment() != department) {
                continue;
            }

            if (employee.getSalary() < minEmployee.getSalary()) {
                minEmployee = employee;
            }

        }
        return minEmployee;
    }

    public static Employee maxWage() {

        Employee maxWage = employees[0];

        for (int i = 0, employeesLength = employees.length; i < employeesLength; i++) {
            Employee employee = employees[i];

            if (employee.getSalary() > maxWage.getSalary()) {
                maxWage = employee;
            }

        }
        return maxWage;
    }

    public static Employee maxWage2(int department) {

        Employee maxEmployee = employees[0];

        for (Employee employee : employees) {
            if (employee.getDepartment() != department) {
                continue;
            }

            if (employee.getSalary() > maxEmployee.getSalary()) {
                maxEmployee = employee;
            }

        }
        return maxEmployee;
    }

    public static double averageSalary() {
        double salary = 0.00;
        double averageSalary = 0;
        for (Employee employee : employees) {
            salary += employee.getSalary();

        }
        averageSalary = salary / employees.length;
        return averageSalary;
    }

    public static double averageSalary2(int department) {
        double salary = 0.00;
        double averageSalary = 0;
        double quantity = 0;
        for (Employee employee : employees) {
            if (employee.getDepartment() != department) {
                continue;
            }
            salary += employee.getSalary();
            quantity++;
        }
        return salary / quantity;
    }

    public static void allName() {
        for (Employee employee : employees) {
            System.out.println((employee.getName()));
        }
    }

    public static void salaryIndexation(int percent) {
        double coef = 1 + percent / 100.0;
        double newSalary = 0;
        for (Employee employee : employees) {
            newSalary = employee.getSalary() * coef;
            employee.setSalary(newSalary);
        }
    }

    public static void salaryIndexation2(int percent, int department) {
        double coef = 1 + percent / 100.0;
        double newSalary = 0;
        for (Employee employee : employees) {
            if (employee.getDepartment() != department) {
                continue;
            }
            employee.setSalary(employee.getSalary() * coef);

        }

    }

    public static void employeesWithSalaryless(double salary) {
        for (Employee employee : employees) {
            if (employee.getSalary() < salary) {
                System.out.println(employee);
            }
        }
    }

    public static void employeesWithSalaryhigher(double salary) {
        for (Employee employee : employees) {
            if (employee.getSalary() > salary) {
                System.out.println(employee);
            }
        }
    }

}















