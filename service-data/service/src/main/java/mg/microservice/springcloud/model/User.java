package mg.microservice.springcloud.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class User {

    public User(int id, int userId, String userName, String userPassword, String phoneNumber){
        this.id=id;
        this.userId=userId;
        this.userName=userName;
        this.userPassword=userPassword;
        this.phoneNumber=phoneNumber;
    }

    //对应数据库主键
    @JsonProperty
    private int id;

    @JsonProperty
    private int userId;

    @JsonProperty
    private String userName;

    @JsonProperty
    private String phoneNumber;

    @JsonProperty
    private String userPassword;
}
