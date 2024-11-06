package query_service.file.query.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FileRepository extends JpaRepository<File, String> {
    List<File> findByUserId(String userId);
    List<File> findByUserIdStartingWith(String userName); // Assuming you use userId to identify users

}

