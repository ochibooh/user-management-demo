package com.ochibooh.demo.rmd.repo;import com.ochibooh.demo.rmd.model.User;import org.springframework.data.jpa.repository.JpaRepository;import org.springframework.stereotype.Repository;@Repositorypublic interface UserRepository extends JpaRepository<User, Long> {}