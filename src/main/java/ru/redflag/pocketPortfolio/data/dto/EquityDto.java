package ru.redflag.pocketPortfolio.data.dto;

import lombok.Builder;
import lombok.Data;
import ru.redflag.pocketPortfolio.data.enums.Currency;
import ru.redflag.pocketPortfolio.data.enums.EquityArea;
import ru.redflag.pocketPortfolio.data.enums.Exchange;

@Data
@Builder
public class EquityDto {

    private String id;
    private Exchange stockExchange;
    private String ticker;
    private EquityArea equityArea;
    private String country;
    private Currency equityCurrency;

}
