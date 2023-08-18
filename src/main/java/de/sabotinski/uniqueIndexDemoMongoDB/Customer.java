package de.sabotinski.uniqueIndexDemoMongoDB;

import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "customers")
@CompoundIndex(name = "email_phone", def = "{'email': 1, 'phone': 1}", unique = true)
public class Customer {
    private String id;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;

}
