package wsz.springboot.restful.domain;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 *
 */
public class User {

    @Getter
    @Setter
    private Long id;

    @Getter
    @Setter
    private String username;

    @Getter
    @Setter
    private String password;

    @Getter
    @Setter
    private Integer age;

    @Getter
    @Setter
    private Date birth;

}
