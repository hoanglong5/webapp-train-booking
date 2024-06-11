package com.hoanglong.train_booking.base.service;

import com.hoanglong.train_booking.base.enums.GenMessage;
import com.hoanglong.train_booking.base.exception.exceptions.ItemNotFoundException;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
@Service
@RequiredArgsConstructor
public abstract class BaseEntityService<E,D extends JpaRepository<E, UUID>> {
    private final D dao;
    public D getDao(){
        return dao;
    }
    private static final Integer DEFAULT_PAGE = 0;
    private static final Integer DEFAULT_SIZE = 10;
    public List<E> FindALl(){
        return dao.findAll();
    }
    public E FindById(UUID uuid){
        return dao.findById(uuid).orElseThrow(() -> new ItemNotFoundException(GenMessage.ITEM_NOT_FOUND.getMessage()));
    }
    public E Save(E entity){
        return dao.save(entity);
    }
    public void Delete(E entity){
         dao.delete(entity);
    }
    protected Integer GetSize(Optional<Integer> sizeOptional) {
        Integer size = DEFAULT_SIZE;
        if (sizeOptional.isPresent()){
            int providedSize = sizeOptional.get();
            if(providedSize >= 0){
                size = sizeOptional.get();
            }else {
                return size;
            }
        }
        return size;
    }

    protected Integer GetPage(Optional<Integer> pageOptional) {
        Integer page = DEFAULT_PAGE;
        if (pageOptional.isPresent()){
            int providedPage = pageOptional.get();
            if(providedPage > 0){
                page = pageOptional.get();
            }else {
                return page;
            }
        }
        return page;
    }
    protected PageRequest GetPageRequest(Optional<Integer> pageOptional, Optional<Integer> sizeOptional) {
        Integer page = GetPage(pageOptional);
        Integer size = GetSize(sizeOptional);
        PageRequest pageRequest = PageRequest.of(page, size);
        return pageRequest;
    }
}
