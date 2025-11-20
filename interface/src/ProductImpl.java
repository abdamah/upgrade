public class ProductImpl implements Product{
    public void saveProduct(String name){
        System.out.println("Saved successfully " + name) ;
    }

    public void deleteById(int id){
        System.out.println("Deleted successfully " + id);
    }

    public String getAllProducts(){
        return "All products";
    }
}
