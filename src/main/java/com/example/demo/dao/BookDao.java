package com.example.demo.dao;

import org.springframework.stereotype.Service;

import java.util.Optional;
import com.example.demo.model.*;

import org.springframework.data.repository.CrudRepository;
import com.example.demo.model.Book;

@Service
public interface BookDao extends CrudRepository<Book, Long>{

	

}
