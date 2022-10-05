public class Paraconst {
    // Thuộc Tính
    int id;
    String name;
    // Constructor có tham số
    Paraconst(int i , String n) {
        id = i ;
        name = n;
    }
    // Phương thức
    void display(){
        System.out.println(id + "" + name);
    }
    public static void main(String args[]){
        //Tạo Đối Tượng
        Paraconst s1 = new Paraconst(12 , "Hà Nội") ;
        Paraconst s2 = new Paraconst(15 , "Nam Định");
        // Cách Gọi
        s1.display();
        s2.display();
    }
}
