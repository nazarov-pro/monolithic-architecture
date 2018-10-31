package org.nazarovpro.monolithic.main;

import org.nazarovpro.monolithic.db.Database;
import org.nazarovpro.monolithic.util.Utility;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

@SpringBootApplication
@Import({Database.class, Utility.class})
public class Mobile {

    public static void main(String[] args) throws InvalidKeyException, NoSuchAlgorithmException {
        SpringApplication.run(Mobile.class, args);
    }

}

