package com.yash.igalleryapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.yash.igalleryapp.models.Image;

@Repository
public interface ImageRepository extends JpaRepository<Image, Long> {

}
