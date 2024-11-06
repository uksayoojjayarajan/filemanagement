package com.filemanagement.file_command_service.command.service;

import com.filemanagement.file_command_service.command.commands.FileDeleteCommand;
import com.filemanagement.file_command_service.command.commands.FileUploadCommand;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FileCommandService {

    @Autowired
    private CommandGateway commandGateway;

    public void uploadFile(FileUploadCommand command) {
        commandGateway.send(command);
    }

    public void deleteFile(FileDeleteCommand command) {
        commandGateway.send(command);
    }
}
