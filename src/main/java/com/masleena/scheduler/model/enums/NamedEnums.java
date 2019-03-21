package com.masleena.scheduler.model.enums;

public interface NamedEnums<E extends Enum<E>> {
    default String getTextualId() {
        return this.toString();
    }

    String getName();

    String getDescription();
}