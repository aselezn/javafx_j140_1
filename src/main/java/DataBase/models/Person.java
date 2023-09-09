package DataBase.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Person {

    public Integer id;
    public String jobTitle;
    public String firstNameLastName;
    public String phone;
    public String email;

}
