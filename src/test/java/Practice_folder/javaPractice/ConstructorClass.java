package Practice_folder.javaPractice;

public class ConstructorClass {

    public static void main(String[] args) {
        ParentClass firstName = new ParentClass("Emir",21);
        ParentClass firstName2 = new ParentClass("Safiye",49);


        System.out.println( firstName.name );
        System.out.println( firstName2.name );
        System.out.println( ParentClass.isLiving);
        System.out.println( firstName.X);
        System.out.println( firstName.isLiving);




    }
}
