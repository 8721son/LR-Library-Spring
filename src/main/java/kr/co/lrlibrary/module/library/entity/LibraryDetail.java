package kr.co.lrlibrary.module.library.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Entity
@Table(name = "LibraryDetails")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class LibraryDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne(fetch = FetchType.EAGER, targetEntity = Library.class)
    @JoinColumn(name = "library_id", referencedColumnName = "id")
    private Library library;
    private Integer sequence;
    private String type;
    private String content;
    private String file;

    private Double gpsX;
    private Double gpsY;

    @CreationTimestamp
    private LocalDateTime createDate;
    @UpdateTimestamp
    private LocalDateTime updateDate;
}
