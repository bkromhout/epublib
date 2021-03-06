package nl.siegmann.epublib.domain;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;

/**
 * MediaType is used to tell the type of content a resource is.
 * <p>
 * Examples of mediatypes are image/gif, text/css and application/xhtml+xml
 * <p>
 * All allowed mediaTypes are maintained bye the MediaTypeService.
 * @author paul
 * @see nl.siegmann.epublib.service.MediatypeService
 */
public class MediaTypeProperty implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = -7256091153727506788L;
    private String name;
    private String defaultExtension;
    private Collection<String> extensions;

    public MediaTypeProperty(String name, String defaultExtension) {
        this(name, defaultExtension, new String[] {defaultExtension});
    }

    public MediaTypeProperty(String name, String defaultExtension,
                             String[] extensions) {
        this(name, defaultExtension, Arrays.asList(extensions));
    }

    public int hashCode() {
        if (name == null) {
            return 0;
        }
        return name.hashCode();
    }

    public MediaTypeProperty(String name, String defaultExtension,
                             Collection<String> extensions) {
        super();
        this.name = name;
        this.defaultExtension = defaultExtension;
        this.extensions = extensions;
    }

    public String getName() {
        return name;
    }

    public String getDefaultExtension() {
        return defaultExtension;
    }

    public Collection<String> getExtensions() {
        return extensions;
    }

    public boolean equals(Object otherMediaType) {
        return otherMediaType != null && otherMediaType instanceof MediaTypeProperty &&
                name.equals(((MediaTypeProperty) otherMediaType).getName());
    }

    public String toString() {
        return name;
    }
}
