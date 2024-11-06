package com.filemanagement.file_command_service.command.event;

import com.filemanagement.file_command_service.data.File;
import com.filemanagement.file_command_service.data.FileRepository;
import org.axonframework.eventhandling.EventHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FileDeleteEventHandler {

    @Autowired
    private FileRepository fileRepository;

    @EventHandler
    public void on(FileDeleteEvent fileDeleteEvent){

         File file = new File();
         fileRepository.deleteById(fileDeleteEvent.getFileId());

     }
}
