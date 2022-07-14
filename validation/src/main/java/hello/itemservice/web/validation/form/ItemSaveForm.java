package hello.itemservice.web.validation.form;

import lombok.Data;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
public class ItemSaveForm {
    //저장시 id 필요X
    @NotBlank
    private String itemName;
    @NotNull
    @Range(min=1000, max=1000000)
    private Integer price;
    @NotNull
    @Max(1000)
    private Integer quantity;
}
