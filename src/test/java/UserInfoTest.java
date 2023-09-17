import com.app.model.User;
import com.app.utils.UserCsvReader;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;
public class UserInfoTest {

    UserCsvReader parser = new UserCsvReader();

    public UserInfoTest() throws IOException {
    }

    @Test
    void validateInsertedData() throws IOException {
        List<User> userParsed = parser.readCsvToUser();
        Assertions.assertEquals("1", userParsed.get(0).getId());

    }

}
