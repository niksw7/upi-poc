/*
 * Copyright 2018 Red Hat, Inc.
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

package org.acme.spring.web;

import jakarta.enterprise.context.ApplicationScoped;
import org.springframework.stereotype.Service;

@Service
@ApplicationScoped
public class TransactionService {
    private final UpiTransactionRepository upiTransactionRepository;

    public TransactionService(UpiTransactionRepository upiTransactionRepository) {
        this.upiTransactionRepository = upiTransactionRepository;
    }

    public VPADetails validateVPA(String vpaID) {
        //Connect to database and get the name, if not present create one and save.

        return new VPADetails("James Bond", "bond7@uk");
    }

    public PaymentStatus transfer(PaymentRequest paymentRequest) {
        //call the mock upi switch's  /transfer api

        return null;
    }
}
