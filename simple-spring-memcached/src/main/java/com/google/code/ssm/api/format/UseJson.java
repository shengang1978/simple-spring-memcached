/*
 * Copyright (c) 2010-2012 Jakub Białek
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated
 * documentation files (the "Software"), to deal in the Software without restriction, including without limitation the
 * rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to
 * permit persons to whom the Software is furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in all copies or substantial portions of the
 * Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE
 * WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR
 * COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR
 * OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package com.google.code.ssm.api.format;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import com.google.code.ssm.aop.NoClass;

/**
 * 
 * Cached data will be kept in JSON format. In version 3.0.0 and above using this annotation doesn't have any effect. In
 * next version this annotation will be removed.
 * 
 * 
 * @author Jakub Białek
 * @since 2.0.0
 * @deprecated since 3.0.0 use {@link Serialization}.
 * 
 */
@Deprecated
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface UseJson {

    /**
     * By default data from cache are deserialized to return type of annotated method. Adding explicit type can be
     * useful in case of generic collection (ReadThroughMultiCache).
     * 
     * @return class to which deserialise data from cache
     * @deprecated since 3.0.0 information about type/class of cached object are stored within serialised object (in
     *             json string). Settings this field doesn't have any efect, field will be removed in next release.
     */
    @Deprecated
    Class<?> value() default NoClass.class;

}
