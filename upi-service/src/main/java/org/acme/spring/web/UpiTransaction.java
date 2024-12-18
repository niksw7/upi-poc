package org.acme.spring.web;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "UPI_TRANSACTIONS")
public class UpiTransaction {

    @Id
    private String id;

    @Column(name="upi_transaction_id")
    private String upiTransactionId;
    @Column(name="amount")
    int amount;
    @Column(name="from_vpa_address")
    String fromVpaAddress;
    @Column(name ="from_name" )
    String fromName;
    @Column(name = "to_name")
    String toName;

    public String getId() {
        return id;
    }

    public UpiTransaction(String upiTransactionId, int amount, String fromVpaAddress, String fromName, String toName) {
    this.id = UUID.randomUUID().toString();
    this.upiTransactionId = upiTransactionId;
        this.amount = amount;
        this.fromVpaAddress = fromVpaAddress;
        this.fromName = fromName;
        this.toName = toName;
}

public UpiTransaction(){

}



}