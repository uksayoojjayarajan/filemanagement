package com.filemanagement.file_command_service.command.commands;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class FileDeleteCommand {

    @TargetAggregateIdentifier
    private String fileId;
    private String userId;

}
