package com.file.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

@Table(name = "assignment")
public class Assignment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long fileId;

    @Column(name = "fileName", columnDefinition = "varchar(50)")
    private String fileName;

    @Column(name = "fileContent", columnDefinition = "LONGBLOB")
    private byte[] fileContent;
}
