package kr.co.lrlibrary.module.file.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Entity
@Table(name = "Files")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class File {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String originalName;
    private String extension;
    private Long size;
    private String fileUrl;

    @CreationTimestamp
    private LocalDateTime createDate;

}
