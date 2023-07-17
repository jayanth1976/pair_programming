package com.example.pair_programming.dto;

import com.example.pair_programming.entity.Customer;
import com.example.pair_programming.entity.Order;
import com.example.pair_programming.entity.Product;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class OrderDTO {
    private int id;
    private Customer customerId;
    private List<Product> products;

    @Autowired
    private static ModelMapper modelMapper;

    static{
        modelMapper = new ModelMapper();
    }

    public static Order convertDtoToEntity(OrderDTO orderDTO){
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.LOOSE);
        return modelMapper.map(orderDTO,Order.class);
    }
    public static OrderDTO convertEntityToDto(Order order){
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.LOOSE);
        return modelMapper.map(order,OrderDTO.class);
    }
}
