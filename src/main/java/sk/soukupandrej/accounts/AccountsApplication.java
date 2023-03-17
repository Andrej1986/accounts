package sk.soukupandrej.accounts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;

@SpringBootApplication
//@ComponentScans({@ComponentScan("sk.soukupandrej.accounts.controller")})
//@EnableJpaRepositories("sk.soukupandrej.accounts.repository")
//@EntityScan("sk.soukupandrej.accounts.model")
@RefreshScope
public class AccountsApplication {

    public static void main(String[] args) {
        SpringApplication.run(AccountsApplication.class, args);
    }

}
