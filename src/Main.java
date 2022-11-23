public  class Main {
    public static  Employee[] employees;


    public static void main(String[] args) {

        employees = new Employee[10];
        employees[0] = new Employee("Веткин Иван Иванович", 1, 11290.50);
        employees[1] = new Employee("Горячев Игорь Иванович", 2, 22450.00);
        employees[2] = new Employee("Минаева Татьяна Сергеевна", 3, 32900.00);
        employees[3] = new Employee("Коробкина Марина Дмитриевна", 4, 7856.76);
        employees[4] = new Employee("Мин Максим Леонидович", 5, 28600.00);
        employees[5] = new Employee("Строганов Олег Николаевич", 1, 45000.00);
        employees[6] = new Employee("Морозова Ирина Владимировна", 2, 13800.40);
        employees[7] = new Employee("Мякинина Жанна Сергеевна", 3, 67000.89);
        employees[8] = new Employee("Ножиков Сергей Викторович", 4, 47890.00);
        employees[9] = new Employee("Иванов Тарас Георгиевич", 5, 76543.12);
        printArray();


    }
    public static void
    printArray() {
        for ( int i = 0;i < employees.length; i++){
            if (employees[i] != null){
                System.out.println(employees[i].toString());

                System.out.println("Сумма зарплат за месяц составила: " + Employee.calculateSalary());

                System.out.println("Максимальная зарплата" + Employee.findMaxSalary(employees));

                System.out.println("Минимальная зарплата" + Employee.findMinSalary(employees));

                System.out.println("Среднее значение затрат составляет" + Employee.getAverageSalary(employees) + "руб.");


            }}}}

