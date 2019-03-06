package com.postgresql.optadb.Repository;

import com.postgresql.optadb.model.optadb.TTechnicien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface T_technicienRepository extends JpaRepository<TTechnicien,Long> {
}
