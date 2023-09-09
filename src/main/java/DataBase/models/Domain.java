package DataBase.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
public class Domain {
    public Integer id;
    public String webName;
    public String domainName;
    public String ip;
    public LocalDateTime dateReg;
    public String countryReg;
    public Person person;

}
