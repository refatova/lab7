package client.mvp;

import com.google.gwt.place.impl.AbstractPlaceHistoryMapper;
import client.mvp.AppPlaceHistoryMapper;
import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;
import com.google.gwt.place.impl.AbstractPlaceHistoryMapper.PrefixAndToken;
import com.google.gwt.core.client.GWT;

public class AppPlaceHistoryMapperImpl extends AbstractPlaceHistoryMapper<Void> implements AppPlaceHistoryMapper {
  
  protected PrefixAndToken getPrefixAndToken(Place newPlace) {
    if (newPlace instanceof client.place.HomePlace) {
      client.place.HomePlace place = (client.place.HomePlace) newPlace;
      PlaceTokenizer<client.place.HomePlace> t = GWT.create(client.place.HomePlace.Tokenizer.class);
      return new PrefixAndToken("HomePlace", t.getToken((client.place.HomePlace) place));
    }
    return null;
  }
  
  protected PlaceTokenizer<?> getTokenizer(String prefix) {
    if ("HomePlace".equals(prefix)) {
      return GWT.create(client.place.HomePlace.Tokenizer.class);
    }
    return null;
  }

}
