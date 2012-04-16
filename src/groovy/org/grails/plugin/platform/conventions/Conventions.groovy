package org.grails.plugin.platform.conventions

import org.codehaus.groovy.grails.commons.GrailsClass

/**
 * Public interface for convention evaluation and overrides
 */
interface Conventions {
    /**
     * Discovers all the code block conventions (i.e. controller actions) irrespective of underlying convention
     * @todo This is broken under Grails 1.3 currently
     */
    List<String> discoverCodeBlockConventions(Class actualClass, Class annotation, boolean allowArgs)
    
    GrailsClass findArtefactBySimpleClassName(String classNameNoPackage, String artefactType)
}