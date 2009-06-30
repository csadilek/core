package org.jboss.webbeans.test.unit.lookup.wbri279;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.TYPE;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.enterprise.inject.BindingType;

@Retention(RetentionPolicy.RUNTIME)
@Target( { TYPE, FIELD, METHOD })
@BindingType
public @interface IntFactory
{

}