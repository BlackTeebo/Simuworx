package simuworx.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created with IntelliJ IDEA.
 * User: Teebo
 * Date: 10.11.13
 * Time: 19:52
 * To change this template use File | Settings | File Templates.
 */
@Retention(value = RetentionPolicy.RUNTIME)
public @interface Version {
    int major();
    int minor();
    int build();
}
