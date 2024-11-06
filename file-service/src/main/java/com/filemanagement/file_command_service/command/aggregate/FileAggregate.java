package com.filemanagement.file_command_service.command.aggregate;

import com.filemanagement.file_command_service.command.commands.FileDeleteCommand;
import com.filemanagement.file_command_service.command.commands.FileUploadCommand;
import com.filemanagement.file_command_service.command.event.FileDeleteEvent;
import com.filemanagement.file_command_service.command.event.FileUploadEvent;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.eventsourcing.EventSourcingHandler;
import org.axonframework.modelling.command.AggregateIdentifier;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.axonframework.spring.stereotype.Aggregate;
import org.springframework.beans.BeanUtils;

import java.time.LocalDate;

@Aggregate
@NoArgsConstructor
@AllArgsConstructor
public class FileAggregate {

    @AggregateIdentifier
    private String fileId;
    private String fileName;
    private byte[] fileContent;
    private LocalDate dateCreated;
    private LocalDate dateUpdated;
    private String fileType;
    private Long fileSize;
    private String fileLocation;
    private String userId;

    @CommandHandler
    public FileAggregate(FileUploadCommand fileUploadCommand){
        /*Objects.requireNonNull(fileUploadCommand.getFileName(), "FileName must be provided");
        Objects.requireNonNull(fileUploadCommand.getFileContent(), "FileContent must be provided");*/

        FileUploadEvent fileUploadEvent = new FileUploadEvent();
        BeanUtils.copyProperties(fileUploadCommand, fileUploadEvent);
        AggregateLifecycle.apply(fileUploadEvent);

    }

    @CommandHandler
    public void handle(FileDeleteCommand command) {
       // Objects.requireNonNull(command.getFileId(), "FileId must be provided");

        FileDeleteEvent event = new FileDeleteEvent();
        event.setFileId(command.getFileId());

        AggregateLifecycle.apply(event);
    }

    @EventSourcingHandler
    public void on( FileUploadEvent fileUploadEvent){
        this.fileId = fileUploadEvent.getFileId();
        this.fileName = fileUploadEvent.getFileName();
        this.fileContent = fileUploadEvent.getFileContent();
        this.dateCreated = fileUploadEvent.getDateCreated();
        this.dateUpdated = fileUploadEvent.getDateUpdated();
        this.fileType = fileUploadEvent.getFileType();
        this.fileSize = fileUploadEvent.getFileSize();
        this.fileLocation = fileUploadEvent.getFileLocation();
        this.userId = fileUploadEvent.getUserId();
    }


}
