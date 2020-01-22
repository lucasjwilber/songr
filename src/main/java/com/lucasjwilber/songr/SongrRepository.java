package com.lucasjwilber.songr;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SongrRepository extends JpaRepository<Album, Long> {
}
