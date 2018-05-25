package edu.depaul.cdm.se450.project.util;

/**
 * This enum provides the event codes for the Echo application.
 */

public enum EventCode
{

    /**
     * The values for this enum.
     */
    INITIALIZE(0),
    READ_USER_INPUT(1),
    SET_MODEL_VALUE(2),
    DISPLAY_USER_INPUT(3),
    DISPLAY_CONFIG_FILE(4),
    READ_CONFIG_FILE(5),
    START_CHATBOT(6),
    EXIT_CHATBOT(7);

    private final int value;    // Value of enum instance.

    /**
     * Constructor.
     */
    EventCode(int value)
    {
        this.value = value;
    }

    /**
     * Get the value
     *
     * @return The current enum value
     */
    public int value()
    {
        return this.value;
    }
}
