package com.yash.igalleryapp.controllers;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.yash.igalleryapp.models.Image;
import com.yash.igalleryapp.repositories.ImageRepository;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/v1/images")

public class ImageController {

	@Autowired
	private ImageRepository imageRepository;

	@GetMapping
	public List<Image> list() {
		// List<Image> images = new ArrayList<>();
		// return images;
		return imageRepository.findAll();
	}

	@PostMapping
	public Image create(@RequestBody Image image) {
		return imageRepository.save(image);
	}

	@GetMapping("/{id}")
	public Image get(@PathVariable("id") long id) {
		// return new Image();
		// return imageRepository.getOne(id);
		return imageRepository.findById(id).get();
	}

	// Delete images
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deleteImage(@PathVariable Long id) {
		imageRepository.deleteById(id);
		return ResponseEntity.noContent().build();

	}
	
	
	// edit/update the image
	@PutMapping("/{id}")
	public ResponseEntity<Image> updateImage(
			@PathVariable long id,
			@RequestBody Image image){
		
		Image updatedImage = imageRepository.save(image);
		return new ResponseEntity<Image>(updatedImage,HttpStatus.OK);
	}


// create Image
//	@PostMapping()
//	public ResponseEntity<Void> updateImage(@RequestBody Image image) {
//
//		Image createdImage = imageRepository.save(image);
//		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(createdImage.getId())
//				.toUri();
//		return ResponseEntity.created(uri).build();
//	}

}
