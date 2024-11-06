package query_service.file.query.service;

import query_service.file.query.data.FileRepository;
import query_service.file.response.FileResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class FileQueryService {

    @Autowired
    private FileRepository fileRepository;

//    // Method to get files by user ID
//    public List<FileResponse> findFilesByUser(String userId) {
//        return fileRepository.findByUserId(userId).stream()
//                .map(file -> new FileResponse(file.getFileId(), file.getFileName(), file.getFileType()))
//                .collect(Collectors.toList());
//    }

//    // Method to get files by filter parameters: fileType, userId, dateUpdated
//    public List<FileResponse> findFilesByFilter(String fileType, String userId, LocalDate dateUpdated) {
//        return fileRepository.findAll().stream()
//                .filter(file -> (fileType == null || file.getFileType().equals(fileType)) &&
//                        (userId == null || file.getUserId().equals(userId)) &&
//                        (dateUpdated == null || file.getDateUpdated().equals(dateUpdated)))
//                .map(file -> new FileResponse(file.getFileId(), file.getFileName(), file.getFileType()))
//                .collect(Collectors.toList());
//    }
}