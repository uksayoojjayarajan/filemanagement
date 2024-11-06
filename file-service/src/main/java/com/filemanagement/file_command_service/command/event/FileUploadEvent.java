package com.filemanagement.file_command_service.command.event;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class FileUploadEvent {
    private String fileId;
    private String fileName;
    private byte[] fileContent;
    private LocalDate dateCreated;
    private LocalDate dateUpdated;
    private String fileType;
    private Long fileSize;
    private String fileLocation;
    private String userId;

}
