package com.filemanagement.file_command_service.command.event;

import com.filemanagement.file_command_service.data.File;
import com.filemanagement.file_command_service.data.FileRepository;
import org.axonframework.eventhandling.EventHandler;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FileUploadEventHandler {

    @Autowired
    private FileRepository fileRepository;



    @EventHandler
    public void on(FileUploadEvent fileUploadEvent) {

            File file = new File();
            BeanUtils.copyProperties(fileUploadEvent, file);
            fileRepository.save(file);


    }
}


