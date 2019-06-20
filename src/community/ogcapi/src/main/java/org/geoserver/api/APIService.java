/* (c) 2019 Open Source Geospatial Foundation - all rights reserved
 * This code is licensed under the GPL 2.0 license, available at the root
 * application directory.
 */
package org.geoserver.api;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.springframework.stereotype.Component;

/**
 * Marks a class as a OGC API service provider. Behaves in a way similar to {@link
 * org.springframework.stereotype.Controller}, the {@link APIDispatcher }assumes the methods are
 * annotated in the same way.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Component
public @interface APIService {

    /** The service name, e.g., "Feature", "Tile" */
    public String service();

    /** The version of the service, e.g. "1.0" */
    public String version();

    /**
     * Path of the landing page for this service (from a "/api" base path? or freeform? what about
     * ws specific services?)
     */
    public String landingPage();
}