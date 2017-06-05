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
package com.nemesis.rules.targeting.outcome.message;

import com.nemesis.rules.targeting.outcome.AbstractOutcome;

/**
 * An outcome that sends an email.
 *
 * @author Petar Tahchiev
 * @since 1.5
 */
public class SendEmail extends AbstractOutcome {

    public SendEmail() {
    }

    public SendEmail(String sessionId, String username) {
        super(sessionId, username);
    }
}
