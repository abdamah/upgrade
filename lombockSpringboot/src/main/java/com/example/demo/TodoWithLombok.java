package com.example.demo;

// import all from lombok package
import lombok.*;


@AllArgsConstructor
@NoArgsConstructor
/* @Data contains
    @Getter
    @Setter
    @ToString
    @EqualsAndHashCode
    @RequiredArgsConstructor
* */
@Data
public class TodoWithLombok {

    /**
     * This class contains 3 constructors
     * All args constructor from lombok
     * No args constructor from lombok also
     * one we added manually
     * */

    private  int id;
    private String name;
    private boolean isDone;

    //You have to add this construction manually
    public TodoWithLombok(int id){
        this.id = id;
    }
}
