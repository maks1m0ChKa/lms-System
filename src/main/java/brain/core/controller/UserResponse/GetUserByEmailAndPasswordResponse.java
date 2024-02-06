package brain.core.controller.UserResponse;
import lombok.Getter;
import lombok.Setter;



@Getter
@Setter
public class GetUserByEmailAndPasswordResponse {
   private String email;
   private String password;

   public GetUserByEmailAndPasswordResponse(String email, String password) {
      this.email = email;
      this.password = password;
   }

}
