package com.filemanagement.file_command_service.command.commands;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Data
@Builder
public class FileUploadCommand {
    private String fileId;
    private String fileName;
    private byte[] fileContent;
    private String fileLocation;
    private String fileType;
    private long fileSize;
    private String userId;
    private LocalDate dateCreated;
    private LocalDate dateUpdated;
}
