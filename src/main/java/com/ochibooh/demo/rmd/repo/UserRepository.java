package com.ochibooh.demo.rmd.repo;import com.ochibooh.demo.rmd.model.User;import org.springframework.data.jpa.repository.JpaRepository;import org.springframework.lang.NonNull;import org.springframework.stereotype.Repository;import java.util.Optional;@Repositorypublic interface UserRepository extends JpaRepository<User, Long> {    Optional<User> findByEmail(@NonNull String e);}