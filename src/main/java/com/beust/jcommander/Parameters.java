/**
 * Copyright (C) 2010 the original author or authors.
 * See the notice.md file distributed with this work for additional
 * information regarding copyright ownership.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.beust.jcommander;

import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.TYPE;

/**
 * An annotation used to specify settings for parameter parsing.
 * 
 * @author cbeust
 */
@Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
@Target({ TYPE })
@Inherited
public @interface Parameters {

  /**
   * The name of the resource bundle to use for this class.
   */
  String resourceBundle() default "";

  /**
   * The character(s) that separate options.
   */
  String separators() default " ";

  /**
   * If the annotated class was added to {@link JCommander} as a command with
   * {@link JCommander#addCommand}, then this string will be displayed in the
   * description when {@link JCommander#usage} is invoked.
   */
  String commandDescription() default "";

  /**
   * @return the key used to find the command description in the resource bundle.
   */
  String commandDescriptionKey() default "";

  /**
   * An array of allowed command names.
   */
  String[] commandNames() default {};

  /**
   * If true, this command won't appear in the usage().
   */
  boolean hidden() default false;

  /**
   * Validate the value for all parameters.
   */
  Class<? extends IParametersValidator>[] parametersValidators() default {};

}
