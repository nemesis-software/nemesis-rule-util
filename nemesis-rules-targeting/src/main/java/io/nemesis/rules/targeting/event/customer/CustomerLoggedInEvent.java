/*
 * nemesis Platform - NExt-generation Multichannel E-commerce SYStem
 *
 * Copyright (c) 2010 - 2017 nemesis
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of nemesis
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with nemesis.
 */
package io.nemesis.rules.targeting.event.customer;

import io.nemesis.rules.targeting.event.AbstractEvent;

/**
 * An event that is raised once a user logs in.
 *
 * @author Petar Tahchiev
 * @since 1.5
 */
public class CustomerLoggedInEvent extends AbstractEvent {

    @org.kie.api.definition.type.Label(value = "Usergroups")
    private String[] usergroups;

    public CustomerLoggedInEvent() {
    }

    public CustomerLoggedInEvent(String sessionId, String username, String[] usergroups) {
        super(sessionId, username);
        if (usergroups != null) {
            this.usergroups = usergroups.clone();
        }
    }

    public String[] getUsergroups() {
        return usergroups != null ? usergroups.clone() : null;
    }

    public void setUsergroups(String[] usergroups) {
        if (usergroups != null) {
            this.usergroups = usergroups.clone();
        }
    }
}
