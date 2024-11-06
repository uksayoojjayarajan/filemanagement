package query_service.file.response;


import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FileResponse {
    private String fileId;
    private String fileName;
    private LocalDate dateCreated;
    private LocalDate dateUpdated;
    private String fileType;
    private Long fileSize;
    private String userId;
}
