package com.nitzbits.repository;

import com.nitzbits.model.ImageTextModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImageTextRepository extends JpaRepository<ImageTextModel, Long> {
}
