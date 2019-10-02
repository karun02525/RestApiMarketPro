package com.marketpro.user.service.category;

import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

public interface CategoryService{
     ResponseEntity<?> categorySave(String category_name, MultipartFile category_avatar);
     ResponseEntity<?> findAllCategory();
     ResponseEntity<?> findByCategory(String category_id);
     ResponseEntity<?> getPhoto(String path) throws IOException;
     ResponseEntity<?> removeCategoryAvatar(String avatar_key);
     ResponseEntity<?> updateCategory(String category_id, String category_name, MultipartFile category_avatar);
}