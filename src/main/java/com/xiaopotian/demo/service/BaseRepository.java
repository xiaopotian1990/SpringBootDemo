package com.xiaopotian.demo.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.io.Serializable;

/**
 * 基Repository
 * Created by zoulu on 2018-01-15.
 */
public interface BaseRepository<T> extends JpaRepository<T,Long>,JpaSpecificationExecutor<T>,Serializable {
}
