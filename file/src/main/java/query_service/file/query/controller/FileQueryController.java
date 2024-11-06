package query_service.file.query.controller;




import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;



import query_service.file.response.FileResponse;

import query_service.file.query.service.FileQueryService;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;


@RestController
@RequestMapping("/api/files")
@RequiredArgsConstructor
public class FileQueryController {


    private FileQueryService fileQueryService;

//    @GetMapping("/v1/user/name/{userName}")
//    public List<FileResponse> getFilesByUserName(@PathVariable String userName) {
//        return fileQueryService.findFilesByUserName(userName);
//    }

    // Get files with filters: fileType, userId, dateUpdated
//    @GetMapping("/v1/filter")
//    public List<FileResponse> getFilesByFilter(
//            @RequestParam(required = false) String fileType,
//            @RequestParam(required = false) String userId,
//            @RequestParam(required = false)
//            @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate dateUpdated) {
//        return fileQueryService.findFilesByFilter(fileType, userId, dateUpdated);
//    }
}


