// NOTE: This example uses the next generation Twilio helper library - for more
// information on how to download and install this version, visit
// https://www.twilio.com/docs/libraries/java
import com.twilio.sdk.Twilio;
import com.twilio.sdk.creator.notifications.v1.service.BindingCreator;
import com.twilio.sdk.resource.notifications.v1.service.Binding;

public class CreateBinding {
  // Find your Account Sid and Token at twilio.com/user/account
  public static final String ACCOUNT_SID = "{{ account_sid }}";
  public static final String AUTH_TOKEN = "{{ auth_token }}";

  public static void main(String args[]) {
    // Initialize the client
    Twilio.init(ACCOUNT_SID, AUTH_TOKEN);

    // Create a binding
    BindingCreator creator = Binding.create("ISxxx", "xxx", "Bob", Binding.BindingType.GCM, "xxx");
    creator.setTag("premium");
    Binding binding = creator.execute();
    System.out.println(binding.toString());
  }
}