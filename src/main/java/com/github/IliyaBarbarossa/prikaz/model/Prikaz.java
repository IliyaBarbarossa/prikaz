package com.github.IliyaBarbarossa.prikaz.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "prikazi")
public class Prikaz {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    int nomber;
}
