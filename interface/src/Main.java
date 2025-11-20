import service.StudentImpl;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
//        // to see how IntelliJ IDEA suggests fixing it.
//        ProductImpl product = new ProductImpl();
//        product.saveProduct("Pen");
//        product.deleteById(10);
//       String products = product.getAllProducts();
//        System.out.println(product.getAllProducts());

        var st = new StudentImpl();
            st.save(new model.Student(1,"Ahemd","avb@kgjakljg"));
//        st.getAll();

        System.out.println(st.getAll());

    }
}