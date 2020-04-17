package org.kamenskaya.tripadvisor.app.model.entity.base;

import org.kamenskaya.tripadvisor.app.model.entity.person.Account;

import java.time.LocalDateTime;
import java.util.Objects;

public abstract class AbstractEntity {

    private int id;
    private LocalDateTime created;
    private LocalDateTime updated;
    private Account createdBy;
    private Account updatedBy;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    public void setCreated(LocalDateTime created) {
        this.created = created;
    }

    public LocalDateTime getUpdated() {
        return updated;
    }

    public void setUpdated(LocalDateTime updated) {
        this.updated = updated;
    }

    public Account getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Account createdBy) {
        this.createdBy = createdBy;
    }

    public Account getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(Account updatedBy) {
        this.updatedBy = updatedBy;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AbstractEntity)) return false;
        AbstractEntity that = (AbstractEntity) o;
        return id == that.id &&
                created.equals(that.created) &&
                Objects.equals(updated, that.updated) &&
                createdBy.equals(that.createdBy) &&
                Objects.equals(updatedBy, that.updatedBy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, created, updated, createdBy, updatedBy);
    }
}
