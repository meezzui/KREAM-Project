package com.project.kream.Model.Entity;

import com.project.kream.Model.enumclass.Category;
import com.project.kream.Model.enumclass.PostStatus;
import com.project.kream.Model.enumclass.SubCategory;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
@SequenceGenerator(
        name="seq_product",
        sequenceName = "seq_product",
        initialValue = 1,
        allocationSize = 1
)
public class Product extends DateEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_product")
    private Long id;
    private String brand;
    private String collection;
    private String name;
    private String korName;
    private String gender;
    private String release;
    private Long releasePrice;
    private String modelNumber;
    private String color;

    @Enumerated(EnumType.STRING)
    private Category category;

    @Enumerated(EnumType.STRING)
    private SubCategory subCategory;

    @Enumerated(EnumType.STRING)
    private PostStatus postStatus;

    @OneToMany(fetch=FetchType.LAZY ,mappedBy = "product", cascade = CascadeType.ALL,orphanRemoval=true)
    private List<Purchase> purchaseList;

    @OneToMany(fetch=FetchType.LAZY ,mappedBy = "product", cascade = CascadeType.ALL,orphanRemoval=true)
    private List<Sales> salesList;

    @OneToMany(fetch=FetchType.LAZY ,mappedBy = "product",cascade = CascadeType.ALL,orphanRemoval=true)
    private List<ProImg> proImgList;

    @OneToMany(fetch=FetchType.LAZY ,mappedBy = "product",cascade = CascadeType.ALL,orphanRemoval=true)
    private List<ProSize> proSizeList;


}
