package com.masleena.scheduler.model.enums;

public enum TaskStatuses implements NamedEnums {
    NEW("New", ""),
    IN_PROGRESS("In Progress", ""),
    COMPLETED("Completed", "");

    private final String name;
    private final String description;

    TaskStatuses(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public static TaskStatuses byTextualId(String textualId) {
        for (TaskStatuses instance : values()) {
            if (instance.getTextualId().equals(textualId)) {
                return instance;
            }
        }
        return null;
    }

    public static TaskStatuses byName(String name) {
        for (TaskStatuses instance : values()) {
            if (instance.getName().equals(name)) {
                return instance;
            }
        }
        return null;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }
}
