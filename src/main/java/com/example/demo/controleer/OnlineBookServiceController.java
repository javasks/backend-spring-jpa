package com.example.demo.controleer;

import com.example.demo.dto.OnlineBookStoreDTO;
import com.example.demo.entity.OnlineBookStore;
import com.example.demo.exception.BookNotFoundException;
import com.example.demo.exception.CustomeExcep;
import com.example.demo.service.OnlineBookStoreService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RequestMapping("/books")
@RestController
public class OnlineBookServiceController {

    @Autowired
    OnlineBookStoreService onlineBookStoreService;

    @Autowired
    ModelMapper modelMapper;

    @GetMapping("/all")
    public ResponseEntity getAllBooks() {
        List<OnlineBookStore> onlineBookStoreList = onlineBookStoreService.getAllBooks();
        return new ResponseEntity(onlineBookStoreList, HttpStatus.OK);
    }

    @GetMapping("{name}")
    public ResponseEntity getBookByAutherName(@PathVariable(name = "name") String name) throws BookNotFoundException {

        OnlineBookStore onlineBookStore = onlineBookStoreService.getBookByAutherName(name);
        OnlineBookStoreDTO onlineBookStoreDTO = convertToDTO(onlineBookStore);
        return new ResponseEntity(onlineBookStoreDTO, HttpStatus.OK);
    }

    private OnlineBookStoreDTO convertToDTO(OnlineBookStore onlineBookStore) {
        OnlineBookStoreDTO onlineBookStoreDTO = modelMapper.map(onlineBookStore, OnlineBookStoreDTO.class);
        return onlineBookStoreDTO;
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity publishBook( @Valid @RequestBody OnlineBookStoreDTO onlineBookStoreDTO) {
            String firstName=null;
            //firstName.length();
            if(firstName==null)
                throw new CustomeExcep("firstname is null");

        OnlineBookStore onlineBookStore = modelMapper.map(onlineBookStoreDTO, OnlineBookStore.class);
        OnlineBookStore onlineBookStore1 = onlineBookStoreService.publishNewBook(onlineBookStore);
        OnlineBookStoreDTO onlineBookStoreDTO1 = modelMapper.map(onlineBookStore1, OnlineBookStoreDTO.class);
        return new ResponseEntity(onlineBookStoreDTO1, HttpStatus.CREATED);
    }


    @DeleteMapping("{id}")
    public ResponseEntity deleteBook(@PathVariable(name = "id") Long id) {
        onlineBookStoreService.deleteBook(id);
        return new ResponseEntity("Deleted", HttpStatus.OK);
    }

    @PutMapping("{id}")
    public ResponseEntity updateBook(@PathVariable(name = "id") Long id){
        onlineBookStoreService.updateBook(id);
        return new ResponseEntity("Updated", HttpStatus.ACCEPTED);
    }


/*
 @PutMapping(value = "/upd/{id}",
         produces = MediaType.APPLICATION_JSON_VALUE,
         consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity updateBook(@RequestBody OnlineBookStoreDTO onlineBookStoreDTO,
                                     @PathVariable (name ="id") Long id) throws BookNotFoundException {

        OnlineBookStore savedOnlineBookStore=onlineBookStoreService.getBookDetails(id);
        OnlineBookStore toBeUpdatedOnlineBookStore1=modelMapper.map(onlineBookStoreDTO,OnlineBookStore.class);

        onlineBookStoreService.updateBook(id);
        return new ResponseEntity(HttpStatus.ACCEPTED);

 }*/

   /* @PutMapping(value = "/{id}")
    public ResponseEntity updateBook(@PathVariable(name = "id") Long id) {
        onlineBookStoreService.updateBook(id);
        return new ResponseEntity("Updated", HttpStatus.ACCEPTED);
    }*/

}
