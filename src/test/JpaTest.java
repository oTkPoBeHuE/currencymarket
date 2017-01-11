//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.test.annotation.DirtiesContext;
//import org.springframework.test.context.ContextConfiguration;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//import ru.luxoft.currencymarket.configuration.AppConfiguration;
//import ru.luxoft.currencymarket.model.UserJpaRepository;
//import ru.luxoft.currencymarket.model.User;
//
//import static org.hamcrest.core.Is.is;
//import static org.junit.Assert.assertThat;
//import static org.junit.matchers.JUnitMatchers.hasItem;
//
///**
// * Created by xxoTk on 010 10.01.17.
// */
//
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(classes = AppConfiguration.class)
//@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_CLASS)
//public class JpaTest {
//
//    @Autowired
//    private UserJpaRepository repository;
//
//    @Test
//    public void sampleTestCase() {
//        User dave = new User("Dave", "124");
//        dave = repository.save(dave);
//
//        User carter = new User("Carter", "1245");
//        carter = repository.save(carter);
//
////        List<User> users = (List<User>) repository.findAll();
////        assertThat(users.size(), is(2));
////        assertThat(users, hasItem(dave));
////        assertThat(users, hasItem(carter));
//    }
//}
