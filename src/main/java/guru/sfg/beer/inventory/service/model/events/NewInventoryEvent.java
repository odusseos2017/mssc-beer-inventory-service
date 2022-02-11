package guru.sfg.beer.inventory.service.model.events;

import guru.sfg.beer.inventory.service.web.model.BeerDto;
import lombok.NoArgsConstructor;

/**
 * Created by jt on 2019-07-21.
 */
@NoArgsConstructor
public class NewInventoryEvent extends BeerEvent {

	private static final long serialVersionUID = -4531768104235660280L;

	public NewInventoryEvent(BeerDto beerDto) {
        super(beerDto);
    }
}