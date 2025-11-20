package service;

public class StudentImpl implements Student{
    @Override
    public  void save(model.Student student){
        System.out.println("Student saved");
    }

    @Override
    public model.Student getAll(){
        var st = new model.Student(101,
                "Abdallah","abc@gmail.com");
        return st;
    }
}
