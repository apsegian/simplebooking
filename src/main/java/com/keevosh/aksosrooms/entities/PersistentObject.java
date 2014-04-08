package com.keevosh.aksosrooms.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Transient;
import org.hibernate.annotations.Parameter;
import org.hibernate.annotations.TypeDef;
import org.jadira.usertype.moneyandcurrency.joda.PersistentMoneyAmount;
import org.joda.money.Money;

import org.springframework.data.domain.Persistable;

@TypeDef(name = "money", defaultForType = Money.class, typeClass = PersistentMoneyAmount.class, parameters = {
    @Parameter(name = "currencyCode", value = "EUR")})
@MappedSuperclass
public abstract class PersistentObject implements Serializable, Persistable<Long> {

    private static final long serialVersionUID = 1L;

    private Long id;

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Override
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    @Transient
    public boolean isNew() {
        return this.id == null;
    }
}
