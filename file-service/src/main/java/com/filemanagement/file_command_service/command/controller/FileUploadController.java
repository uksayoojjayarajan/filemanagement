package com.filemanagement.file_command_service.command.controller;

import com.filemanagement.file_command_service.command.commands.FileDeleteCommand;
import com.filemanagement.file_command_service.command.commands.FileUploadCommand;
import com.filemanagement.file_command_service.command.service.FileCommandService;
import com.filemanagement.file_command_service.data.File;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/files")
public class FileUploadController {

    @Autowired
    private FileCommandService fileCommandService;

    @PostMapping("/v1/add")
    public ResponseEntity<String> fileUpload(@RequestParam("file") MultipartFile file) {
        try {
            String fileId = UUID.randomUUID().toString();
            FileUploadCommand fileUploadCommand = FileUploadCommand.builder()
                    .fileId(fileId)
                    .fileName(file.getOriginalFilename())
                    .fileContent(file.getBytes())
                    .fileLocation("http://asdasdadad") // Update this with actual file location logic
                    .fileType(file.getContentType())
                    .fileSize(file.getSize())
                    .userId("userId") // Replace with actual user ID logic
                    .dateCreated(LocalDate.now())
                    .dateUpdated(LocalDate.now())
                    .build();

            fileCommandService.uploadFile(fileUploadCommand);
            return ResponseEntity.ok(fileId);
        } catch (IOException e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Failed to upload file");
        }
    }

    @DeleteMapping("/v1/delete/{fileId}")
    public ResponseEntity<String> fileDelete(@PathVariable String fileId) {
        FileDeleteCommand fileDeleteCommand = FileDeleteCommand.builder()
                .fileId(fileId)
                .build();

        fileCommandService.deleteFile(fileDeleteCommand);
        return ResponseEntity.ok("Deleted the file");
    }

//    public List<File> getSuggestions(@RequestParam String query) {
//
//    }
}
