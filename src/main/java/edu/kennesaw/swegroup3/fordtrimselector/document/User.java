package edu.kennesaw.swegroup3.fordtrimselector.document;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("user")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    private ObjectId id;
    private String auth_id;
    private String email;
    private String username;
    private String provider;

    //TODO: Add Favorites attribute once the class is created
}
