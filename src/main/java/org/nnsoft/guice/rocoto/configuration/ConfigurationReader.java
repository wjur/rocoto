/*
 *    Copyright 2009-2010 The Rocoto Team
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */
package org.nnsoft.guice.rocoto.configuration;

import java.util.Iterator;
import java.util.Map.Entry;

/**
 * A configuration reader is an object able to read configuration
 * files from classpath, file system or URLs.
 *
 * @since 4.0
 */
public interface ConfigurationReader {

    /**
     * Add an aux prefix to property keys while iterating.
     *
     * @param prefix The aux prefix to property keys while iterating
     */
    void setPrefix(String prefix);

    /**
     * Read the configuration file iterating over the configuration properties.
     *
     * @return the configuration properties iterator.
     */
    Iterator<Entry<String, String>> readConfiguration() throws Exception;

}
