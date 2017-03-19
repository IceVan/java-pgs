package com.ice.exchange.services.impl.conditions;

import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * Created by Bartek on 2017-03-14.
 */
public class WindowsCondition implements org.springframework.context.annotation.Condition {

    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        return context.getEnvironment().getProperty("os.name").equalsIgnoreCase("Windows");
    }
}
