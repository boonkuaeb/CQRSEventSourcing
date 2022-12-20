package com.techbank.cqrs.core.events;

import com.techbank.cqrs.core.commands.BaseCommand;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class BaseEvent extends BaseCommand {
    private int version;

    public BaseEvent(String id) {
        super(id);
    }
}
