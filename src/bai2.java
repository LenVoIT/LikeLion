public class bai2 {
    public static void main(String[] args) {
        nhanVien nv1 = new nhanVien();
        nv1.work();
        nv1.getSalary();
        HRManager hr1 = new HRManager();
        hr1.work();
        hr1.getSalary();
        hr1.addEmployee();
        System.out.println("CEO:");
        CEO c1 = new CEO();
        c1.work();
        c1.paySalary();
        c1.addEmployee();

    }

    public static class nhanVien {
        public nhanVien() {
        }

        public void work() {
            System.out.println("Working as an employee");
        }

        public void getSalary() {
            System.out.println("Employee salary: 40000");
        }
    }

    public static class HRManager extends nhanVien {
        public HRManager() {
        }

        @Override
        public void work() {
            System.out.println("Managing employees");
        }

        @Override
        public void getSalary() {
            System.out.println("Manager salary: 70000");
        }

        public void addEmployee() {
            System.out.println("\nAdding new employee");
        }
    }
    public static class CEO extends HRManager{
        public CEO(){}
        public void paySalary(){
            System.out.println("Pay salary for all");
        }
    }
}
