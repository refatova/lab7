package refatova.client;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class UserNotFoundException_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  public static void deserialize(SerializationStreamReader streamReader, refatova.client.UserNotFoundException instance) throws SerializationException {
    
    com.google.gwt.user.client.rpc.core.java.lang.RuntimeException_FieldSerializer.deserialize(streamReader, instance);
  }
  
  public static refatova.client.UserNotFoundException instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new refatova.client.UserNotFoundException();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, refatova.client.UserNotFoundException instance) throws SerializationException {
    
    com.google.gwt.user.client.rpc.core.java.lang.RuntimeException_FieldSerializer.serialize(streamWriter, instance);
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return refatova.client.UserNotFoundException_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    refatova.client.UserNotFoundException_FieldSerializer.deserialize(reader, (refatova.client.UserNotFoundException)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    refatova.client.UserNotFoundException_FieldSerializer.serialize(writer, (refatova.client.UserNotFoundException)object);
  }
  
}
