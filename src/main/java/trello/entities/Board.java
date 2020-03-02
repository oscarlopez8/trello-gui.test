package trello.entities;

import java.util.List;

public class Board {
    private String id;
    private String name;
    private List<List> lists;

    /**
     * Gets the attribute id.
     *
     * @return attribute id.
     */
    public String getId() {
        return id;
    }

    /**
     * Gets the attribute name.
     *
     * @return the attribute name.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets id.
     *
     * @param id to be set.
     */
    public void setId(final String id) {
        this.id = id;
    }

    /**
     * Sets name.
     *
     * @param name to be set.
     */
    public void setName(final String name) {
        this.name = name;
    }
}
