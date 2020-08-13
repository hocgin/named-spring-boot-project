package in.hocg.named.autoconfiguration;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by hocgin on 2020/8/6
 * email: hocgin@gmail.com
 *
 * @author hocgin
 */
@Configuration
@ConditionalOnClass({Aspect.class})
public class NamedAutoConfiguration {

    @Bean
    public NamedAspect namedAspect(ApplicationContext context) {
        return new NamedAspect(context);
    }
}
