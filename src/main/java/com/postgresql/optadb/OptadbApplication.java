package com.postgresql.optadb;

import com.postgresql.optadb.Repository.T_technicienRepository;
import com.postgresql.optadb.model.optadb.TTechnicien;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Optional;

@SpringBootApplication
public class OptadbApplication implements CommandLineRunner {

	public static void main(String[] args)  {
		SpringApplication.run(OptadbApplication.class, args);
	}

	@Autowired
	private T_technicienRepository t_technicienRepository;
	@Override
	public void run(String... args) throws Exception {

		Optional<TTechnicien>t=t_technicienRepository.findById(21803L);
	}
}
