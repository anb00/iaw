package com.iesemilidarder.anicolau.resolution.web.commands;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.*;
import java.util.Date;

@Setter
@Getter
@NoArgsConstructor
public class OrderCommand {
    
	private Long id;
    
    @NotBlank
    @Size(min = 3, max = 255)
    private String description;
    
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @PastOrPresent
    private Date date;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    @Min(1)
    @Max(1000)
    private Double total;
}