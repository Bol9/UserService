package soon;

import soon.model.Gender;
import soon.model.User;
import soon.service.UserService;
import soon.service.impl.UserServiceImpl;

public class Main {

    public static void main(String[] args) {
	// write your code here

        UserService userService = new UserServiceImpl();

        userService.addUsers(new User(1,"Kalys",25, Gender.MALE));
        userService.addUsers(new User(2,"Asan",27, Gender.MALE));
        userService.addUsers(new User(3,"Bekten",29, Gender.MALE));

        userService.addUsers(new User(3,"Bekten",29, Gender.MALE));  //Exception beret id 3 uje bazada bar



        userService.getAllUsers();   // bardyk userlerdi consulga chygarat

        userService.findUserWithID(1);  // bazadagy bolgon id berilse consulga chygarat egere
                                        // berilgen id bazada jok bolso Exception chygarat

        userService.removeUserWithID(5);   // Bazadagy bolgon id kirse remove kylat boloso Exception beret!

        userService.getAllUsers();   // bardyk userlerdi consulga chygarat






    }


}
