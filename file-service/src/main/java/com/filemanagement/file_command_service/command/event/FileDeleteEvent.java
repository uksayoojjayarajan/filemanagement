package com.filemanagement.file_command_service.command.event;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class FileDeleteEvent {

    private String fileId;
    private String userId;
}
