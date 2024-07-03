package com.app.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.app.model.Record;
@Repository
public interface RecordRepository extends JpaRepository<Record,Long>{
}
