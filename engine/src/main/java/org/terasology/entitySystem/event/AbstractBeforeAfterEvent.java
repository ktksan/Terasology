// Copyright 2020 The Terasology Foundation
// SPDX-License-Identifier: Apache-2.0

package org.terasology.entitySystem.event;

/**
 * Immutable event to notify a change in a certain value.
 * NOTE: This is a generic event and a more specific Event implementing this event should be fired and reacted to.
 */
public class AbstractBeforeAfterEvent implements Event {
    private final float oldValue;
    private final float newValue;

    /**
     * Create a new notification event on change in value.
     */
    AbstractBeforeAfterEvent(float oldValue, float newValue) {
        this.oldValue = oldValue;
        this.newValue = newValue;
    }

    /**
     * Returns the value prior to change.
     */
    public float getOldValue() {
        return oldValue;
    }

    /**
     * Returns the value after change.
     */
    public float getNewValue() {
        return newValue;
    }

    /**
     * Returns the amount by which the value has been changed.
     */
    public float getChange() {
        return newValue - oldValue;
    }
}
