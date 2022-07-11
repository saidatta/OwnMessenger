package model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.joda.time.DateTime;

import java.util.List;

@NoArgsConstructor
@Data
@Slf4j
public class User {
    //guid
    String id;

    String name;
    String userId;
    String password;

    // when joined
    DateTime creationDate;

    // list of guids
    List<String> friendsList;
}
